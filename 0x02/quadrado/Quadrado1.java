package quadrado;
public class Quadrado1 {
    public static double area(double lado) {
        if (lado > 0) {
            return (lado * lado);

        } else
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
    }
}
