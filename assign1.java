import java.util.Scanner;

public class assign1 {
    public static void main(String[] args) {
        int length,breadth;
        System.out.println("length ");
        System.out.println("breadth");
        Scanner scan=new Scanner(System.in);
       length = scan.nextInt();
       breadth = scan.nextInt();

       if(length==breadth)
       {
           System.out.println("it is Square");
       }
       else
       {
           System.out.println("it is not Square");
       }


    }
}
