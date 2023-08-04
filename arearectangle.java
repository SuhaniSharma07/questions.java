import java.util.Scanner;

public class arearectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.println("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        int area = width * height;

        System.out.println("The area of the rectangle is " + area);
    }
}











// public class arearectangle {
//     public static void main(String[] args) {
//         int length=10,breath=8;
//         System.out.println(length*breath);
//     }
// }
