package ifl1;

import abiturklassen.ComparableContent;
import abiturklassen.List;

public class OrtsDaten implements ComparableContent<OrtsDaten> {

    private String ortsKuerzel;
    private int anzahlMessungen;

    private List<Messung> messungen;

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

    }

    @Override
    public boolean isGreater(OrtsDaten pContent) {
        return false;
    }

    @Override
    public boolean isEqual(OrtsDaten pContent) {
        return false;
    }

    @Override
    public boolean isLess(OrtsDaten pContent) {
        return false;
    }
}
