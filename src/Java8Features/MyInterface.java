package Java8Features;

@FunctionalInterface
public interface MyInterface {
    public  void sayHello();

    default void sayBye(){

        System.out.println("Say hi");

    }

    static void sayOk(){

    };
}
