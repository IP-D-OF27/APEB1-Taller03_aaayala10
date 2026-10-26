public class Ejercicio08 {
   public static void main(String[] args) {
        boolean parteA = (10 * 9) + 20 - 500.0 / 2 + Math.pow(3, 2) >= 200;
        boolean parteB = 50 >= 50 - 50 + 51;

        boolean resultado = parteA || parteB;
        System.out.println("El resultado es: " + resultado);
    } 
}
