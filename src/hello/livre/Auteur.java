/**
 * 
 */
package hello.livre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hello.livre.exceptions.BirthDateException;

/**
 * @author Dell
 *
 */
public class Auteur {
	private String nom;	
	private String prenom;	
	private Date naissance;
	
	//constructeur prive interdit instanciation depuis le main
	private Auteur(String nom, String prenom, Date naissance) {
		this.nom=nom;
		this.prenom=prenom;
		this.naissance=naissance;
	}
//methode static qui fait ce que l'on veut
	public static Auteur getAuteur(String nom, String prenom, Date naissance) throws BirthDateException {
		Date today = new Date();
		if(naissance.after(today)) {
			throw new BirthDateException();
			//return null;
		} 
		Auteur auteur = new Auteur(nom,prenom,naissance);
		return auteur;
	} 
	
	public static Auteur getAuteur() throws ParseException, BirthDateException   {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Nom de l'auteur");
		String nom=scanner.nextLine(); // ecrit et recupere apres entree
		scanner.nextLine(); // reunitialise la memeoir tampon entree pour pouvoir retaper
				
	System.out.println("Prenom de l'auteur");
	String prenom=scanner.nextLine();
	scanner.nextLine();
				
	System.out.println("Date de naissance");
	String naissance =scanner.nextLine();
				
	//convertir naissance en type date
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	Date date = format.parse(naissance); // la date de naissance devient date en format date ajouter parse exception
		
	scanner.nextLine(); // vide la memoire
	scanner.close();//fermer l attente de la console
						
			
				
	//on peut instancier un nouvel auteur à partir des informations
return getAuteur (nom,prenom,date);
		
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public Auteur setNom(String nom) {
		this.nom = nom;
		return this;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public Auteur setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	/**
	 * @return the naissance
	 */
	public Date getNaissance() {
		return naissance;
	}

	/**
	 * @param naissance the naissance to set
	 */
	public Auteur setNaissance(Date naissance) {
		this.naissance = naissance;
		return this;
	}

}
