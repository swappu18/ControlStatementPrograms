import java.util.Scanner;

public class assign4 {
    public static void main(String[] args) {
        System.out.println(" year   ");
        Scanner scanner=new Scanner(System.in);
        int year= scanner.nextInt();
        System.out.println("enter your salary");
        int salary= scanner.nextInt();

        if(year>=5)
        {
            System.out.println("you will get bonus"+(salary*50/100));

        }
        else
        {
            System.out.println("you won`t get bonus");

        }
    }
}


