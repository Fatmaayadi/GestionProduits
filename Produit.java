public class Produit {
    private String nom;
    private double prix;
    private int quantite;
    private String categorie;

    public Produit(String nom, double prix, int quantite, String categorie) {
        if (prix < 0 || quantite < 0) {
            System.out.println("Erreur : Prix ou quantité négative !");
            prix = 0;
            quantite = 0;
        }
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) {
        if (prix >= 0) this.prix = prix;
        else System.out.println("Erreur : prix négatif !");
    }

    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) {
        if (quantite >= 0) this.quantite = quantite;
        else System.out.println("Erreur : quantité négative !");
    }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    public String toString() {
        return "Produit: " + nom + ", Prix: " + prix + ", Quantité: " + quantite + ", Catégorie: " + categorie;
    }
}