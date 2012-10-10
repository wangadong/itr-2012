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
		employeList = new ArrayList<Employe>();
		// TODO Auto-generated constructor stub
	}

	public void addNewEmploye(Employe employe) {
		employeList.add(employe);
	}

	public Manager getBoss() {
		return boss;
	}

	public void setBoss(Manager boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		String str = super.toString() + "Sous ordre de " + this.boss.getNom()
				+ "qui s'occupe de " + employeList.size() + " employes.";
		return str;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
