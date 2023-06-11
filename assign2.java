import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        int n1;//22
        int n2;//23
        System.out.println("Enter two number");
        Scanner scan=new Scanner(System.in);
        n1 =scan.nextInt();
        n2 =scan.nextInt();

        if(n1>n2) {
            System.out.println("n1 is greater");

        }
        else
        {
            System.out.println("n2 is greater");
        }
    }
}
