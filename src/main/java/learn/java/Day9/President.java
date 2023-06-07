package learn.java.Day9;

import java.util.ArrayList;
import java.util.List;

public class President extends Member{

    protected static List<String> approvedIdeas = new ArrayList<String>();

    public void approveIdea(String idea) {
        if(proposedIdeas.contains(idea)) {
            approvedIdeas.add(idea);
        }
    }

    public static List<String> getApprovedIdeas() {
        return approvedIdeas;
    }
}
