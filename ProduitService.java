import java.util.Scanner;

public class ProduitService {
    private Produit[] produits = new Produit[100];
    private int nbProduits = 0;
    Scanner scanner = new Scanner(System.in);

    public void ajouterProduit() {
        System.out.print("Nom du produit : ");
        String nom = scanner.nextLine();
        System.out.print("Prix : ");
        double prix = scanner.nextDouble();
        System.out.print("Quantité : ");
        int quantite = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Catégorie : ");
        String categorie = scanner.nextLine();

        produits[nbProduits++] = new Produit(nom, prix, quantite, categorie);
        System.out.println("Produit ajouté !");
    }

    public void afficherProduits() {
        for (int i = 0; i < nbProduits; i++) {
            System.out.println(produits[i]);
        }
    }

    public void modifierProduit() {
        System.out.print("Nom du produit à modifier : ");
        String nom = scanner.nextLine();
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].getNom().equalsIgnoreCase(nom)) {
                System.out.print("Nouveau prix : ");
                produits[i].setPrix(scanner.nextDouble());
                System.out.print("Nouvelle quantité : ");
                produits[i].setQuantite(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Nouvelle catégorie : ");
                produits[i].setCategorie(scanner.nextLine());
                System.out.println("Produit modifié.");
                return;
            }
        }
        System.out.println("Produit non trouvé.");
    }

    public void supprimerProduit() {
        System.out.print("Nom du produit à supprimer : ");
        String nom = scanner.nextLine();
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].getNom().equalsIgnoreCase(nom)) {
                for (int j = i; j < nbProduits - 1; j++) {
                    produits[j] = produits[j + 1];
                }
                nbProduits--;
                System.out.println("Produit supprimé.");
                return;
            }
        }
        System.out.println("Produit non trouvé.");
    }

    public void filtrerParCategorie() {
        System.out.print("Nom de la catégorie : ");
        String cat = scanner.nextLine().trim();
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].getCategorie().equalsIgnoreCase(cat)) {
                System.out.println(produits[i]);
            }
        }
    }

    public void verifierStock() {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].getQuantite() < 5) {
                System.out.println("Alerte : Stock faible pour " + produits[i].getNom());
            }
        }
    }

    public void miseAJourStock(String nomProduit, int quantiteVendue) {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].getNom().equalsIgnoreCase(nomProduit)) {
                int nouvelleQuantite = produits[i].getQuantite() - quantiteVendue;
                produits[i].setQuantite(nouvelleQuantite);
                return;
            }
        }
    }

    public void rechercherProduitParNom() {
        System.out.print("Nom du produit à rechercher : ");
        String nom = scanner.nextLine();
        boolean trouve = false;
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].getNom().equalsIgnoreCase(nom)) {
                System.out.println("Produit trouvé : " + produits[i]);
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Produit non trouvé.");
        }
    }
}
