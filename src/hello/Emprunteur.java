/**
 * 
 */
package hello;

/**
 * @author Dell
 *
 */
public class Emprunteur extends Utilisateur {
	private int nbLivres;
	private int duree;

	/**
	 * 
	 */
	
	//constructeur vide
	public Emprunteur() {
		super();
		this.nbLivres=5;
		this.duree=15;
	}
	
		
	/**
	 * @param nom
	 * @param prenom
	 * @param numAdherent
	 */
	
	//constructeur avec parametres
	public Emprunteur(String nom, String prenom, String numAdherent) {
		super(nom, prenom, numAdherent);
		this.nbLivres=5;
		this.duree=15;
	}
			
		//getter
		public int nbLivres() {
			return this.nbLivres;
		}
		//setter
		public Emprunteur nbLivres(int nbLivres) {
			this.nbLivres=nbLivres;
			return this;
		}
		
	public double calcule () {
		return this.nbLivres * this.duree*Parametre.COUT_LOCATION;
	}
	
	
	

	
}
