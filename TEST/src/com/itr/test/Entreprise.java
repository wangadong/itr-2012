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
	private ContactTelephonique tele;
	private ContactMail mail;
	private ContactPoste poste;

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
		if(contact instanceof ContactTelephonique){
			this.tele=(ContactTelephonique) contact;
		}else if(contact instanceof ContactMail){
			this.mail=(ContactMail)contact;
		}else if(contact instanceof ContactPoste){
			this.poste=(ContactPoste)contact;
		}

	}

	@Override
	public Contact[] getContactInfo() {
		// TODO Auto-generated method stub
		Contact[] contacts={this.tele,this.mail,this.poste};
		return contacts;
	}

}
