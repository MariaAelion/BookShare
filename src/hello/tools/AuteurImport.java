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
	
	private ArrayList <String[]> auteurs; 
	// array liste specifie par un tableau de chaine
	
	//TODO ajouter un moyen de definir si oui ou non il ya une ligne d'en tete
	
	public AuteurImport() {
		
		// instancier le arraylist
		this.auteurs=new ArrayList<String[]>(); //instancier appelle le constructuer
		
		
		//Instancier la classe File donc...creer l'objet auteurFile
		this.auteurFile= new File("c:\\workspace\\auteurs.txt"); // echapper echappement de windows
		if(this.auteurFile.exists()) {
			if(auteurFile.canRead()) {
				this.process();
			
		} else {
			System.out.println("le fichier n'est pas lisible");
		} }
		else {
			System.out.println("Le fichier n'existe pas");
		
	
		}
		
		}
	//getter pour instancier new auteur
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
			Scanner fileScanner= new Scanner(auteurFile);
			
			int rowCount=0;
			while(fileScanner.hasNext()) {
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

	
