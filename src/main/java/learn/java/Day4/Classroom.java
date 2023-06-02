package learn.java.Day4;

public class Classroom {
    public String name;
    public String students;
    public Teacher teacher;
    public String bench;
    public String projector;

    public String identifyTeacher() {
        return this.teacher.name;
    }

    public String getSubject() {
        return this.teacher.subject;
    }


    public void learn() {
        System.out.println("Learning");
    }

    public void talk() {
        System.out.println("Talking");
    }


}
