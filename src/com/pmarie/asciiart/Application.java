/**
 * 
 */
package com.pmarie.asciiart;

import com.pmarie.asciiart.alphabets.AlphabetBlock;
import com.pmarie.asciiart.alphabets.DefaultAlphabet;
import com.pmarie.asciiart.alphabets.MonAlphabet;
import com.pmarie.asciiart.alphabets.datas.AlphabetDatas;
import com.pmarie.asciiart.manager.AsciiManager;
import com.pmarie.asciiart.utils.ScannerProvider;

/**
 * @author pmarie
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DefaultAlphabet alpha = new AlphabetBlock();
		AsciiManager manager = new AsciiManager(alpha);
		String[] a = manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
