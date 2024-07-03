package aa;

public class User {
    private String firsName;
    private  String email;
    private  String password;
    private String role;

    public User(String firsName, String email, String password, String role) {
        this.firsName = firsName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "aa.Userservis{" +
                "firsName='" + firsName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
