import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetCalc calc = new GetCalc();
        int choose;
        System.out.println("----------Select operation-------");
        System.out.println("1.add\n2.minus\n3.divide\n4.multiply");

        System.out.print("Enter operation:");
        choose = input.nextInt();
        if (choose == 1) {
            calc.findSum();
        } else if (choose == 2) {
            calc.findDifference();
        } else if (choose == 3) {
            calc.findQuotient();
        } else if (choose == 4) {
            calc.findProduct();
        } else {
            System.out.print("Wrong choice");

        }


    }
}
