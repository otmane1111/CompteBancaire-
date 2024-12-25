package otmane;

public class CompteBancaire {
    private int numero;
    private double solde;
    private String nom;

    public CompteBancaire(int numero, double solde, String nom) {
        this.numero = numero;
        this.solde = solde;
        this.nom = nom;
    }

    public CompteBancaire() {
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public String getNom() {
        return nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void depotSold(double soldo) throws CompteInexistantException{
        this.solde = this.solde + soldo;
        if (this.numero == 0) {
            throw new CompteInexistantException("Compte inexistant");
        }
    }

    public void RetraitDeSolde(double sold)throws FondsInsuffisantsException{
        this.solde = this.solde - sold;
        if(this.solde<0){
           throw new FondsInsuffisantsException("Fonds insuffisants");
        }
    }
    public void afficheSolde() {
        System.out.println("Solde: " + getSolde());
    }
    public void TransfereArgent(CompteBancaire compteBancaire,CompteBancaire compteBancaire2,double sold) throws FondsInsuffisantsException, CompteInexistantException {
        compteBancaire.RetraitDeSolde(sold);
        compteBancaire2.depotSold(sold);

    }

    @Override
    public String toString() {
        return "nom = " + nom + ", numero = " + numero + ", solde = " + solde;
    }

}
