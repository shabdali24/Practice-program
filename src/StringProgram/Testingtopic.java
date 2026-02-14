package StringProgram;

public class Testingtopic {

    public static void main(String[] args) {

        String s= new String ("ram");
        String s1=new String ("ram");
        if(s==s1){
            System.out.println("true");
        }else{
            System.out.println("false");}
        System.out.println("equals:" + s.equals(s1));
    }
    }