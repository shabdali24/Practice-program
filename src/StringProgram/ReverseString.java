package StringProgram;

public class ReverseString {
    public static void main(String[] args) {

        String s=" Hello java";
        String r=" ";
char[] chars=s.toCharArray();
        for(int i=s.length()-1; i>=0; i--){
          r=r + chars[i];
        }
        System.out.println(r);
    }
}
