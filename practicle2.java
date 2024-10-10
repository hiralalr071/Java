import java.util.Scanner;
public class practicle2 {
    public static int fact(int fact){
      
        int factvalue = 1;

        if (fact == 1){
            return fact;
        }
        for(int i=1; i<=fact; i++){
            factvalue = factvalue * i;
        }
        return factvalue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number :");
        int number = sc.nextInt();

        int factorial =fact(number);
        System.out.println("The Factorial is "+factorial);
    }
    
}
