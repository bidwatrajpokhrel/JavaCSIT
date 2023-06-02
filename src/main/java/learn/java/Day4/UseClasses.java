package learn.java.Day4;

public class UseClasses {
    public static void main(String[] args) {
        Classroom room904 = new Classroom();
//        room904.name = "904";
//        room904.teacher = "Sujita";
//        room904.identifyTeacher();

        Teacher bipin = new Teacher(
                "Bipin",
                "Baneshwor",
                "Universe",
                200000,
                false
        );
//        bipin.name = "Bipin";
//        bipin.subject = "Universe";
//        bipin.address = "Baneshwor";
//        bipin.isMarried = false;
//        bipin.salary = 200000;

        System.out.println(Teacher.qualification);
        bipin.prepareContent("Black Hole");

        Classroom room905 = new Classroom();
        room905.name = "905";
        room905.teacher = bipin;
        String identifiedTeacher = room905.identifyTeacher();
        System.out.println("The teacher " + identifiedTeacher + " isTeaching " +
                room905.name + " the subject " + room905.teacher.subject + " They earn Rs. "
                +  room905.teacher.salary);
    }}