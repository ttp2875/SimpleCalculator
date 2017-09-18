import java.util.Scanner;
import javax.swing.JOptionPane;

public class SimpleCalculator {

    public static void main(String[] args) {
        //constant
        final double PI = 22/7;

        //interger
        byte x= 100; //-128  127
        short y= 30000; //-32,768  32,767
        int z= 2000000; //-2,147,483,648  2,147,483,647
        long u;
        u = 300000000000l;

        //decimal
        float v= 8.5f;
        double w=950.55;
        double num1,num2,sum,diff,product;
        int quotient, remainder;
        char letter = 'A' ;

        boolean status = false;

        //instantiation
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Enter first number ");
        num1 = keyboard.nextDouble();
        System.out.println ("Enter second number you want to get the variable values with the first number ");
        num2 = keyboard.nextDouble();
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        quotient = (int)(num1/num2);
        remainder = (int)(num1%num2);

        JOptionPane.showMessageDialog(null, "The sum is \"" + sum + "\""
                + "\n" + "The different is \"" + diff + "\""
                + "\n" + "The product is \"" + product + "\""
                + "\n" + "The quotient is \"" + quotient + "\""
                + "\n" + "The remainder is \"" + remainder + "\"");
    }
}