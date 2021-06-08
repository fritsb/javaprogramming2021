package nl.streeksoft.novi;

public class Player extends Person {
    private String position = "";
    private int number;

    public Player(String firstName, String lastName, int age, int number) {
        super(firstName, lastName, age);
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() +  "Player{" +
                "position='" + position + '\'' +
                ", number=" + number +
                '}';
    }
}
