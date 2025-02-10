package Polymorphism.Runtimepolymorphism;

/* here we done the method overloading is responsiable for runtimepolymorphism
   methodoverloading means same method name but diffrent parameter list, diff. datatype
   and method arguments in short difrent method signature.
   Rule:
   The number,type or order must be different.
   * number : add(int a) vs add(int a, int b)
   * type  : add(int a) vs add(double a)
   * order:add(int a, double b) vs (double a, int b)

   return type doesnt matter
   *void show(){ } // vaild
   int show(){  } // compile time error for duplicate method
* */
class Theatores{
    void bookTickets(Integer Count){
        System.out.println("Booked " + Count + " tickets");
    }
    void bookTickets(Integer Count, String SeatType){
        System.out.println("Booked " + Count + " " + SeatType  +  " tickets");
    }
    void bookTickets(Integer Count, String SeatType, String Discountcode){
        System.out.println("Booked " + Count + " " +  SeatType + " " + Discountcode + " "+"discount tickets");
    }
}


public class Runpoly extends Theatores{
    public static void main(String[] args) {
        Theatores t=new Theatores( );
        t.bookTickets(5);
        t.bookTickets(5,"VIP");
        t.bookTickets(7,"VIP","DIS20");


    }
}
