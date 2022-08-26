import java.util.Scanner;

public class TaxCalculatorProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tax-free price of the product");
        double value = input.nextDouble();

        if (value < 1000 && value > 0) {
            double tax = 1.8;
            System.out.println("Taxed price of the product");
            double taxedprice = ((value * tax) / 10) + value;
            System.out.println(taxedprice);
        } else if (value > 1000) {

            double tax = 0.8;
            System.out.println("Taxed price of the product");
            double taxedprice = ((value * tax) / 10) + value;
            System.out.println(taxedprice);
        }
    }

}
