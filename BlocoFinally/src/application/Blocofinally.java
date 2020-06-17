package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Blocofinally {

	private static Scanner sc;

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt");
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opeing file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
