package zlj.testException;

import java.io.IOException;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 *
 * 编译看左边，没有IOException就执行，但是执行的时候看右边，如果B的异常是父类，就catch不了
 */

public class testOverrideMethodException {
    A a=new B();

}

class A {
    public void aa() throws IOException {

    }
}

class B extends A {
    //    public void aa() throws Exception {
//
//    }
    public void aa() throws IOException {

    }
}