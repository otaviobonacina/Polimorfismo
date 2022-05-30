public class Principal {
    public static void main(String[]args) {
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo =new Retangulo();
        Trapezio trapezio = new Trapezio();
        Losango losango = new Losango();
        Quadrilatero quadrilatero = new Quadrilatero();

        quadrado.calculararea();
        losango.calculararea();
        quadrilatero.calculararea();
        retangulo.calculararea();
        trapezio.calculararea();
    

    }
}
