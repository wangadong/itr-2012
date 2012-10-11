package com.itr.test;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe {

	private List<Employe> employeList;
	private Manager boss;

	public Manager(String nom, String prenom, boolean sexe, int anneeNaissance,
			int numero, Entreprise entreprise, Manager boss) {
		super(nom, prenom, sexe, anneeNaissance, numero, entreprise);
		this.setBoss(boss);
		this.employeList = new ArrayList<Employe>();
		// TODO Auto-generated constructor stub
	}

	public void addNewEmploye(Employe employe) {
		this.employeList.add(employe);
		if (employe instanceof Manager) {
			((Manager) employe).setBoss(this);
		}
	}

	public void afficherHierarchie() {
		if (this.boss != null) {
			System.out.println(this.getNom() + " a pour chef "
					+ this.boss.getNom());
			this.boss.afficherHierarchie();
		} else {
			System.out.println(this.getNom() + " est le patron");
		}

	}

	public int nombreEmployes() {
		int nombre = employeList.size();
		for (Employe employe : this.employeList) {
			if (employe instanceof Manager) {
				nombre += ((Manager) employe).nombreEmployes();
			}
		}
		return nombre;

	}

	public Manager getBoss() {
		return boss;
	}

	public void setBoss(Manager boss) {
		this.boss = boss;
	}

	public int nombreDeFemmes() {
		int nombreDeFemmes = 0;
		for (Employe employe : this.employeList) {
			if(employe.isSexe()==false){
				nombreDeFemmes++;
			}
			if (employe instanceof Manager) {
				nombreDeFemmes += ((Manager) employe).nombreDeFemmes();
			}
		}
		return nombreDeFemmes;
	}
	public float pourcentageDeFemmes(){
		return (float)this.nombreDeFemmes()/(float)this.nombreEmployes();
	}

	@Override
	public String toString() {
		String str = super.toString()
				+ (boss != null ? (" Sous ordre de " + this.boss.getNom())
						: " Patron de l'entreprise ") + "qui s'occupe de "
				+ employeList.size() + " employes.";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
