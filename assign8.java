import javax.swing.*;
import java.util.Scanner;

public class assign8 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter number of class Held " );
        float numberOfClassHeld = scanner.nextFloat();
        System.out.println("enter number of class Attended " );
        float numberOfClassAttended = scanner.nextFloat();
        float percentage =(numberOfClassAttended/numberOfClassHeld)*100;
        System.out.println("your Attendance is " +percentage+"%");
        if(percentage>75)
        {
            System.out.println("so you are allow to give the exam");

        }
        else {
            System.out.println("so you are not allow to give the exam");

        }

    }
}
