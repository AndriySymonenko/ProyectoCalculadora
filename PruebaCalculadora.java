package ProyectoCalculadora;
public class PruebaCalculadora {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora
        Calculadora calc = new Calculadora(5, 3);

        // Probar el método realizarOperacion con suma
        String operacion = "suma";
        int resultado = calc.realizarOperacion(operacion);
        System.out.println("El resultado de la operación " + operacion + " es: " + resultado);

        // Prueba del método modulo
        System.out.println("El resultado de la operación módulo es: " + calc.modulo());
    }

}