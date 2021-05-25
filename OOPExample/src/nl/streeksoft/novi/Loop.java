package nl.streeksoft.novi;

public class Loop {

    public String returnData(String data) {
        return data;
    }

    public void printData(String data) {
        System.out.println(returnData(data));
    }

    public void loopCharacters() {
        for(int i = -128; i < 127; i++) {
            char ch = (char) i;
            System.out.println("Karakter op positie: " + i + " is " + ch);
        }
    }

    public String[] createArray() {
        String[] bakkerStraat = new String[4];
        bakkerStraat[0] = "Familie Janssen";
        bakkerStraat[1] = "Bakker Bart";
        bakkerStraat[2] = "Familie Baas";
        bakkerStraat[3] = "Familie Klaassen";

        return bakkerStraat;
    }

    public void loopArray() {
        String[] bakkerStraat = createArray();

        for (int i = 0; i < bakkerStraat.length; i++) {
            System.out.println("Positie " + i + " is " + bakkerStraat[i]);
        }

    }

}
