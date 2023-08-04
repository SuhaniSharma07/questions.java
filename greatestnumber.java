public class greatestnumber {
    public static void main(String[] args) {
        int a=10,b=25,c=15;
        int greatestNumber;

        if (a > b && a > c) {
            greatestNumber = a;
        } else if (b > a && b > c) {
            greatestNumber = b;
        } else {
            greatestNumber = c;
        }
        System.out.println("The greatest number is: " + greatestNumber);
    }
}
