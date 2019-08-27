package heritageee;

public class Employe extends Personne  {
	protected  double Salaire;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nom,String prenom,double salaire) {
		super(nom, prenom);
		this.Salaire=salaire;
		// TODO Auto-generated constructor stub
	}

	public double getSalaire() {
		return Salaire;
	}

	public void setSalaire(double salaire) {
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return "Je suis l'employé "+this.nom+" "+this.prenom+" mon salaire est: " + Salaire+" euro \n";
	}

	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
