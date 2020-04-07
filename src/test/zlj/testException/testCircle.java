package zlj.testException;

/**
 * @Classname testCircle
 * @Description TODO
 * @Date 2020/3/24 21:51
 * @Created by 陈刀仔
 */

public class testCircle {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.setR(5);
        String c2 = "0";
        try {
            System.out.println(c1.compareTo(c2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class circle {
    int r;

    circle() {

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int compareTo(Object c) throws Exception {
        if (this == c) {
            return 0;
        } else if (c instanceof circle) {
            if (this.r > ((circle) c).getR()) {
                return 1;
            } else if (this.r < ((circle) c).getR()) {
                return -1;
            }
        } else {
            throw new Exception("不是圆");
        }
        throw new Exception("不是圆");
    }
}
