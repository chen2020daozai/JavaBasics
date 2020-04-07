import java.util.Objects;

/**
 * @Classname MyException
 * @Date 2020/3/25 15:46
 * @Created by 陈刀仔
 * @Description TODO
 */

public class Person implements Comparable {
    private Integer age;
    private String name;

    public Person() {

    }

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //重写equals()方法
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(age, person.age) &&
//                Objects.equals(name, person.name);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }

    @Override
    /*
        自然排序方法
     */
    public int compareTo(Object o) {
        if (o instanceof Person) {
            int i = this.age.compareTo(((Person) o).age);
            return (i == 0) ? (this.name.compareTo(((Person) o).name)) : i;
        }
        return 0;
    }


}
