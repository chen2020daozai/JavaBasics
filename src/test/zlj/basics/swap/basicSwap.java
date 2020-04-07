package zlj.basics.swap;

public class basicSwap {
    public static void main(String[] args) {
        basicSwap bs=new basicSwap();//main函数是static的，所以要用对象访问swap函数

        int i=5;
        int j=10;
        System.out.println("i="+i+" j="+j);
        bs.swap(i,j);

        System.out.println("i="+i+" j="+j);
    }

    public void swap(int m,int n){
        int t=m;
        m=n;
        n=t;
    }
}
