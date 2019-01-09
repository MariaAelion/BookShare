/**
 * 
 */
package hello.utilisateurs;

import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class CreateUsers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		System.out.println(((Loueur)loueur).listBooks());
		
				
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
