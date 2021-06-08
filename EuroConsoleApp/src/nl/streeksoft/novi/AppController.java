package nl.streeksoft.novi;

import java.util.ArrayList;

public class AppController {
    private ArrayList<Person> persons = new ArrayList<Person>();
    private ArrayList<Team> teams = new ArrayList<>();


    public AppController() {
        this.generateHollandTeam();
        this.printTeams();
        /*
        this.generatePerson();
        this.generateCoach();
        this.generatePlayers();
        this.printList(); */
    }

    public void generateHollandTeam() {
        Team holland = new Team("Nederland","NL");

        Player player1 = new Player("Memphis","Depay",30, 9);
        Player player2 = new Player("Maarten","Stekelenburg",37, 1);
        player1.setPosition("Aanvaller");
        player2.setPosition("Keeper");

        holland.addPlayer(player1);
        holland.addPlayer(player2);

        Coach coach1 = new Coach("Frank", "de Boer",51);
        coach1.setRole("Hoofdcoach");
        holland.addCoach(coach1);

        teams.add(holland);
        FileHandler.writeData(holland.toString());
    }

    public void printTeams() {
        for (int i = 0; i < teams.size(); i++) {
            Team tmpTeam = teams.get(i);
            System.out.println(tmpTeam);
        }

    }

    public void generatePerson() {
        Person person1 = new Person("Frits","Bosschert",35);
        Person person2 = new Person("Nick","Stuivenberg",30);

        persons.add(person1);
        persons.add(person2);
    }

    public void generatePlayers() {
        Player player1 = new Player("Memphis","Depay",30, 9);
        Player player2 = new Player("Maarten","Stekelenburg",37, 1);
        player1.setPosition("Aanvaller");
        player2.setPosition("Keeper");

        persons.add(player1);
        persons.add(player2);
    }

    public void generateCoach() {
        Coach coach1 = new Coach("Frank", "de Boer",51);
        coach1.setRole("Hoofdcoach");

        persons.add(coach1);
    }

    public void printList() {
        int listSize = persons.size();

        for(int i = 0; i < listSize; i++) {
            Person tmpPerson = persons.get(i);
            System.out.println( tmpPerson );
        }

    }
}