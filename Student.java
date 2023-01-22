package JavaTestProgrammes;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("StudentID: " + id + "Student Name: " + name);


    }
}
