package Collection.ArrayList;

import java.util.ArrayList;

public class Firstal {
    public static void main(String args[]){

        ArrayList<String> al= new ArrayList<>();
        // inserting elements
        al.add("Java");
        al.add("Python");
        al.add("ai/ml");
        al.add("Shell");
        System.out.println(al);

        // accessing the arraylist element
        System.out.println(al.get(2));

    }
}
