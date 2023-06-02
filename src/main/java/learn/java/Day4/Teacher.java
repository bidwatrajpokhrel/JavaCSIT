package learn.java.Day4;

public class Teacher {
    public static final String qualification = "Bachelors Degree";

    public Teacher(String paraName,
                   String paraAddress,
                   String paraSubject,
                   Integer paraSalary,
                   Boolean paraIsMarried) {
        this.name = paraName;
        this.address = paraAddress;
        this.subject = paraSubject;
        this.salary = paraSalary;
        this.isMarried= paraIsMarried;
    }
    public String name;

    public String address;

    public String subject;

    public Integer salary;

    public Boolean isMarried;

    public String content;

    public void prepareContent(String cntnt) {
        this.content = cntnt;
    }

    public String teachPreparedContent() {
        return this.content;
    }

    public void shout() {}

    public void write() {}
}
