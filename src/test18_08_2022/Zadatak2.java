package test18_08_2022;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji cuva dva niza celih brojeva, 
//		jedan za parne brojeve a drugi za neparne brojeve. 
//		Program sa tastature ucitava N brojeva koje unosi 
//		korisnik i parne brojeve dodaje u niz parnih brojeva 
//		a neparne brojeve u niz neparnih. Na kraju programa odstampati brojeve oba niza. 
//		Nizovi se stampaju koristeci petlje.

		ArrayList<String> neparni = new ArrayList <String>();
		ArrayList<String> parni = new ArrayList <String>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite N:");
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Unesite broj:");
			String input = s.next();
			if(input % 2 == 0) {
				parni.add(input);
			} else {
				neparni.add(input);
			}
			
		} 
		
		for (int i =0; i< parni.size();i++) {
			System.out.println(parni.get(i) + ", ");
		}
		
		for (int i =0; i< neparni.size();i++) {
			System.out.println(neparni.get(i) + ", ");
		}
	}

}
