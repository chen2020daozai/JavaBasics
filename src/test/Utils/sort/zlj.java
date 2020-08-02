package Utils.sort;

/**
 * @Classname zlj
 * @Date 2020/7/27
 * @Created by 陈刀仔
 * @Description TODO
 */

public class zlj {
    public static void main(String[] args) {
        lll lll=new lll(1);
        lll.print();
    }
}

class lll{
    int l;

    public lll(int l) {
        this.l = l;
    }

    public void print(){
        System.out.println(l);
        System.out.println(this.l);
    }
}
