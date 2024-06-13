package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        // Abstract class
        // Trừu tượng không hoàn toàn
        Shape circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());


        // Interface
        // Trừ tượng hoàn toàn
        // Mặc định: public abstract
        Extendable circle2 = new Circle(1.0);
        circle2.extend();
    }
}
