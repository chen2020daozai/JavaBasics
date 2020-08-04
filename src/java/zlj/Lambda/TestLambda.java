package zlj.Lambda;

/**
 * @Classname TestLanbda
 * @Date 2020/8/3
 * @Created by 陈刀仔
 * @Description TODO
 */

public class TestLambda {
    //静态内部类
    static class Like2 implements ILike{
        public void like() {
            System.out.println("静态内部类");
        }
    }

    public static void main(String[] args) {
        ILike like=new Like();
        like.like();

        like=new Like2();
        like.like();

        //局部内部类
        class Like3 implements ILike{
            public void like() {
                System.out.println("局部内部类");
            }
        }

        like=new Like3();
        like.like();

        like=new ILike() {
            public void like() {
                System.out.println("匿名内部类");
            }
        };
        like.like();

        like=()->{
            System.out.println("lambda表达式");
        };
        like.like();
    }
}

//函数式接口
interface ILike{
    void like();
}

//实现类
class Like implements ILike{
    public void like() {
        System.out.println("普通实现类");
    }
}