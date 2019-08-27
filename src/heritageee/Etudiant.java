package heritageee;

public class Etudiant extends Personne{
protected int cne;

public Etudiant() {
	super();
	// TODO Auto-generated constructor stub
}

public Etudiant(String nom,String prenom,int cne) {
	super(nom,prenom);
	this.cne = cne;
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Je suis l’étudiant "+this.nom+" "+this.prenom+" mon CNE est: " + cne +"\n";
}

public int getCne() {
	return cne;
}

public void setCne(int cne) {
	this.cne = cne;
}

@Override
public int compareTo(Personne o) {
	// TODO Auto-generated method stub
	return 0;
}



}



