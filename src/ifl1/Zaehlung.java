package ifl1;

import abiturklassen.BinarySearchTree;

import java.util.ArrayList;

public class Zaehlung {

    private BinarySearchTree<OrtsDaten> verkehrszaehlung;
    public Zaehlung() {
        verkehrszaehlung = new BinarySearchTree<>();
    }

    public void erfasseKfz(String pOrtskuerzel, char pKfzKlasse){

    }

    public int ermittleAnzahl(Zeitstempel pVpn, Zeitstempel pBis){
        int anz = 0;
        ArrayList<Messung> list = durchlaufeBaum(verkehrszaehlung);
        for (Messung messung : list) {
            if (messung.getZeitstempel().liegtInnerhalb(pVpn, pBis)) {
                anz++;
            }
        }
        return anz;
    }

    public ArrayList<Messung> durchlaufeBaum(BinarySearchTree<OrtsDaten> pTree){
        ArrayList<Messung> arr = new ArrayList<>();
        if(pTree.getContent() != null){
            pTree.getContent().getMessungen().toFirst();
            while (pTree.getContent().getMessungen().hasAccess()){
                arr.add(pTree.getContent().getMessungen().getContent());
            }
        }
        if (!pTree.getLeftTree().isEmpty()){
            arr.addAll(durchlaufeBaum(pTree.getLeftTree()));
        }
        if (!pTree.getRightTree().isEmpty()) {
            arr.addAll(durchlaufeBaum(pTree.getRightTree()));
        }
        return arr;
    }
}
