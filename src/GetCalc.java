import java.awt.*;
import java.util.Scanner;

public class GetCalc implements Calculate {
    int number;
    int number2;
    model model=new model();
    Scanner input = new Scanner(System.in);

    public GetCalc() {
    }


    @Override
    public void findProduct() {
        System.out.println("Enter number1:");
        number=input.nextInt();
        System.out.println("Enter number2:");
        number2=input.nextInt();
        model.setNumber(number);
        model.setNumber2(number2);
        model.setProduct(model.getNumber(number)*model.getNumber2(number2));
        System.out.println("Product is:"+ model.getProduct());
    }

    @Override
    public void findSum() {
        System.out.println("Enter number1:");
        number=input.nextInt();
        System.out.println("Enter number2:");
        number2=input.nextInt();
        model.setNumber(number);
        model.setNumber2(number2);
        model.setSum(model.getNumber(number)+ model.getNumber2(number2));
        System.out.println("Product is:"+ model.getSum());
    }

    @Override
    public void findQuotient() {
        System.out.println("Enter number1:");
        number=input.nextInt();
        System.out.println("Enter number2:");
        number2=input.nextInt();
        model.setNumber(number);
        model.setNumber2(number2);
        model.setQuotient(model.getNumber(number)/ model.getNumber2(number2));
        System.out.println("Product is:"+ model.getQuotient());

    }

    @Override
    public void findDifference() {
        System.out.println("Enter number1:");
        number=input.nextInt();
        System.out.println("Enter number2:");
        number2=input.nextInt();
        model.setNumber(number);
        model.setNumber2(number2);
        model.setDifference(model.getNumber(number)- model.getNumber2(number2));
        System.out.println("Product is:"+ model.getDifference());
    }


}
