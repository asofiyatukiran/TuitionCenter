package main.java.com.example.tutioncenter;

public class Main {
    public static void main(String[] args) {
        Student mike = new Student();

        Name name = new Name();
        name.setFName("Michael");
        name.setMName("Michael");
        name.setLName("Luebke");
        mike.setName(name);

        Student adila = new Student();
        name = new Name();
        name.setFName("Adila");
        name.setMName("binti");
        name.setLName("izzat");
        adila.setName(name);


        Student imran = new Student();
        name = new Name("Syed", "Imran", "Shah");
        imran.setName(name);


        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(mike);
        sb2023.add(adila, 0);

        // declare a method that allows for the following:
        boolean isIn = sb2023.find("Adlin");



        Teacher cikguminah = new Teacher();
        // mike.setName(name);

//        for (int i=0; i<5; i++)
//            mike.setMark(100, i);

        // calculate and print the avg
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Avg = " + avg);

        // calculate the min marks for mike
        System.out.println("Min = " + mike.calcMin());
    }
}