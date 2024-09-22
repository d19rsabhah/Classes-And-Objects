package Main;

import Sample.Student;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Before assigning values to s1 object - " + s1);

        s1.studentId = 202124154;
        s1.name = "Rishav Das";
        s1.age = 22;
        s1.dob = "27th June 2002";
        s1.gender = "Male";
        s1.yearOfAdmission = 2020;
        s1.grade = "A";
        s1.email = "rishav@gmail.com";

        System.out.println("After assigning values to s1 object - " + s1);

        Student s2 = new Student();
        //s2 = s1;
        System.out.println("Before assigning values to s2 object - " + s2);

        s2.studentId = 202124167;
        s2.name = "Ayush Prawal";
        s2.age = 22;
        s2.dob = "5th April 2002";
        s2.gender = "Male";
        s2.yearOfAdmission = 2020;
        s2.grade = "A";

        System.out.println("After assigning values to s2 object - " + s2);

        Student s3 = new Student(202124165, "Vivek Kumar", "24th June 2002", 22, "Male", 2020, "A");
        System.out.println("After assigning values to s3 object using parameterized constructor - " + s3);

        Student s4 = new Student();
        //s2 = s1;
        System.out.println("Before assigning values to s4 object - " + s4);

        s4.studentId = 202124167;
        s4.name = "Ayush Prawal";
        s4.age = 22;
        s4.dob = "5th April 2002";
        s4.gender = "Male";
        s4.yearOfAdmission = 2020;
        s4.grade = "A";
        Student.email = "rishavdas@gmail.com";

        System.out.println("After assigning values to s4 object - " + s4);
    }
}
