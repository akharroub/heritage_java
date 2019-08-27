package heritageee;

public abstract class Personne implements Comparable<Personne>{
	
	protected String nom;
	protected String prenom;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(String nom,String prenom) {
		super();
		this.nom = nom;
		this.prenom=prenom;
	}

	@Override
	public String toString() {
		return nom+" "+prenom ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	
	

}
