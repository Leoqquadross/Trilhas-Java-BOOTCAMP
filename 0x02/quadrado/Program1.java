package quadrado;
public class Program1 {
    public static void main(String[] args) {
        try {
            double lado1 = -5;
            double resultado = Quadrado1.area(lado1);
            System.out.println(resultado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            double lado2 = 3;
            double resultado = Quadrado1.area(lado2);
            System.out.println(resultado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
