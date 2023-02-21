import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harmonik seri kaç elemanlıdır? ");
        int n = scanner.nextInt();

        double [] numbers = new double[n];

        double sum = 1;
        double harmonikSum = 1;
        double avarege = 0;

        for(int i = 1 ; i < (n + 1) ; i++){
            harmonikSum += (sum/ i) ;
        }
        avarege = n / harmonikSum;
        System.out.println(avarege);
    }
}