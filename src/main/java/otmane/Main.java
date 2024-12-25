package otmane;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args)  {
        List<CompteBancaire> comptes = new ArrayList<>();
        CompteBancaire CB1 = new CompteBancaire(1,4000,"BANK CIH");
        CompteBancaire CB2 = new CompteBancaire(2,5000,"BANK CIH");
        CompteBancaire CB3 = new CompteBancaire(3,5500,"BANK ");
        comptes.add(CB1);
        comptes.add(CB2);
        comptes.add(CB3);
        for (CompteBancaire compte : comptes) {
            System.out.println(compte.toString());
        }
        System.out.println("-------------------------------------");
        comptes.remove(CB1);
        for (CompteBancaire compte : comptes) {
            System.out.println(compte.toString());
        }
        System.out.println("----------transfere d'argent------------------------");
        try {
            CB1.TransfereArgent(CB1,CB2,700);
            System.out.println(CB1);
            System.out.println(CB2);
        } catch (FondsInsuffisantsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------depot de solde -----------------");
        CB3.depotSold(33330);
        System.out.println(CB3);
        System.out.println("---------retirer de solde ---------------");
        try {
            CB3.RetraitDeSolde(3499);
            System.out.println(CB3);
        } catch (FondsInsuffisantsException e) {
            System.out.println(e.getMessage());
        }
    }
}
