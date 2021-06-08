package nl.streeksoft.novi;

public class Coach extends Person {
    private String role = "";

    public Coach(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        super.age = super.age + 1;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString() +  "Coach{" +
                "role='" + role + '\'' +
                '}';
    }
}
