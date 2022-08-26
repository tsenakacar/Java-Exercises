import java.util.Scanner;

public class TaxCalculatorProgram {

    public static void main(String[] args) {
        double tax =1.8;
        Scanner input= new Scanner(System.in);
        System.out.println("Tax-free price of the product");
        double value=input.nextDouble();
        System.out.println("Taxed price of the product");
        double taxedprice= ((value*tax)/10)+value;
        System.out.println(taxedprice);
    }
    
}
