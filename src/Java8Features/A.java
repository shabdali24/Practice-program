package Java8Features;

public class A implements MyInterface {

    @Override
    public void sayHello() {

    }

    public static void main(String[] args) {

        MyInterface a = new A();
        a.sayBye();

    }

}
