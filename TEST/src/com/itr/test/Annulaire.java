package com.itr.test;

import java.util.HashMap;
import java.util.Map;

public class Annulaire {
	private Map<String, Personne> map;

	public Annulaire() {

	}

	public Annulaire(Map map) {

	}

	public void addNewPerson(Personne personne) {
		this.map.put(personne.getNomComplet(), personne);
	}

	public Personne getPerson(String nomComplet) {
		return this.map.get(nomComplet);
	}

	public void afficherToutesLesContacts() throws NoContactInfoException {
		for (Personne p : this.map.values()) {
			System.out.println(p.toString() + p.getContactInfo().toString());

		}
	}
}
