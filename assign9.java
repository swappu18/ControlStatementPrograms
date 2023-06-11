import java.util.Scanner;

public class assign9 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of class Held " );
        int numberOfClassHeld= scanner.nextInt();
        System.out.println("enter number of class Attended " );
        float numberOfClassAttended = scanner.nextInt();
        float percentage =(numberOfClassAttended/numberOfClassHeld)*100;
        System.out.println("your Attendance is " +percentage+"%");

        if(percentage>=75){
            System.out.println("so you are allow to give the exam");

        }else{
            System.out.println("Your attendance is below 75%. Do you have any medical cause for your low attendance");
            String medicalCause= scanner.next();

        if( medicalCause.equalsIgnoreCase("yes"))
        {
            System.out.println("so you are allow to give the exam");

        }
        else
        {
            System.out.println("so you are not allow to give the exam");

        }}






    }
}
