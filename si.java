import java.util.Scanner;
public class si {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT");
        int principle= scanner.nextInt();
        System.out.println("ENTER THE Rate");
        int rate= scanner.nextInt();
        System.out.println("ENTER THE time");
        int time= scanner.nextInt();
        System.out.println(principle*rate*time);
    }
}
