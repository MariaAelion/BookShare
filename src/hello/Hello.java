/**
 * 
 */
package hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class Hello {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		//1ere facon creer objet
		Utilisateur moi = new Loueur();
		moi.setNom("Tartempion");
		moi.setPrenom("Jules");
		moi.setNumAdherent("5222122");
		
		System.out.println("Utilisateur : " + moi.getNom());
		
		
		//2eme facon avec constructeur 3parametres
		Utilisateur lui = new Loueur ("Bond", "James", "007");		
		System.out.println("My name is : " + lui.getNom());
		
		//3eme facon de creer objet
		//veut que cela soit du type utilisateur pour avoir une collection de tous les utilisateurs pour apres le map
		
		Utilisateur alien = new Loueur(); 
		alien
			.nom("ET")
			.prenom("Dvorak")
			.numAdherent("2224584");		
		((Loueur)alien).nbLivres(35); //cast de variable
			
		System.out.println( "Retour maison : " + alien.getNom() + " la cotisation HT est " +
		((Loueur)alien).calculeCotisation() + " la cotisation TTC est " + ((Loueur)alien).calculeCotisationTTC());
		
		
		//creation d'un nouveau livre
		
		Livre lesMiserables =new Livre();
		lesMiserables
			.titre("lesMiserables")
			.resume("blabla")
			.nbPages(300);
		System.out.println("Livre : " + lesMiserables.titre() + " resume " + lesMiserables.resume() + " avec " + lesMiserables.nbPages() + " pages ");

		
		Livre fondation =new Livre("Fondation","Pas lu",2);
		System.out.println("Livre : " + fondation.titre() + " resume " + fondation.resume() + " avec " + fondation.nbPages() + " pages ");
		
		//auteur?
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("2020-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo","Victor",date);
		if(hugo==null) {
			System.out.println("Impossible d'instancier hugo");
			
		}else {
			System.out.println("Auteur" + hugo.getNom());
		}
		
		
		
		
		
		
	}
	
	
	

}
 