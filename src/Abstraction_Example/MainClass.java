package Abstraction_Example;

public class MainClass {
    public static void main(String[] args) {
        ConcreteClass c1 = new ConcreteClass();
        c1.demo();
        c1.demo2();
        c1.sample();

        SimpleAbstractClass.sample();
    }
}
