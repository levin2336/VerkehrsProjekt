package ifl1;

import abiturklassen.BinarySearchTree;

public class Zaehlung {

    private final BinarySearchTree<OrtsDaten> verkehrszaehlung;
    public Zaehlung() {
        verkehrszaehlung = new BinarySearchTree<>();
    }

    public void erfasseKfz(String pOrtskuerzel, char pKfzKlasse){
        if (verkehrszaehlung.search(new OrtsDaten(pOrtskuerzel)) == null) {
            verkehrszaehlung.insert(new OrtsDaten(pOrtskuerzel));
            verkehrszaehlung.search(new OrtsDaten(pOrtskuerzel)).erfasseMessung(new Messung(pKfzKlasse));
        } else {
            verkehrszaehlung.search(new OrtsDaten(pOrtskuerzel)).erfasseMessung(new Messung(pKfzKlasse));
        }
    }

    public int ermittleAnzahl(Zeitstempel pVon, Zeitstempel pBis) {
        return ermittleAnzahlTree(verkehrszaehlung, pVon, pBis);
    }

    private int ermittleAnzahlTree(BinarySearchTree<OrtsDaten> tree, Zeitstempel pVon, Zeitstempel pBis) {
        int anz = 0;
        if (tree.getContent() != null) {
            tree.getContent().getMessungen().toFirst();
            while (tree.getContent().getMessungen().hasAccess()) {
                if (tree.getContent().getMessungen().getContent().getZeitstempel().liegtInnerhalb(pVon, pBis)) {
                    anz++;
                }
                tree.getContent().getMessungen().next();
            }

        }
        if (!tree.getLeftTree().isEmpty()) {
            anz += ermittleAnzahlTree(tree.getLeftTree(), pVon, pBis);
        }
        if (!tree.getRightTree().isEmpty()) {
            anz += ermittleAnzahlTree(tree.getRightTree(), pVon, pBis);
        }
        return anz;
    }

    public BinarySearchTree<OrtsDaten> getVerkehrszaehlung() {
        return verkehrszaehlung;
    }
}
