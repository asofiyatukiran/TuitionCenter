package main.java.com.example.tutioncenter;

public class Main {
    public static void main(String[] args) {
        //Student
        Name studname1 = new Name("Haris Haikal", "Bin", "Ahmad");
        Address studAdd1 = new Address("Taman Harmoni", "Muar", "12533", "Johor");
        Student haris = new Student("01335249", 17, "SMKSA");
        haris.addMarks(60);
        haris.addMarks(70);
        haris.addMarks(80);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname1.getFullName());
        System.out.println("IC: " + haris.getIc());
        System.out.println("Address: " + studAdd1.getFullAddress());
        System.out.println("Year: " + haris.getYear());
        System.out.println("Marks: " + haris.getMarks());
        System.out.println("");

        Name studname2 = new Name("Micheal", "Bin", "Luebke");
        Address studAdd2 = new Address("Taman Mutiara", "Bandar Baru Bangi", "43650", "Selangor");
        Student mic = new Student("05060914", 17, "SMKSA");
        mic.addMarks(80);
        mic.addMarks(65);
        mic.addMarks(75);

        System.out.println("---Student Info---");
        System.out.println("Name: " + studname2.getFullName());
        System.out.println("IC: " + mic.getIc());
        System.out.println("Address: " + studAdd2.getFullAddress());
        System.out.println("Year: " + mic.getYear());
        System.out.println("Marks: " + mic.getMarks());
        System.out.println("");

        //Teacher
        Name teachname1 = new Name("Luisa Sophie", "Binti", "Adam");
        Teacher luisa = new Teacher("95002436", "Selangor", "5 years teaching", 5, "10/01/2016", 4);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + teachname1.getFullName());
        System.out.println("IC: " + luisa.getIc());
        System.out.println("Address: " + luisa.getAddress());
        System.out.println("Qualifications: " + luisa.getQualification());
        System.out.println("Year of Experience: " + luisa.getYearsExp());
        System.out.println("Date Joined: " + luisa.getDatejoined());
        System.out.println("Years since enter: " + luisa.getYearsSinceEnter());
        System.out.println("");

        Name teachname2 = new Name("Jacob", "Bin", "Noah");
        Teacher jac = new Teacher("960706", "Selangor", "3 years teaching", 3, "15/03/2021", 1);

        System.out.println("---Tutor Info---");
        System.out.println("Name: " + teachname2.getFullName());
        System.out.println("IC: " + jac.getIc());
        System.out.println("Address: " + jac.getAddress());
        System.out.println("Qualifications: " + jac.getQualification());
        System.out.println("Year of Experience: " + jac.getYearsExp());
        System.out.println("Date Joined: " + jac.getDatejoined());
        System.out.println("Years since enter: " + jac.getYearsSinceEnter());
        System.out.println("");

        //Tuition Center
        TuitionCenter bbb = new TuitionCenter("Bandar Baru Bangi");

        bbb.addteachers(luisa);
        bbb.addteachers(jac);
        bbb.addnumstud(haris);
        bbb.addnumstud(mic);

        System.out.println("---Tuition Center Info---");
        System.out.println("Address: " + bbb.getAddress());
        System.out.println("Number of teacher: " + bbb.getnumteachers());
        System.out.println("Number of students: " + bbb.getnumstud());
        System.out.println("Average student marks: " + bbb.getAverageMarks());
        System.out.println("Minimum mark: " + bbb.getMinMarks());
        System.out.println("Maximum mark: " + bbb.getMaxMarks());
        System.out.println("Tutor's background: " + bbb.getTutorQualifications());

    }
}