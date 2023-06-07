package learn.java.Day9;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;

    protected  static List<String> proposedIdeas = new ArrayList<String>();

    public void proposeIdea(String idea) {
        proposedIdeas.add(idea);
    }

    public static List<String> getProposedIdeas() {
        return proposedIdeas;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
