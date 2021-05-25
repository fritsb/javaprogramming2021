package nl.streeksoft.novi;

public class Course {
    public String courseName;
    public int courseNo;

    public String getCourseInfo() {
        return courseName + " (" + courseNo + ")";
    }
}
