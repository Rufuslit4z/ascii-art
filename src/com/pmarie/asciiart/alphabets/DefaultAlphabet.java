package com.pmarie.asciiart.alphabets;

public abstract class DefaultAlphabet {
	// Privé
	private int h;
	private int w;
	private String[] datas;
	
	// Public
	public DefaultAlphabet(int h, int w, String[] datas) {
		this.h = h;
		this.w = w;
		this.datas = datas;
	}

	public int getH() {
		return h;
	}

	public int getW() {
		return w;
	}

	public String[] getDatas() {
		return datas;
	}
}
