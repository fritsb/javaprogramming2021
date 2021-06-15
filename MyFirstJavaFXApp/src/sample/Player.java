package sample;

public class Player implements Comparable<Player> {
    private String firstName;
    private String lastName;
    private int age;

    public Player(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return String.valueOf(age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
        /*return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';*/
    }

    @Override
    public int compareTo(Player o) {
        return (this.age < o.age ? -1 : (this.age == o.age ? 0 : 1));
    }
}
