public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora iniciada");
        Suma suma = new Suma();
        System.out.println(suma.calcular(2,3));
        Resta resta = new Resta();
        System.out.println(resta.calcular(2,3));
    }
}