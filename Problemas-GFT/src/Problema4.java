import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");

        int option = in.nextInt();

        switch(option) {
            case 1:
                float f1 = getNumber(in, "Primeira nota: ");
                float f2 = getNumber(in, "Segunda nota: ");

                System.out.println("Média aritmética: " + (f1 + f2)/2);
                break;
            case 2:
                float c1 = getNumber(in, "Primeira nota: ");
                float p1 = getNumber(in, "Peso: ");
                float c2 = getNumber(in, "Segunda nota: ");
                float p2 = getNumber(in, "Peso: ");
                float c3 = getNumber(in, "Terceira nota: ");
                float p3 = getNumber(in, "Peso: ");

                System.out.println("Média ponderada: " + (c1*p1 + c2*p2 + c3*p3)/(p1 + p2 + p3));
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida");
        }
        in.close();
    }

    public static float getNumber(Scanner in, String message) {
        System.out.println(message);
        float n = in.nextFloat();
        return n;
    }

}