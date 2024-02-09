import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choix = 0;
        Apprenant app1 = new Apprenant();
        ArrayList<Apprenant> list = new ArrayList<>();
        do {
            System.out.println("** Menu **");
            System.out.println("1--------Ajouter un nouvel apprenant");
            System.out.println("2--------Modifier les informations ");
            System.out.println("3--------Supprimer un apprenant ");
            System.out.println("4--------Consulter la liste ");
            System.out.println("5--------Rechercher un apprenant ");
            System.out.println("   Enter votre choix : ");
            Scanner scanner1 = new Scanner(System.in);
            choix = scanner1.nextInt();
            switch (choix) {
                case 1:
                    //Ajouter
                    app1.AjouterApprent(list);
                    break;
                case 2:
                    //Modifier
                    app1.Modifier(list);
                    break;
                case 3:
                    //Supprimer
                    app1.Supprimer(list);
                    break;
                case 4:
                    //Consulter
                    app1.Afficher(list);
                    break;
                case 5:
                    //Rechercher
                    app1.Rechercher(list);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choix);
            }
        }while (choix!=6);
    }
}
