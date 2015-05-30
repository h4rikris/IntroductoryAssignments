import java.util.Scanner;

/**
 * Created by harikris on 30/05/15.
 */
public class DriverProgram {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Integer size = in.nextInt();
        Shape s;
        System.out.println("*");
        System.out.println("Horizontal Line");
        s = new HorizontalLine(size);
        s.draw();
        System.out.println("Vertical Line");
        s = new VerticalLine(size);
        s.draw();
        System.out.println("Right Triangle");
        s = new RightTriangle(size);
        s.draw();
        System.out.println("Isosceles Triangle");
        s = new IsoscelesTriangle(size);
        s.draw();
        System.out.println("Diamond");
        s = new Diamond(size);
        s.draw();
        System.out.println("Diamond With Name");
        s = new DiamondWithName(size);
        s.draw();
        System.out.println("FizzBuZZ");
        Utils.generateFizzBuzz();
        System.out.print("Enter Number:");
        int n=in.nextInt();
        System.out.println("Prime Factors for " + n);
        Utils.generatePrimeFactors(n);
    }

}
