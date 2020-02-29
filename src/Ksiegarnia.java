public class Ksiegarnia {

    private String tytuł;
    private String wydawnictwo;
    private Double cena;
    private int liczbasztuk;
    private String numer;

    public Ksiegarnia(String t, String w, double c, int liczba, String nr){

        tytuł = t;
        wydawnictwo = w;
        cena = c;
        liczbasztuk = liczba;
        numer = nr;
    }

    //metody klasy

    public String getTytuł(){
        return tytuł;
    }

    public String getWydawnictwo(){
        return wydawnictwo;
    }

    public double getCena(){
        return cena;
    }

    public int getLiczbasztuk(){
        return liczbasztuk;
    }
    public String getNumer(){
        return numer;
    }

    public void buy(int n){
        liczbasztuk += n;
    }

    public void sell(int n){
        liczbasztuk -= n;
    }

    public void setCena(double ce) {
        cena = ce;
    }
}
