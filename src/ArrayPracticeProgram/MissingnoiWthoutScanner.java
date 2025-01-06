package ArrayPracticeProgram;

public class MissingnoiWthoutScanner {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 6};
        int n=a.length+1;
        int sum = (n*(n+1))/ 2;
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
        }
        System.out.println("missing no is: " +sum);
    }
}
