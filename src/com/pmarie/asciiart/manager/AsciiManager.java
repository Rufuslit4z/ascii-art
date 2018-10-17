package com.pmarie.asciiart.manager;

import java.util.Scanner;

import com.pmarie.asciiart.alphabets.DefaultAlphabet;
import com.pmarie.asciiart.alphabets.datas.AlphabetDatas;

public class AsciiManager {
	// Privé
	private DefaultAlphabet alphabet;
	
	// Public
	public AsciiManager(DefaultAlphabet alphabet) {
		this.alphabet = alphabet;
	}
	
	public String[] getAsciiTranslation(String message) {
		String[] asciiArt = new String[this.alphabet.getH()];
		
		// Pour le ascii art CG
		//int asciiMin = 65;
		//int asciiMax = 90;
		// Pour le ascii art BLOCK
		int asciiMin = 32;
	    int asciiMax = 126;
	    char interro = '?';
	    int asciiArtInterro = 1;
	    
	    //Scanner in = new Scanner(System.in);
	    int H = this.alphabet.getH();
	    int W = this.alphabet.getW();
	    
	    message = message.toUpperCase();
	    String chaine = new String();
	    char c[] = message.toCharArray();
	    String[] tabROW = this.alphabet.getDatas();
	    
	    for(int i = 0; i < H; i++) {
	    	String ROW = tabROW[i];
	    	chaine="";
	        for(int j=0; j < c.length; j++){
	            int  ascii = c[j];
	            if(ascii >= asciiMin && ascii <= asciiMax){
	                ascii = ascii - asciiMin;
	                ascii = ascii * W;
	                chaine=chaine+ROW.substring(ascii, (ascii + W));
	            } else {
	                c[j]   = interro;
	                ascii  = (asciiMax - asciiMin + asciiArtInterro) * W;
	                chaine = chaine+ROW.substring(ascii, (ascii + W));
	            }
	        }    
	        asciiArt[i] = chaine;
	    }
	    return asciiArt;
	}
}