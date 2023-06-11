import java.util.Scanner;

public class assign5 {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner scanner=new Scanner(System.in);
        int marks = scanner.nextInt();

        if(marks > 80)
        {
            System.out.println("Grade=A");

        }
        if (marks>60 && marks<80)
    {
        System.out.println("Grade =B");

    }
        if(marks>=50 && marks<=60)
        {
            System.out.println("Grade =C");
        }
        if(marks<=50&& marks>=45)
        {
            System.out.println("Grade =D");
        }
        if(marks<45 && marks>=25)
        {
            System.out.println("Grade =E");
        }
        if(marks<=25)
            System.out.println("Grade =F");
        }
}
