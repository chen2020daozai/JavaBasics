package zlj.testException;

/**看好执行顺序
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 *
 */

public class testExceptionDemo {
    private static void method1(){
        try {
            System.out.println("进入method1");
            throw new RuntimeException("制造异常");
            //unrachable statement
//            System.out.println("000");
        }finally {
            System.out.println("method1的finally");
        }
    }
    private static void method2(){
        try {
            System.out.println("进入method2");
            return;
        }finally {
            System.out.println("method2的finally");
        }
    }
    private static int method3(){
        try {
            System.out.println("进入method3");
            return 1;
        }finally {
            System.out.println("method3的finally");
            return 2;
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        method2();
    }
}
