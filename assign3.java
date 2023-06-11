import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        System.out.println("enter cost and quantity");
        Scanner scanner=new Scanner(System.in);
        int cost= scanner.nextInt();
        int quantity= scanner.nextInt();
        int billAmount= cost*quantity;
        float discountAmount= 0f;

        if(billAmount > 10000)
        {
            discountAmount=billAmount *  0.10f;
        }
        float finalBillAmount=billAmount - discountAmount;
        System.out.println("total bill amount"+billAmount);
        System.out.println("discount amount"+discountAmount);
        System.out.println("Final payable amount"+finalBillAmount);
    }
}
