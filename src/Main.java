import java.util.ArrayList;

public class Main {

    static final int antalKast = 1000;

    public static void main(String[] args) {
        System.out.println("Terningespil");
        /*
        Vi opretter en ny ArrayList kaldet liste og sætter værdien fra Terning.flereKast(antalKast) til at være
        lig med det andet ArrayList fra vores anden Terning klasse
         */
        ArrayList liste = Terning.flereKast(antalKast);

        /*
        For hver gang der biver fundet noget nyt i vores liste så printer vi en ny linje og en besked ud
        Det vil sige at vi kaster vores terning 1000 gange og får 1000 tilfældige tal da metoderne kalder hinanden
         */
        liste.forEach((n) -> System.out.println("Terningen er kastet: " + n));
        System.out.println("Terningen er kastet " + antalKast + " gange.");
    }
}
