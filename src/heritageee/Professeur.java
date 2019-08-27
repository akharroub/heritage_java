package heritageee;

public final class Professeur extends Employe {

	protected String specialite;

	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professeur(String nom,String prenom, double salaire,String specialite) {
		super(nom,prenom, salaire);
		this.specialite=specialite;
	}

	@Override
	public String toString() {
		return "Je suis le professeur "+this.nom+" "+this.prenom+" mon salaire est: " + this.Salaire+" euro ma spécialité est: "+specialite +"\n" ;
	}
	


	
}
