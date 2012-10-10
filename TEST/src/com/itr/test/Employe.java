package com.itr.test;
/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Employe extends Personne {

	/**
	 * num�? d'employ�? */
	private int numero;
	
	/**
	 * Entreprise dans laquelle travaille l'employ�? */
	Entreprise entreprise;
	
	/**
	 * @return the entreprise
	 */
	public Entreprise getEntreprise() {
		return entreprise;
	}

	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 */
	public Employe(String nom, String prenom, boolean sexe, int anneeNaissance,int numero, Entreprise entreprise) {
		super(nom, prenom, sexe, anneeNaissance);
		this.numero = numero;
		this.entreprise = entreprise;
	}
	
	
	/* (non-Javadoc)
	 * @see Personne#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" - travaille chez "+entreprise.getNom()+
		", numero "+this.numero;
	}

	public static void main(String[] args) {
		Entreprise comac = new Entreprise("Comac");
		Employe e1 = new Employe("Dassault","Marcel",true,1910,354,comac);
		Employe e2 = new Employe("Pang","Lei",false,1988,335, comac);
		Manager m1= new Manager("Ma", "Pang", false, 1988, 1, comac, null);
		m1.addNewEmploye(e2);
		m1.addNewEmploye(e1);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(m1.toString());
		
	}

}