package com.itr.test;

public class ContactTelephonique extends Contact {
	public ContactTelephonique(String info) {
		super.setInfo(info);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Telephone:" + this.getInfo();
	}

}
