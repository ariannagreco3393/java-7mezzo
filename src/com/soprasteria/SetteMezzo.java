package com.soprasteria;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SetteMezzo {

	public static void main(String[] args) {
		Random r = new Random();
		int[] mazzoCarte = new int[40];
		
		
		
		for (int i = 0; i < 40; i++) {
			while(true) {
				boolean numerogiapresente = false;
				int numeroRandom = r.nextInt(40) + 1;
				for(int x = 0; x < 40; x++) {
					if(mazzoCarte[x] == numeroRandom) {
						numerogiapresente = true;
						break;
					}
				}
				if(!numerogiapresente) {
					mazzoCarte[i] = numeroRandom;
					break;
					
				}
					
			}
			
		}
		
		for (int i = 0; i < 40; i++) {
			System.out.print(" " + mazzoCarte[i]);
		}
		
	}

}
