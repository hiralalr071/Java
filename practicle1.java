import java.util.Scanner;

public class practicle1 {
    //This Function Is The Print Of Fibbonacci Series
    public static void fibo(int term){
        int num1,num2,sum;
        num1 = 0;
        num2 = 1;
        sum = 0;
        System.out.print(num1+","+num2);
        
        //While The Calculate The Next Term
        while(term > 2){
            sum = num1 + num2;
            System.out.print(","+sum);
            num1 = num2;
            num2 = sum;
            term --;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Term :");
        int term = sc.nextInt();

        fibo(term);

    }
}