import java.util.Scanner;

public class assign7 {
    public static void main(String[] args)
    {
        System.out.println("enter any value");
        Scanner scanner=new Scanner(System.in);
        int x = scanner.nextInt();
        if(x<0)
        {
            System.out.println("absolute value of x: %d\n" +Math.abs(x));

        }
        else {
            System.out.println("value as it is");
        }

    }
}
