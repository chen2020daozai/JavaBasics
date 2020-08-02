package reflect;

import org.junit.Test;
import test.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Classname Test10
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

//性能
public class Test10 {
    @Test
    public void test0() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user=new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName");
        getName.setAccessible(false);//关闭检测，时间更快


        Object invoke = getName.invoke(user);



        System.out.println(invoke);
    }
}
