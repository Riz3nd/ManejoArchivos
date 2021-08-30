package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {
	
	public static void crearArchivo(String nombre) {
		File archivo = new File(nombre);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("Se creo el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirArchivo(String nombre, String contenido) {
		File archivo = new File(nombre);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha escrito en el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void anexarArchivo(String nombre, String contenido) {
		File archivo = new File(nombre);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha anexado en el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerArchivo(String nombre) {
		File archivo = new File(nombre);
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			var lectura = entrada.readLine();
			while(lectura != null) {
				System.out.println("Lectura: " + lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
