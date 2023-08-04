import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String evenOdd = number % 2 == 0 ? "even" : "odd";
        System.out.println("The number is " + evenOdd);
    }
}



// public class evenodd {
//     public static void main(String[] args) {
//         int number=29;
//         String status = number%2==0?" is even":" is odd";
//         System.out.println(number+status);
    
//     }
// }
