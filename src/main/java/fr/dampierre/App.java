package fr.dampierre;
import java.util.Scanner;
     
public class App {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int min_salaire=3000;
        int min_nbrAns=2;
        System.out.println("saisir votre salaire annuel:");
        int sal_annuel= sc.nextInt();
        System.out.println("saisir combien d'années vous avez travaillé:");
        int nbr_anstravailles= sc.nextInt();
        if (sal_annuel> min_salaire && nbr_anstravailles> min_nbrAns){
            System.out.println("Félicitation! vous pouvez obtenir le pret");
        }
        else {
            System.out.println("Désolé! vous pouvez pas obtenir le pret");
        }
   
    }
}
