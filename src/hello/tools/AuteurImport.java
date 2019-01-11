/**
 * 
 */
package hello.tools;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import hello.livre.Livre;

/**
 * @author Dell
 *
 */
public class AuteurImport {
	
	private File auteurFile;
	
	private static final String FIELD_SEP= ";" ; // variable de classe
	
	private ArrayList <String[]> auteurs; 	// array liste specifie par un tableau de chaine
	
	//TODO ajouter un moyen de definir si oui ou non il ya une ligne d'en tete
	
	public AuteurImport() { //constructeur
		
		// instancier le arraylist
		this.auteurs=new ArrayList<String[]>(); //instancier appelle le constructuer initialise ds memoire obj de type chaine
		
		
		//Instancier la classe File donc...creer l'objet auteurFile
		this.auteurFile= new File("c:\\workspace\\auteurs.txt"); // echapper echappement de windows
		if(this.auteurFile.exists()) { //methode classe file si existe et peut lire
			if(auteurFile.canRead()) {//si conditions reunies on entre ds methode qui va traite doc
				this.process(); //method qui va traiter
			
		} else {
			System.out.println("le fichier n'est pas lisible");
		} }
		else {
			System.out.println("Le fichier n'existe pas");
		
	
		}
		
		}
	//getter pour instancier 
			public ArrayList <String[]> getAuteurs(){ 
				return this.auteurs;
}
			
				
			
	/**
	 * TODO trouver un moyen de compter le nombre de colonnes 
	 * pour chaque ligne..
	 */
	private void process() { 
		// TODO compter le nombre de colonnes dans une ligne lue
		try {
			Scanner fileScanner= new Scanner(auteurFile); //scanner pcq pas bcp de lignes ds fichier iterateur
			
			int rowCount=0;
			while(fileScanner.hasNext()) { //boucles tant que y en a parcours , retourne booleen tant qu true
				String row=fileScanner.nextLine();
				
				if(rowCount>0) { // enleve l entete
					//on doit parser row
				String[] cols=	row.split(AuteurImport.FIELD_SEP); 
				// on doit ranger le tableau dans un ArrayList qui contient 1 tab pour chaque elt
				
				this.auteurs.add(cols); //arraylist
				 
			}
			rowCount++; 
			}
			
		} catch(IOException ioe) {
		//your logic here
	}

	}
	
	/* pour verif que le split a marche
	 * String message= "";				
				for (int i=0; i< cols.length;i++) { // pour voir si split a fonctionner
					message += cols[i] + " " ;
				}
				message += "\n";
				System.out.println(message);
	 */
	}

	
