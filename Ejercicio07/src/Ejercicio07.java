public class Ejercicio07 {  
     public static void main(String[] args) {
        boolean parteA = (Math.sqrt(81) + 9) / 3 == 9;
        boolean parteB = 10 > 1;
        boolean parteC = 100.0 / 25 >= Math.sqrt(100);

        boolean resultado = parteA || (parteB && parteC);
        System.out.println("El resultado es: " + resultado);
    }
    
}
