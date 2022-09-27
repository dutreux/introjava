package intro.java;

public class App {

    public static void main(String[] args) {
    }
    // Récupérer le nombre d'heures travaillées
    // int heuresTravaillées = 120;

    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez votre nombre d'heures travaillées : ");
    int heuresTravaillées = clavier.nextInt();

    //récupérer le taux haoraire
    System.out.print("Entrz votre taux horaire : ");
    double tauxHoraire = clavier.nextDouble();

    clavier.close();

    //Multiplier le nombre d'heures par le taux horaire

}
