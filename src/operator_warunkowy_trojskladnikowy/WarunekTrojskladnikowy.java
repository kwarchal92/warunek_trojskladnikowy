package operator_warunkowy_trojskladnikowy;

public class WarunekTrojskladnikowy {

    public static void main(String[] args)
    {
        int a = 10, b;

        b = (a == 1) ? 20 : 30; //zmienna b = (wyrazenie) ? prawda : fałsz

        System.out.println("Wartosc b wynosi: " + b + " (falsz).");  //fałsz

        b = (a == 10) ? 200: 300;

        System.out.println("Wartosc b wynosi: " + b + " (prawda).");  //prawda


    }
}
