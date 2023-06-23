import java.util.Scanner;

public class calculadora

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Ingresa el segundo número: ");
        float numero2 = scanner.nextFloat();

        System.out.println("Selecciona la operación que deseas realizar:");
        System.out.println("Presiona 1 para Suma");
        System.out.println("Presiona 2 para Resta");
        System.out.println("Presiona 3 para Multiplicación");
        System.out.println("Presiona 4 para División");

        int opcion = scanner.nextInt();
        float resultado;

        switch (opcion) {
            case 1 -> resultado = numero1 + numero2;
            case 2 -> resultado = numero1 - numero2;
            case 3 -> resultado = numero1 * numero2;
            case 4 -> resultado = numero1 / numero2;
            default -> {
                System.out.println("Error");
                return;
            }
        }


        System.out.println("El resultado es: " + resultado);
    }
}
