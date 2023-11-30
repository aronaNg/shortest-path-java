import java.util.*;

public class Graphe {
    List<Noeud> noeuds;
    List<Arete> aretes;

    public Graphe() {
        this.noeuds = new ArrayList<>();
        this.aretes = new ArrayList<>();
    }

    public void addNoeud(Noeud noeud) {
        noeuds.add(noeud);
    }

    public void addArete(Noeud source, Noeud destination, int valeur) {
        Arete arete = new Arete(source, destination, valeur);
        aretes.add(arete);
    }

    public void monPlusCourtChemin(Noeud noeudInitial) {
        noeudInitial.distance = 0;

        while (true) {
            Noeud noeudActuel = getNoeudProcheNonV();
            if (noeudActuel == null) {
                break; 
            }

            noeudActuel.visited = true;

            for (Arete arete : aretes) {
                if (arete.source == noeudActuel && !arete.destination.visited) {
                    int newDistance = noeudActuel.distance + arete.valeur;
                    if (newDistance < arete.destination.distance) {
                        arete.destination.distance = newDistance;
                    }
                }
            }
        }
    }

    private Noeud getNoeudProcheNonV() {
        Noeud closestNoeud = null;
        int minDistance = Integer.MAX_VALUE;

        for (Noeud noeud : noeuds) {
            if (!noeud.visited && noeud.distance < minDistance) {
                closestNoeud = noeud;
                minDistance = noeud.distance;
            }
        }

        return closestNoeud;
    }
}