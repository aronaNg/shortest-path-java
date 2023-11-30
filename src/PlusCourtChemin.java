public class PlusCourtChemin {
    public static void main(String[] args) {
        Graphe graphe = new Graphe();

        Noeud noeudA = new Noeud("Brest");
        Noeud noeudB = new Noeud("Rennes");
        Noeud noeudC = new Noeud("Paris");
        Noeud noeudD = new Noeud("Lille");
        Noeud noeudE = new Noeud("Reims");
        Noeud noeudF = new Noeud("Troyes");
        Noeud noeudG = new Noeud("Belfort");
        Noeud noeudH = new Noeud("Strasbourg");

        graphe.addNoeud(noeudA);
        graphe.addNoeud(noeudB);
        graphe.addNoeud(noeudC);
        graphe.addNoeud(noeudD);
        graphe.addNoeud(noeudE);
        graphe.addNoeud(noeudF);
        graphe.addNoeud(noeudG);
        graphe.addNoeud(noeudH);

        graphe.addArete(noeudA, noeudB, 241);
        graphe.addArete(noeudB, noeudC, 353);
        graphe.addArete(noeudC, noeudD, 225);
        graphe.addArete(noeudC, noeudE, 143);
        graphe.addArete(noeudD, noeudE, 205);
        graphe.addArete(noeudE, noeudF, 127);
        graphe.addArete(noeudE, noeudG, 380);
        graphe.addArete(noeudF, noeudG, 271);
        graphe.addArete(noeudG, noeudH, 152);

         graphe.monPlusCourtChemin(noeudA);

         for (Noeud node : graphe.noeuds) {
             System.out.println("Distance de " + node.nom + " : " + node.distance);
         }


    }
}
