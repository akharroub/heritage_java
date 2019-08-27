package heritageee;

import java.util.ArrayList;
import java.util.List;

public class Programme {

	public static void main(String[] args) {
		
		List<Personne> listPersonnes = new ArrayList<Personne>();
		
		Employe em = new Employe("Ambroise", "Delalin", 1900.0 );
		Employe emm = new Employe("François", "Vandenplas", 1800.0 );
		
		Etudiant e = new Etudiant("Julien", "Chombart", 65678754);
		Etudiant ee = new Etudiant("Sebastien", "Fremy ", 87543543);
		
		Professeur p = new Professeur("Stili","Oussama" , 2000.0, "JAVA/JEE");
		Professeur pp = new Professeur("Thomas","Savaton" , 2000.0, "Mathématique");
		
		listPersonnes.add(em);
		listPersonnes.add(emm);
		listPersonnes.add(e);
		listPersonnes.add(ee);
		listPersonnes.add(p);
		listPersonnes.add(pp);
		
		for (Personne personne : listPersonnes) {
			System.out.println(personne);
		}
		
		

	}

}
