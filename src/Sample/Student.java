package Sample;

public class Student {
    public int studentId;
    public String name;
    public String dob;
    public int age;
    public String gender;
    public int yearOfAdmission;
    public String grade;
    public static String email = "default@gmail.com";

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Student(){

    }

    public Student(int studentId, String name, String dob, int age, String gender, int yearOfAdmission, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.yearOfAdmission = yearOfAdmission;
        this.grade = grade;
    }
}
