/**
 * Calculadora - operaciones aritméticas básicas.
 *
 * Métodos estáticos simples para facilitar su uso desde código de ejemplo o pruebas.
 */
public class Calculadora {

    /**
     * Suma dos números.
     *
     * @param  a primer sumando
     * @param b segundo sumando
     * @return la suma de a y b
     */
    public static double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta b de a.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return a - b
     */
    public static double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return el producto a * b
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide a por b.
     *
     * Lanza IllegalArgumentException si se intenta dividir por cero.
     *
     * @param a dividendo
     * @param b divisor
     * @return el cociente a / b
     * @throws IllegalArgumentException si b == 0
     */
    public static double dividir(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("División por cero no permitida");
        }
        return a / b;
    }
}
