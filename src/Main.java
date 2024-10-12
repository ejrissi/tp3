
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MaDate a = new MaDate(2024);
        MaDate b = new MaDate(2024);
        MaDate c = new MaDate(2024);

        a.setjour(30);
        a.setmois(4);

        b.setjour(20);
        b.setmois(2);

        c.setjour(11);
        c.setmois(7);

        a.ToString();
        b.ToString();
        c.ToString();

        Scanner re = new Scanner(System.in);

        System.out.println("Ajout d’un jour :1  ");
        System.out.println("Ou ajout de plusieurs jours :2");
        System.out.println("Ajout d’un mois :3");
        System.out.println("Ajout d’une année :4");
        int n = re.nextByte();

        int bb;

        switch (n) {
            case 1:
                a.AjouterUnJour();
                break;

            case 2:
                System.out.println("donner  le nombre de jour :");
                bb= re.nextByte();
                a.ajouterPluseursJours(bb);

                break;
            case 3:
               
                a.ajouterUnMoi();
                break;
            case 4:
             
               
                a.ajouterUnAnn();
                break;
            default:
            System.out.println("Choix invalide.");
            break;
        }


        a.ToString();

    }
}
