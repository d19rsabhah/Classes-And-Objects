package Encapsulation_Example;

public class Main_Encapsulation {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.setId(121);
        obj.setName("Rishav");
        obj.setNumber("12500120161");

        System.out.println(obj.getId() + " " + obj.getName() + " " + obj.getNumber());
    }
}
