class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    protected int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }
}

class GraduateStudent extends Student {
    private int graduationYear;

    public GraduateStudent(String name, int age, int rollNo, int graduationYear) {
        super(name, age, rollNo);
        this.graduationYear = graduationYear;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Graduation Year: " + graduationYear);
    }
}

public class Main {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Piyush", 20, 101, 2026);
        gs.display();
    }
}
