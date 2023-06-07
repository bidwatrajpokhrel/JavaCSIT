package learn.java.Day10.Users;

public abstract class User {
    private String name;
    private String email;
    private String password;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        System.out.println("Logged in as " + this.name);
    }

    public void useFreeFeatures() {
        System.out.println("Using free features");
    }

    public abstract void streamVideo();
}
