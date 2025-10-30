import java.util.Scanner;

/**
 * Programa demostrativo para la clase Calculadora.
 * Proporciona un menú por consola para realizar operaciones básicas.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora básica - operaciones: 1:+ 2:- 3:* 4:/ 5:^  0:salir");


        while (true) {
            System.out.print("Operación (1-4, 0 salir): ");
            String op = sc.next().trim();
            if ("0".equals(op)) {
                break;
            }

            System.out.print("Primer número: ");
            double a = readDouble(sc);
            System.out.print("Segundo número: ");
            double b = readDouble(sc);

            try {
    double resultado;

    switch (op) {
        case "1":
            resultado = Calculadora.sumar(a, b);
            break;
        case "2":
            resultado = Calculadora.restar(a, b);
            break;
        case "3":
            resultado = Calculadora.multiplicar(a, b);
            break;
        case "4":
            resultado = Calculadora.dividir(a, b);
            break;
        case "5": // ⭐ Nueva operación sugerida por Copilot
            resultado = Math.pow(a, b);
            break;
        default:
            System.out.println("Opción inválida. Intente de nuevo.");
            continue;
    }
    System.out.println("Resultado: " + resultado);

} catch (IllegalArgumentException e) {
    System.out.println("Error: " + e.getMessage());
}

        }

        sc.close();
        System.out.println("Saliendo. ¡Hasta luego!");
    }

    private static double readDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada inválida. Ingrese un número: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
