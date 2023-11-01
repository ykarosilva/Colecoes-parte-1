package br.edu.uft.poo.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App_main {

	public static void main(String[] args) {
		List<String> L1 = new ArrayList();
		
		L1.add("Lucas Yudi");
		L1.add("Antonio Garcia");
		L1.add("Tarciso Freitas");
		L1.add("Ykaro Silva");
		L1.add("Kaique Marley");
		L1.add("Daniel Arruda");
		L1.add("Marcelo Alcantara");
		
		Collections.sort(L1);
		System.out.println(L1);
		
	}

}
