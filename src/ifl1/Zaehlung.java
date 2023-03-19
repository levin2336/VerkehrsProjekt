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

    public int ermittleAnzahlAlt(Zeitstempel pVon, Zeitstempel pBis){
        return ermittleAnzahlTree(verkehrszaehlung,pVon,pBis);
    }

    public int ermittleAnzahlTree(BinarySearchTree<OrtsDaten> tree,Zeitstempel pVon, Zeitstempel pBis){
        int anz = 0;
        if (tree.getContent()!=null){
            if (tree.getContent().getMessungen().getContent().getZeitstempel().liegtInnerhalb(pVon,pBis)){
                anz++;
            }
        }
        if (!tree.getLeftTree().isEmpty()){
            anz += ermittleAnzahlTree(tree.getLeftTree(),pVon,pBis);
        }
        if (!tree.getRightTree().isEmpty()){
            anz += ermittleAnzahlTree(tree.getRightTree(),pVon,pBis);
        }
        return anz;
    }
}
