package main.java.com.example.tutioncenter;


import java.util.ArrayList;
import java.util.List;
public class StudentBatch {

    //DATA
    private List<Student> studbatch;

    public StudentBatch() {
        this.studbatch = new ArrayList<>();
    }

    //OPERATIONS
    public void addStudent(Student student) {
        studbatch.add(student);
    }
    public void removeStudent(Student student) {
        studbatch.remove(student);
    }
}
