package main.java.com.example.tutioncenter;

import java.util.ArrayList;
import java.util.List;

public class TuitionCenter {

    private String address;
    private List<Teacher> teachers;
    private List<Student> students;

    public TuitionCenter(String address){
        this.address = address;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    //OPERATIONS
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {

        return address;
    }
    public void addteachers(Teacher teacher) {
        teachers.add(teacher);
    }
    public void removenumteachers(Teacher teacher) {
        teachers.remove(teacher);
    }
    public int getnumteachers(){
        return teachers.size();
    }

    public void addnumstud(Student student) {
        students.add(student);
    }
    public void removenumstud(Student student) {
        students.remove(student);
    }
    public int getnumstud(){
        return students.size();
    }

    public double getAverageMarks() {
        float totalmarks = 0;
        float nummarks = 0;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                totalmarks += mark;
                nummarks++;
            }
        }
        if (nummarks > 0) {
            return (float) totalmarks / nummarks;
        } else {
            return 0;
        }
    }

    public Float getMinMarks() {
        Float minmarks = (float) Integer.MAX_VALUE;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                if (mark < minmarks) {
                    minmarks = mark;
                }
            }
        }
        if (minmarks == (float) Integer.MAX_VALUE) {
            return (float) 0;
        } else {
            return minmarks;
        }
    }

    public Float getMaxMarks() {
        Float maxmarks = (float)Integer.MIN_VALUE;
        for (Student student : students) {
            List<Float> marks = student.getMarks();
            for (Float mark : marks) {
                if (mark > maxmarks) {
                    maxmarks = mark;
                }
            }
        }
        if (maxmarks == (float)Integer.MIN_VALUE) {
            return (float) 0;
        } else {
            return maxmarks;
        }
    }

    public List<String> getTutorQualifications() {
        List<String> qualifications = new ArrayList<>();
        for (Teacher teacher : teachers) {
            qualifications.add(teacher.getQualification());
        }
        return qualifications ;
    }
}
