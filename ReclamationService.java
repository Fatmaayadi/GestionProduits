import java.util.Scanner;

public class ReclamationService {
    private Reclamation[] reclamations = new Reclamation[100];
    private int nbReclamations = 0;
    Scanner scanner = new Scanner(System.in);

    public void ajouterReclamation() {
        System.out.print("Description : ");
        String desc = scanner.nextLine();
        System.out.print("Nom du produit concerné : ");
        String produit = scanner.nextLine();

        reclamations[nbReclamations++] = new Reclamation(desc, produit);
        System.out.println("Réclamation ajoutée.");
    }

    public void afficherReclamations() {
        for (int i = 0; i < nbReclamations; i++) {
            System.out.println(reclamations[i]);
        }
    }

    public void changerStatutReclamation() {
        System.out.print("Nom du produit concerné : ");
        String produit = scanner.nextLine();
        for (int i = 0; i < nbReclamations; i++) {
            if (reclamations[i].getProduitConcerne().equalsIgnoreCase(produit)) {
                System.out.print("Nouveau statut (Ouvert/Résolu) : ");
                String statut = scanner.nextLine();
                reclamations[i].setStatut(statut);
                System.out.println("Statut mis à jour.");
                return;
            }
        }
        System.out.println("Réclamation non trouvée.");
    }
}
