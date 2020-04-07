package zlj.testException;

import java.util.Scanner;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class testExceptionDemo2 {
    public static void main(String[] args) {
        try {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            int i = sc1.nextInt();
            int j = sc2.nextInt();
            ecm(i,j);
        } catch (NumberFormatException e) {
            System.out.println("输入数据类型不一致");
        }catch (ArithmeticException e){
            System.out.println("分母为0了");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }
    }

    static void ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0) {
            throw new EcDef("输入值不能为负数");
        }
        else {
            System.out.println(i/j);
        }
    }
}

class EcDef extends Exception {
    public EcDef() {

    }

    public EcDef(String msg) {
        super(msg);
    }
}