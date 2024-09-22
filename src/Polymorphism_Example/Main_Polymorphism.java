package Polymorphism_Example;

public class Main_Polymorphism {
    public static void main(String[] args) {
        Drawing obj = new Drawing();
        obj.draw();
        obj.draw(12);
        obj.draw(2.30000002333);
        obj.draw(2.3123546097, 4.5123456789);
        obj.draw(12, 24);

        Drawing obj1 = new Child();
        obj.drawing();
        obj1.drawing();
    }
}
