package Polymorphism_Example;

public class Drawing {
    public void draw(){
        System.out.println("Draw method without parameter.");
    }
    public void draw(int a){
        System.out.println("Draw method with one parameter : " + a);
    }
    public void draw(int a, int b){
        System.out.println("Draw method with two parameters : " + a + " & " + b);
    }
    public void draw(double a, double b){
        System.out.println("Draw method with two parameter of double value : " + a + " & " + b);
    }
    public void draw(double a){
        System.out.println("Draw method with one parameter of double value : " + a);
    }

    public void drawing(){
        System.out.println("Calling parent method!");
    }

}
class Child extends Drawing{
    public void drawing(){
        System.out.println("Calling child method!");
    }
}
