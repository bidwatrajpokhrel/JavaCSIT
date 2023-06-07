package learn.java.Day9;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member();
        member1.setName("Ramu");
        System.out.println(member1.getName());
        member1.proposeIdea("Idea1");
        member1.proposeIdea("Idea3");
        member1.proposeIdea("Idea4");

        President president = new President();
        president.setName("Pukar");
        System.out.println(president.getName());
        president.proposeIdea("Idea2");

        president.approveIdea("Idea2");
        president.approveIdea("Idea3");
        president.approveIdea("Idea4");

        System.out.println("Ideas appoved by president: " + President.getApprovedIdeas());

        Chairperson chairperson = new Chairperson();
        chairperson.setName("Nabin");
        chairperson.rejectIdea("Idea3");

        System.out.println("Ideas after revision by chairperson: " + Chairperson.getApprovedIdeas());

        chairperson.proposeIdea("Idea Extra");

        System.out.println(Member.getProposedIdeas());
        System.out.println(President.getApprovedIdeas());
    }
}
