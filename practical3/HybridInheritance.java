
class Person {
    String name = "Rahul";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

interface Sports {
    void play();
}

class Student extends Person implements Sports {

    int rollNumber = 101;

    public void play() {
        System.out.println("Student is playing football");
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.displayName();
        s.displayDetails();
        s.play();
    }
}
