package ifl1;

public class Zeitstempel {

    int pJahr;
    int pMonat;
    int pTag;
    int pStunde;
    int pMinute;

    int pSekunde;

    public Zeitstempel() {

    }

    public Zeitstempel(int pJahr, int pMonat, int pTag, int pStunde, int pMinute, int pSekunde) {
        this.pJahr = pJahr;
        this.pMonat = pMonat;
        this.pTag = pTag;
        this.pStunde = pStunde;
        this.pMinute = pMinute;
        this.pSekunde = pSekunde;
    }

    public boolean liegtInnerhalb(Zeitstempel pVon, Zeitstempel pBis) {
        if (this.pJahr < pVon.pJahr || this.pJahr > pBis.pJahr) {
            return false;
        } else if (this.pJahr == pVon.pJahr && this.pMonat < pVon.pMonat) {
            return false;
        } else if (this.pJahr == pBis.pJahr && this.pMonat > pBis.pMonat) {
            return false;
        } else if (this.pJahr == pVon.pJahr && this.pMonat == pVon.pMonat && this.pTag < pVon.pTag) {
            return false;
        } else if (this.pJahr == pBis.pJahr && this.pMonat == pBis.pMonat && this.pTag > pBis.pTag) {
            return false;
        } else if (this.pJahr == pVon.pJahr && this.pMonat == pVon.pMonat && this.pTag == pVon.pTag && this.pStunde < pVon.pStunde) {
            return false;
        } else if (this.pJahr == pBis.pJahr && this.pMonat == pBis.pMonat && this.pTag == pBis.pTag && this.pStunde > pBis.pStunde) {
            return false;
        } else if (this.pJahr == pVon.pJahr && this.pMonat == pVon.pMonat && this.pTag == pVon.pTag && this.pStunde == pVon.pStunde && this.pMinute < pVon.pMinute) {
            return false;
        } else if (this.pJahr == pBis.pJahr && this.pMonat == pBis.pMonat && this.pTag == pBis.pTag && this.pStunde == pBis.pStunde && this.pMinute > pBis.pMinute) {
            return false;
        } else if (this.pJahr == pVon.pJahr && this.pMonat == pVon.pMonat && this.pTag == pVon.pTag && this.pStunde == pVon.pStunde && this.pMinute == pVon.pMinute && this.pSekunde < pVon.pSekunde) {
            return false;
        } else return this.pJahr != pBis.pJahr || this.pMonat != pBis.pMonat || this.pTag != pBis.pTag || this.pStunde != pBis.pStunde || this.pMinute != pBis.pMinute || this.pSekunde <= pBis.pSekunde;
    }


}
