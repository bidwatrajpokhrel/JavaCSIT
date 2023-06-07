package learn.java.Day9;

public class Chairperson extends President {

    public void rejectIdea(String idea) {
        approvedIdeas.remove(idea);
    }

    @Override
    public void proposeIdea(String idea) {
        super.proposeIdea(idea);
        super.approveIdea(idea);
    }
}
