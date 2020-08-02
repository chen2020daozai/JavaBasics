package reflect;

import org.junit.Test;
import test.User;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @Classname Test11
 * @Date 2020/8/2
 * @Created by 陈刀仔
 * @Description TODO
 */

//泛型
public class Test11 {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test11.class.getDeclaredMethod("test0", List.class);

        Type[] types = method.getGenericParameterTypes();
        for (Type type : types) {
            System.out.println(type);

            if (type instanceof ParameterizedType){
                Type[] actualTypeArguments;
                //获得真实类型，User
                actualTypeArguments =  ((ParameterizedType) type).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
    }

    @Test
    public void test0(List<User> list){
        System.out.println("test0的list");
    }
}
