package Encapsulation;

/*
class Employee{
    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class EmpApp {

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(1);
        e.setName("Roy");
        System.out.println(e.getId()+ "\t" +e.getName());
    }
}
*/


class Employee{

    private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

public class EmpApp
{
    public static void main(String args[]){
        Employee e=new Employee();
        e.setId(1);
        e.setName("Roo");

        System.out.println(e.getId() +"\t" +e.getName());
    }
}
