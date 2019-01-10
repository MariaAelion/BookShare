package hello.utilisateurs;


import java.util.HashMap;
import java.util.Map;

import hello.livre.Livre;
import hello.utilisateurs.interfaces.LoueurInterface;

public class Loueur extends Utilisateur implements LoueurInterface{
	private HashMap <Livre, Integer> books;
	
	public Loueur() { // constructeur
		//instancie l'objet HashMap proprement dit
		this.books = new HashMap<Livre, Integer>();
	}

	public String booksNumber() { //on peut aussi l'afficher
		String message= " Nombre de livres : ";
		message +=this.books.size(); // concatenation
		return message;
	}
	
	public String listBooks() {
		String message = "Livres de la collection de " + this.nom + "\n";
		
		//boucle sur la collection des livres
		for (Map.Entry<Livre,Integer> stockLivres : this.books.entrySet()) { //recupere chaque elt a chaq iteration
			
		message += stockLivres.getKey().titre()+ "   & le nombre (" + stockLivres.getValue() + ")\n";
		}
		return message;
	}
	
	
	@Override
	public Utilisateur addBook(Livre livre) {
		// TODO Auto-generated method stub
	 //put comme add pour hashmap 
		
		if (this.books.containsKey(livre)) { // cherche si livre est deja et si oui on ajoute plus 1
			Integer oldValue = this.books.get(livre); 
			oldValue=oldValue+1;
			this.books.replace(livre, oldValue); // ou oldValue++
			
		}else {
			this.books.put(livre, 1); //put comme add pour hashmap donc etait pas dans coll donc je l'ajoute et met 1 exemplaire
		}
			
		//	if (!this.books.contains(livre)) 
		//this.books.add(livre);
		
		return this;
		}
	

	@Override
	public Utilisateur loan(Livre livre) {
		// TODO Auto-generated method stub
				
		if (this.books.containsKey(livre) && this.books.get(livre) >0) {
			Integer oldValue = this.books.get(livre); 
			oldValue=oldValue-1;
			this.books.replace(livre, oldValue);	
				
		}
		
			return this;
	}

	@Override
	public Utilisateur calculeCotisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur toEmprunteurLoueur() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
