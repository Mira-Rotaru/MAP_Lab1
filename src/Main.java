import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        float average;  //declaring variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();  //getting the number of integers
        System.out.printf("Enter %d integers\n", n);
        for(int i=0; i<n; i++){
            int x = sc.nextInt(); //calculating sum of numbers
            sum = sum + x;
        }
        average = (float) sum / n;
        System.out.printf("Average is equal to " + average); //ouputing the previous calculated average of numbers
    }
}