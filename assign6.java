import java.util.Arrays;
import java.util.Scanner;

public class assign6 {
    public static void main(String[] args) {
     int age;
     int p1;
     int p2;
     int p3;
        System.out.println("enter age of three people" );
        Scanner scan=new Scanner(System.in);
        age= scan.nextInt();
        p1= scan.nextInt();
        p2= scan.nextInt();
        p3= scan.nextInt();

        if(p1>p2 && p1>p3 )
        {
            System.out.println("p1 is older");

        }
        else
        {
            System.out.println("p1 is younger");
        }
        if(p2>p1 && p2>p3)
        {
            System.out.println("p2 is younger");
        }
        else
        {
            System.out.println("p2 is older");
        }
        if(p3>p1 && p3>p2)
        {
            System.out.println("p3 is younger");
        }
        else
        {
            System.out.println("p3 is older");
        }
    }
}
