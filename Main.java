import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProduitService produitService = new ProduitService();
        ReclamationService reclamationService = new ReclamationService();

        int choix;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Modifier un produit");
            System.out.println("3. Supprimer un produit");
            System.out.println("4. Afficher tous les produits");
            System.out.println("5. Filtrer produits par catégorie");
            System.out.println("6. Vérifier stock faible");
            System.out.println("7. Rechercher un produit par nom");
            System.out.println("8. Ajouter une réclamation");
            System.out.println("9. Afficher les réclamations");
            System.out.println("10. Changer le statut d'une réclamation");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    produitService.ajouterProduit();
                    break;
                case 2:
                    produitService.modifierProduit();
                    break;
                case 3:
                    produitService.supprimerProduit();
                    break;
                case 4:
                    produitService.afficherProduits();
                    break;
                case 5:
                    produitService.filtrerParCategorie();
                    break;
                case 6:
                    produitService.verifierStock();
                    break;
                case 7:
                    produitService.rechercherProduitParNom();
                    break;
                case 8:
                    reclamationService.ajouterReclamation();
                    break;
                case 9:
                    reclamationService.afficherReclamations();
                    break;
                case 10:
                    reclamationService.changerStatutReclamation();
                    break;
                case 0:
                    System.out.println("Merci d’avoir utilisé notre application !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);

        scanner.close();
    }
}
