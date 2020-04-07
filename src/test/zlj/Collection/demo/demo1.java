package zlj.Collection.demo;

import java.util.*;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 * <p>
 * 每个键值对是一个List元素
 */

public class demo1 {
    public static void main(String[] args) {
        HashMap stu = new HashMap();
        stu.put("lm", 95);
        stu.put("yn", 92);
        stu.put("hyz", 90);
        HashMap resultMap = sortByValue(stu);
        System.out.println(resultMap);
        Set resultSet = resultMap.keySet();
        Iterator iterator = resultSet.iterator();
        int i = 3;
        while (i > 0) {
            i--;
            System.out.println(iterator.next());
        }
    }

    public static HashMap sortByValue(HashMap oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
                oriMap.entrySet());

        Collections.sort(entryList, new valueComparator());

        Iterator<Map.Entry<String, Integer>> iter = entryList.iterator();
        Map.Entry<String, Integer> tmpEntry = null;
        while (iter.hasNext()) {
            tmpEntry = iter.next();
            sortedMap.put(tmpEntry.getKey(), tmpEntry.getValue());
        }
        return sortedMap;
    }


}

class valueComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> me1, Map.Entry<String, Integer> me2) {
        return -me1.getValue().compareTo(me2.getValue());
    }
}