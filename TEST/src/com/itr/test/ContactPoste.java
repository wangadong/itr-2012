package com.itr.test;

public class ContactPoste extends Contact {
	public ContactPoste(String info) {
		super.setInfo(info);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Poste:" + this.getInfo();
	}

}
