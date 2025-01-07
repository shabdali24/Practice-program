/*
 Reverse a string using iterator method().
 */
package StringProgram;

public class ReversiterM {
    public static void main(String[] args) {

        String s="My java";
        char[] sArray= s.toCharArray();

        for(int i=sArray.length-1;i>=0;i--){
            System.out.print(sArray[i]);
        }
    }
}
