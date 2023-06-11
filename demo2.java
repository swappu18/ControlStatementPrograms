import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        double num ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value");
        num= scanner.nextDouble();

        if (100<=num)
        {
            System.out.println(" i am pass");
        }
        System.out.println("i am fail");
    }

}
