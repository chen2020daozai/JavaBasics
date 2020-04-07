package zlj.basics.swap;

/**
 * @Classname referenceType
 * @Description TODO
 * @Date 2020/3/17 下午6:00
 * @Created by 陈刀仔
 */
public class referenceType {
    public static void main(String[] args) {
        referenceType rt = new referenceType();
        data d = new data();


        System.out.println("i=" + d.i + " j=" + d.j);
        rt.swap(d);
        System.out.println("i=" + d.i + " j=" + d.j);
    }

    //形参d是实参d的地址
    public void swap(data d) {
        int t = d.i;
        d.i = d.j;
        d.j = t;
    }
}

class data {
    int i = 5;
    int j = 10;
}