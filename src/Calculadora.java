public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora iniciada");
        Multiplicar multiplicar = new Multiplicar();
        System.out.println(multiplicar.calcular(5, 6));
        Dividir dividir = new Dividir();
        System.out.println(dividir.calcular(10, 2));
    }
}