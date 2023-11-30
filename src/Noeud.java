import java.util.*;

public class Noeud {
    String nom;
    int distance;
    boolean visited;

    public Noeud(String nom) {
        this.nom = nom;
        this.distance = Integer.MAX_VALUE;
        this.visited = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isVisited() {
        return visited;
    }

}