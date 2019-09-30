import java.util.ArrayList;

public class Terning {

    /*
    Her har vi to Arrays det ene er defineret til maks at indenholde 3 punkter
    Mens vores ArrayList kan indenholde så mange punkter som vi ønsker.
    Vi benytter kun ArrayList i dette eksempel
     */
    int alleKast[] = {1, 2, 3}; // 1 = plads 0, 2 = plads 1, 3 = plads 2
    static ArrayList alleKastArrayList = new ArrayList();

    //Vi gernere et tal mellem 1 og 6 ved hjælp af Math.Random()
    protected static int cast() {
    int number = (int) (Math.random() * 6 + 1);
    return number;
}

    /*
    Vi opretter en int metode hvor vi tager en int ind kaldet antal som vi manipulere inde i vores main metode
    Denne metode er af typen ArrayList.
    Vi benytter et for loop til at tjekke op fra main metoden hvor mange gange vi ønsker loopet skal køres igennem
    For hver gang loopet køres igennem tilføjer vi det nye tal som bliver gerneret i Terning.cast() til vores ArrayListe
    Når loopet er kørt igennem så retunere vi vores ArrayList
     */
    protected static ArrayList flereKast(int antal) {
        for (int i = 0; i < antal; i++) {
            alleKastArrayList.add(Terning.cast());
        }
            return alleKastArrayList;
    }

}
