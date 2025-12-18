package Gazta;

import java.util.*;

public class Gazta {

		static String gazta_mota;
		
		static int esne_kantitatea;
		
		static double pisua;
	
		public static void lortuPisua() {
		
			Scanner s = new Scanner(System.in);
		
		 	System.out.println("Sartu gazta mota (Idiazabal edo Urdina): ");
		
			gazta_mota = s.nextLine();
		
			System.out.println("Sartu gazta kantitatea (zenbaki osoa): ");
		
			esne_kantitatea = s.nextInt();
			
			switch (gazta_mota.toLowerCase()) {
			case "idiazabal":
				pisua = esne_kantitatea * 0.01;
				break;
			case "urdina":
				pisua = esne_kantitatea * 0.09;
				break;
}
		System.out.println("Lortuko duzun gaztaren pisua " +pisua+ "Kg da.");
}}