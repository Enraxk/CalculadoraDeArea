public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculadora de área para diferentes figuras.");
    }
    
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    // Añadir métodos para calcular el área de un rectángulo y un triángulo
    /**
     * Calcula el área de un triángulo.
     * @param base La base del triángulo.
     * @param height La altura del triángulo.
     * @return El área del triángulo.
     */
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
}
