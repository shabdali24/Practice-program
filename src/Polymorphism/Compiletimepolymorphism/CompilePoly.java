package Polymorphism.Compiletimepolymorphism;
/*Note : here is compiletime polymorphism are done because here method overriding is happen
* its is also called dynamic buynding/late buylind
* here java is create object at runtime it resolve which method to call.
*
* */
class Animal{
    void speak(){
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Dog barksss");
    }
}

class Cat extends Animal{
    @Override
    void speak() {
        // super.speak();
        System.out.println("Cats Meowwwww");
    }
}

public class CompilePoly {
    public static void main(String[] args) {

        Animal Dog=new Dog();
        Dog.speak();
        Animal Cat=new Cat();
        Cat.speak();
    }
}
