package ifl1;

public class Messung {
    private char kfzKlasse;
    private Zeitstempel zeitstempel;

    public Messung(char kfzKlasse) {
        this.kfzKlasse = kfzKlasse;
        zeitstempel = new Zeitstempel();
    }

    public char getKfzKlasse() {
        return kfzKlasse;
    }

    public Zeitstempel getZeitstempel() {
        return zeitstempel;
    }
}
