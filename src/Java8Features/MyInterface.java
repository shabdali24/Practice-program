package Java8Features;

@FunctionalInterface
public interface MyInterface {
    public  void sayHello();

    default void sayBye(){

    };

    static void sayOk(){

    };
}
