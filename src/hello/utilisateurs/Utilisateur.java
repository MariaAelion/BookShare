/**
 * 
 */
package hello.utilisateurs;

/**
 * @author Dell
 *
 */
abstract public class Utilisateur {
	protected String nom;
	protected String prenom;
	protected String numAdherent;
	
	
	//setter pour donner la valeur
	public Utilisateur nom (String nom) {
		this.nom=nom;
		return this;		
	}
	
	//getter pas de parametres car recupere et renvoie vers exterieur
	public String nom () {
		return this.nom;
	}
	
	public Utilisateur prenom(String prenom) {
		this.prenom=prenom;
		return this;
	}
	
	public String prenom () {
		return this.prenom;
		
	}
	
	public Utilisateur numAdherent(String numAdherent) {
		this.numAdherent=numAdherent;
		return this;
	}
	
	public String numAdherent () {
		return this.numAdherent;
	}


	
	
}
