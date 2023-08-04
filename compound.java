import java.util.Scanner;
import java.lang.Math;
public class compound {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
            System.out.println("ENTER THE PRINCIPLE AMOUNT");
            int principle= scanner.nextInt();
            System.out.println("ENTER THE Rate");
            int rate= scanner.nextInt();
            System.out.println("ENTER THE time");
            int time= scanner.nextInt();
            int ans= rate/100 + 1;
            ans = (int)Math.pow(ans, time)*principle;
            System.out.println(ans);
        }
    }

