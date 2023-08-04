import java.util.Scanner;

public class numberdivisible {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter the number:");
         int x= scanner.nextInt();
        
         if(x%3==0 && x%5==0)
         System.out.println("it is divisible by both 3 and 5");
    }
}
