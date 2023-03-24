package ifl1;

import abiturklassen.ComparableContent;
import abiturklassen.List;

public class OrtsDaten implements ComparableContent<OrtsDaten> {

    private final String ortsKuerzel;
    private int anzahlMessungen;

    private final List<Messung> messungen;

    public OrtsDaten(String pOrtsKuerzel) {
        this.ortsKuerzel = pOrtsKuerzel;
        messungen = new List<>();
    }

    public String getOrtsKuerzel() {
        return ortsKuerzel;
    }

    public int getAnzahlMessungen() {
        return anzahlMessungen;
    }

    public List<Messung> getMessungen() {
        return messungen;
    }

    public void erfasseMessung(Messung pMessung){
        messungen.append(pMessung);
        anzahlMessungen++;
    }

    @Override
    public boolean isGreater(OrtsDaten pContent) {
        return this.ortsKuerzel.compareTo(pContent.getOrtsKuerzel()) > 0;
    }

    @Override
    public boolean isEqual(OrtsDaten pContent) {
        return this.ortsKuerzel.compareTo(pContent.getOrtsKuerzel()) == 0;
    }

    @Override
    public boolean isLess(OrtsDaten pContent) {
        return this.ortsKuerzel.compareTo(pContent.getOrtsKuerzel()) < 0;
    }
}
