import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("a = ");
        float a = in.nextFloat();
        System.out.println("b = ");
        float b = in.nextFloat();
        System.out.println("c = ");
        float c = in.nextFloat();

        float delta = b*b - 4*a*c;

        boolean negativeDelta = delta < 0;

        if (negativeDelta) {
            double d = Math.sqrt(Math.abs(delta));

            System.out.printf("x' = (- %f + %f * i)/ %f \n", a,d,c);
            System.out.printf("x'' = (- %f + %f * i)/ %f \n", a,d,c);

        } else {
            double d = Math.sqrt(delta);
            double x1 = (-b + d)/c;
            double x2 = (-b - d)/c;

            System.out.printf("x' = %f \n", x1);
            System.out.printf("x'' = %f \n", x2);
        }
    }
}