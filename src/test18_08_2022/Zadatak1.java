package test18_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
////		Napisati program koji simulira notifikaciju za 
//		novu verziju aplikacije. Korisnik unosi verziju
//		aplikacije koju ima instaliranu na svom racunaru 
//		a zatim najnoviju verziju, nakon cega se ispisuje notifikacija.
////		Verzija aplikacije se sastoji od major i minor 
//		broja. Aplikacije imaju verziju uglavnom u formatu 
//		major.minor i primer bi bio Facebook 2.1 gde je major=2 i minor=1
////		Aplikacija je novije verzije ukoliko je:
////		major broj veci ili
////		ukoliko je major isti, tada nova verzija ima veci minor
////
////		Napomena: Smatrati da korisnik za najnoviju verziju unosi 
//		vecu ili istu verziju od instalirane, nikako manju.

 Scanner s = new Scanner (System.in);
 
 System.out.println("Unesite major verziju instalirane aplikacije:");
 int major = s.nextInt();	
 System.out.println("Unesite minor verziju instalirane aplikacije:");
 int minor = s.nextInt();	
 System.out.println("Unesite major verziju najnovije aplikacije:");
 int majorNew = s.nextInt();	
 System.out.println("Unesite minor verziju najnovije aplikacije:");
 int minorNew = s.nextInt();	
 
 
 if(major <= majorNew || (major == majorNew && minor < minorNew)) {
	 System.out.println("Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.");
	 
 } else {
	 System.out.println("Notifikacija: Vec imate najnoviju verziju na svom racunaru.");
 }
 
	}

}
