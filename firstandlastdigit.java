
    import java.util.Scanner;

public class firstandlastdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int firstDigit = number % 10;
        int lastDigit = number;
        while (lastDigit >= 10) {
            lastDigit = lastDigit / 10;
        }

        System.out.println("The first digit is: " + firstDigit);
        System.out.println("The last digit is: " + lastDigit);
    }
}


