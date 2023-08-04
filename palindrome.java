
    import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        String strNumber = String.valueOf(number);
        int length = strNumber.length();

        for (int i = 0; i < length / 2; i++) {
            if (strNumber.charAt(i) != strNumber.charAt(length - 1 - i)) {
                System.out.println("The number is not a palindrome.");
                return;
            }
        }

        System.out.println("The number is a palindrome.");
    }
}


