package nl.streeksoft.novi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // OOP example with relationship between two classes,
        // and objects in an ArrayList
        Student bob = new Student();
        bob.firstName = "Bob";
        bob.lastName = " de Student";

        Course javaProgrammeren = new Course();
        javaProgrammeren.courseName = "Java Programmeren";
        javaProgrammeren.courseNo = 202105;
        bob.currentCourse = javaProgrammeren;

        // Display information from object to console
        //System.out.println("Student: " + bob.getFullName() );
        //System.out.println("Cursus: " + javaProgrammeren.getCourseInfo());


        Student klaas = new Student();
        klaas.firstName = "Klaas";
        klaas.lastName = " de Student";
        klaas.currentCourse = javaProgrammeren;

        ArrayList<Student> studenten = new ArrayList<>();
        studenten.add(bob);
        studenten.add(klaas);

        for(int i = 0; i < studenten.size(); i++) {
            Student tmpStudent = studenten.get(i);
            System.out.println(tmpStudent.getStudentAndCourseInfo());
        }

        // The loop above is a replacement for the following 2 lines
        //        System.out.println(bob.getStudentAndCourseInfo());
        //      System.out.println(klaas.getStudentAndCourseInfo());


        // Uncomment following lines to see loop example
  //      Loop loop1 = new Loop();
        //loop1.loopCharacters();
        //System.out.println(loop1.returnData());
        //loop1.printData("Dit is een test - 123");
    //    loop1.loopArray();



    }
}
