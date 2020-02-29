public class Main {
    public static void main(String[] args) {

        Ksiegarnia k1 = new Ksiegarnia("Abecadło", "Alfa", 205, 10, "ddcsd33");

        int n = 19;
        k1.buy(n);



    double koszt = k1.getCena();

        //sprzedaż 6 książek

        k1.sell(6);

    int liczba = k1.getLiczbasztuk();

        System.out.println(koszt);
        System.out.println(liczba);
        System.out.println("Książek pod tytułem: " + k1.getTytuł());
        System.out.println("pozostało w księgarni w liczbie: " + k1.getLiczbasztuk() + " sztuki");
        System.out.println("Koszt książki to: " + k1.getCena() + " zł");
    }
}
