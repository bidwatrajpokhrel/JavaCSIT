package learn.java.Day10.Users;

public class Main {

    public static void main(String[] args) {
        User user = new PaidUser();
        user.setName("name");
        user.login();
        user.streamVideo();

        User user2 = new FreeUser();
        user2.setName("name2");
        user2.login();
        user2.streamVideo();

        PaidUser user3 = new PaidUser();
        user3.streamVideo();
        user3.usePaidFeatures();

    }

}
