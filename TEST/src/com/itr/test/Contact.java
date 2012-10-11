package com.itr.test;

public abstract class Contact {
	private String info;

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public abstract String toString();

}
