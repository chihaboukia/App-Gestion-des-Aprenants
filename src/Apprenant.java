import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant {
    private String Nom;
    private String Prenom;
    private String DateNais;
    private String Adresse;
    private int  Numtelephone;
    private int Numclasse;
    String nom2;

    Scanner scan=new Scanner(System.in);
    //constructor
    public Apprenant() {
        this.Nom = getNom();
        this.Prenom = getPrenom();
        this.DateNais=getDateNais();
        this.Adresse = getAdresse();
        this.Numtelephone= getNumtelephone();
        this.Numclasse = getNumclasse();

    }

    public void AjouterApprent(ArrayList<Apprenant> Tab){
        Apprenant app1 = new Apprenant();
        Scanner scan=new Scanner(System.in);
        System.out.printf("Nom :");
        app1.Nom=scan.next();
        System.out.printf("Prenom :");
        app1.Prenom = scan.next();
        System.out.printf("DateNais :");
        app1.DateNais=scan.next();
        System.out.printf("Adresse :");
        app1.Adresse=scan.next();
        System.out.printf("Tel :");
        app1.Numtelephone=scan.nextInt();
        System.out.printf("NumClasse :");
        app1.Numclasse=scan.nextInt();
        Tab.add(app1);
    }
    public  void  Afficher(ArrayList<Apprenant> Tab) {
        for(Apprenant A:Tab)
        {
            System.out.println("le Nom est :" + A.Nom);
            System.out.println("le pre est :" + A.Prenom);
            System.out.println("la date est :" +A.DateNais);
            System.out.println("le Add est :" + A.Adresse);
            System.out.println("le tel est :" + A.Numtelephone);
            System.out.println("le classe est :" + A.Numclasse);
            System.out.println("*****************************");
        }
    }
    public  void  AfficherunAppre(Apprenant A) {

        System.out.println("le Nom est :" + A.Nom);
        System.out.println("le pre est :" + A.Prenom);
        System.out.println("la date est :" +A.DateNais);
        System.out.println("le Add est :" + A.Adresse);
        System.out.println("le tel est :" + A.Numtelephone);
        System.out.println("le classe est :" + A.Numclasse);

    }
    public void modifierapp(Apprenant A){
        //Apprenant app1 = new Apprenant();
        System.out.printf("Nom :");
        A.Nom=scan.next();
        System.out.printf("Prenom :");
        A.Prenom = scan.next();
        System.out.printf("DateNais :");
        DateNais=scan.next();
        System.out.printf("Adresse :");
        A.Adresse=scan.next();
        System.out.printf("Tel :");
        A.Numtelephone=scan.nextInt();
        System.out.printf("NumClasse :");
        A.Numclasse=scan.nextInt();
        A.setNom(Nom);
        A.setPrenom(Prenom);
        A.setAdresse(Adresse);
        A.setNumtelephone(Numtelephone);
        A.setNumclasse(Numclasse);
    }
    public void Modifier(ArrayList<Apprenant> Tab)
    {
        String prenom2 ;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter le prenom");
        prenom2 = scan.next();
        for (Apprenant C:Tab)
        {
            if (prenom2.equals(C.getPrenom()))
            {
                C.modifierapp(C);
                break;
            }
        }
    }
    public void Supprimer(ArrayList<Apprenant> Tab){
        System.out.println("enter le nom");
        nom2 = scan.next();
        for (Apprenant B :Tab){
            if (nom2.equals(B.getNom())) {
                Tab.remove(B);
                System.out.println("supprimer avec succes");
                break;
            }
        }
    }

    public void Rechercher(ArrayList<Apprenant> Tab)
    {
        System.out.println("enter le nom");
        nom2 = scan.next();
        for (Apprenant appr :Tab) {
            if (nom2.equals(appr.getNom())) {
                appr.AfficherunAppre(appr);
            }
        }
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getDateNais() {
        return DateNais;
    }

    public void setDateNais(String dateNais) {
        DateNais = dateNais;
    }

    public String getAdresse() {
        return Adresse;
    }
    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public int getNumtelephone() {
        return Numtelephone;
    }

    public void setNumtelephone(int numtelephone) {
        Numtelephone = numtelephone;
    }

    public int getNumclasse() {
        return Numclasse;
    }
    public void setNumclasse(int numclasse) {
        Numclasse = numclasse;
    }

}