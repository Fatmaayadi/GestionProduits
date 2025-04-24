public class Reclamation {
    private String description;
    private String statut; // "Ouvert" ou "Résolu"
    private String produitConcerne;

    public Reclamation(String description, String produitConcerne) {
        this.description = description;
        this.produitConcerne = produitConcerne;
        this.statut = "Ouvert";
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public String getProduitConcerne() { return produitConcerne; }
    public void setProduitConcerne(String produitConcerne) { this.produitConcerne = produitConcerne; }

    public String toString() {
        return "Réclamation pour le produit \"" + produitConcerne + "\": " + description + " [" + statut + "]";
    }
}
