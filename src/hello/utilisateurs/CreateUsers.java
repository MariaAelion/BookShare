/**
 * 
 */
package hello.utilisateurs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import hello.livre.Auteur;
import hello.livre.Livre;
import hello.livre.exceptions.BirthDateException;
import hello.tools.AuteurImport;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 * @throws ParseException 
	 * 
	 * 
	 * 
	 */
	
	public static ArrayList<Auteur> listeAuteurs;
	
	public static void main(String[] args) throws ParseException, BirthDateException	 {
		// TODO Auto-generated method stub
		Utilisateur loueur=CreateUsers.createLoueur(); // on est direct dans la classe et static
		Utilisateur emprunteur=CreateUsers.createEmprunteur();
		Utilisateur emprunteurLoueur=createEmprunteurLoueur(); // package friendly et deja dans la classe
		
		if (loueur instanceof Loueur) {
			System.out.println(loueur.nom()+ " est un loueur ") ;
		}
		
		if (emprunteur instanceof Loueur) {
			System.out.println(emprunteur.nom()+ " est un loueur ") ;
		} else { 
			System.out.println(emprunteur.nom()+ " n'est pas  un loueur ") ;
			
		}
		
		if (emprunteurLoueur instanceof EmprunteurLoueur) {
			System.out.println(emprunteurLoueur.nom()+ " est un emprunteur loueur ") ;
		} else { 
			System.out.println(emprunteurLoueur.nom()+ " n'est pas un emprunteur loueur ") ;
			
		}
		
		// Creer un livre
		Livre livre=new Livre();
		livre.titre("Les Miserables")
			.resume ("bla bla")
			.nbPages(520);
		((Loueur)loueur).addBook(livre);
		((Loueur)loueur).addBook(livre);
		((Loueur)loueur).addBook(livre);
		System.out.println(((Loueur)loueur).booksNumber()); //afficher le nbre de livres avec titre differente
		System.out.println(((Loueur)loueur).listBooks());
		
		
		
		//creation d'un auteur
				// use case 1 : a la main
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse("1802-01-02");
		Auteur hugo = Auteur.getAuteur("Hugo","Victor",date); // 2 methodes getAuteur differents mais pas meme nb param
				
		//use case 2 : par la ligne de commande
		/*
		try {//essaye 
			Auteur azomiv = Auteur.getAuteur() ; //va enregistrer le nom taper dans variable azomiv
			System.out.println(azomiv.getNom());
			
		} catch (ParseException parseException) {
			
		//			
			System.out.println(azomiv.getNom()+ "  " + azomiv.getPrenom()+ " " + azomiv.getNaissance()); // ecrit le nom 
			
		System.out.println(" la datede naissance est incorrecte");
		System.out.println(parseException.getLocalizedMessage());
		
		} catch(BirthDateException naissance) {
	
			System.out.println(naissance.getMessage()); // affiche le message qui va avec erreur
		} */
		
			
	//Auteur azimov=Auteur.getAuteur();
	
	//creer les auteurs à partir d'un fichier delimite
	AuteurImport auteurs= new AuteurImport();
	
	
	//recuperer liste des auteurs
	ArrayList<String[]> lesAuteursImportes=auteurs.getAuteurs(); // renvoie liste ds laquelle g tableau de chaine dans lesAuteursimportes
	
	//boucler sur la liste des auteurs
	for (String[] unAuteur : lesAuteursImportes) { // 
		
			try { //fait une instance d'un auteur
		SimpleDateFormat leFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date laDate = format.parse(unAuteur[2]);
		listeAuteurs.add (Auteur.getAuteur (unAuteur[0],unAuteur[1],laDate));
			
		} catch (Exception e) { // prend toutes les excpetions de la classe mere pour fais s embeter
			//NOOP
			
		}
		
	}
	
	}
	
	private static Utilisateur createLoueur() {
		return new Loueur()
				.nom("Aubret")
				.prenom("Jean-Luc")
				.numAdherent("112212555");
		
	}
	
	private static Utilisateur createEmprunteur() {
		return new Emprunteur()
				.nom("Talaron")
				.prenom("Delphine")
				.numAdherent("0022155");
		
	}

	
	private static Utilisateur createEmprunteurLoueur() {
		return new EmprunteurLoueur()
				.nom("Sakolsanscotcz")
				.prenom("Nicole")
				.numAdherent("0021511");
		
	}
	
	
	
	
}
