/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_13;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_13 {

public static int getRandom(int... numbers) {
		int num;	// Random number
		boolean isExcluded; // Is the number excluded
		do { 
			isExcluded = false;
			num = 1 + (int)(Math.random() * 5);
			for (int e: numbers) {
				if (num == e)
					isExcluded = true;
			}
		} while (isExcluded); // Test if number is Excluded
		return num;
	}
}
   
