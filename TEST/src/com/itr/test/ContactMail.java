package com.itr.test;

public class ContactMail extends Contact {
	public ContactMail(String info) {
		super.setInfo(info);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mail:" + this.getInfo();
	}

}
