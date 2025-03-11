package Collection.List;

public class Block {
    Block(String abc){
        System.out.println("parameterize constructor");
    }
    public void abc(){
        System.out.println("class method");
    }
    public static void b1(){
        System.out.println("static method");
    }
    static {
        System.out.println("static block");
    }
    {
        System.out.println("Instance block");
    }
    public Block(){
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        System.out.println("print block class");
        Block b=new Block();
        System.out.println("object created");

        b1();
        b.abc();
        Block b2=new Block("parametrise constructor");
        System.out.println(b2);

    }
}
