/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public final class Loueur extends Utilisateur {
	private int nbLivres;
	private double cotisation;
	private double cotisationTTC;
	/**
	 * 
	 */
	public Loueur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	public Loueur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		// TODO Auto-generated constructor stub
	}
	

	
	
	//getter
	public int nbLivres() {
		return this.nbLivres;
	}
	//setter
	public Loueur nbLivres(int nbLivres) {
		this.nbLivres=nbLivres;
		return this;
	}
	
	public double calculeCotisation() {
		if(this.nbLivres < Parametre.NB_LIVRES_MINI) {
			this.cotisation=Parametre.MONTANT_COTISATION;
		}else {
			this.cotisation=Parametre.MONTANT_COTISATION - Parametre.MONTANT_COTISATION*Parametre.TX_REMISE;
		}
		return this.cotisation;
	}
	
	public double calculeCotisationTTC() {
		this.cotisationTTC= cotisation+cotisation*Parametre.TVA;
		return this.cotisationTTC;
		
	}
	
	//public Utilisateur clone() {
		//Emprunteur emprunteur = new Emprunteur ();
		//emprunteur.nom=this.nom;
		//emprunteur.Prenom=this.prenom;
		//emprunteur.numAdherent=this.numAdherent;
		
	
	//	return emprunteur;*/
		
	}
	
	
	


