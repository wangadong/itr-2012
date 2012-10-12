package com.itr.test;
/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Entreprise implements Contactable{
	/**
	 * nom de l'entreprise
	 */
	private String nom;
	private Contact contact;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * constructeur qui cr? une entreprise
	 */
	public Entreprise(String nom) {
		this.nom = nom;
	}

	@Override
	public void setContactInfo(Contact contact) {
		// TODO Auto-generated method stub
		this.contact=contact;
	}

	@Override
	public Contact getContactInfo() {
		// TODO Auto-generated method stub
		Contact contact=this.contact;
		return contact;
	}

}
