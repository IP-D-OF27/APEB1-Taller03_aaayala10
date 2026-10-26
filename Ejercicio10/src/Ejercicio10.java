public class Ejercicio10 {
     public static void main(String[] args) {
        boolean parteA = Math.sqrt(25) * 10 >= 100;
        boolean parteB = 10.0 / 5 >= 2;

        boolean resultado = (parteA && true) || false || parteB;
        System.out.println("El resultado es: " + resultado);
    }
}
