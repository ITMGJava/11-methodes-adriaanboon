import java.util.Scanner;

public class Methodes {

    public static void main(String[] args) {
        helloWorld();
        helloUser();
        helloIngevoerdenaam();
        berekenEindbedrag(1,1);
    }

    static void helloWorld() {
        System.out.println("Hello world");
    }
    static void helloUser() {
        System.out.println("Hello, User");
    }
    static void helloIngevoerdenaam() {
        System.out.println("Wat is je naam?");
        var keyboard = new Scanner(System.in);
        String invoerNaam = keyboard.nextLine();
        System.out.println("Hello "+invoerNaam);
    }
    static float berekenEindbedrag(float beginBedrag, float maandRente) {
        double samengestelderenteNaTienJaar;
        double totaalBedragIncRente;
        System.out.println("Voer een bedrag in:");
        var bedrag = new Scanner(System.in);
        double invoerBedrag = bedrag.nextFloat();
        System.out.println("Voer een maandrente in:");
        var rente = new Scanner(System.in);
        float invoerRente = rente.nextFloat();
        double percentageRente = invoerRente/100+1;
        samengestelderenteNaTienJaar = Math.pow(percentageRente, 10);
        totaalBedragIncRente = samengestelderenteNaTienJaar * invoerBedrag;
        System.out.println(totaalBedragIncRente);
        return 1;
    }
}
