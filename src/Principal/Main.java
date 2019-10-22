package Principal;
import Personajes.Heroe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Combate.Caminar;
import Combate.Combate;
import Combate.Mazmorra;
import Inventario.Inventario;
import Inventario.Objetos;
import Personajes.Enemigos;

public class Main {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("�Cu�l es tu nombre?");
		String nombre = reader.next(); 
		
        Heroe jug = new Heroe(nombre, 100, 100, 10, 20, 1, 1, 0, 15, 30, 100, 100, 0);
        Inventario inv = new Inventario(0, 0, 0);
        
        //ArrayList<Enemigos> Enes = new ArrayList<Enemigos>();
        //Enes.add(new Enemigos("Murloc", 20, 20, 2, 5));
    
        Menu(jug, inv);
	}
	public static void Menu(Heroe jug, Inventario inv) {
		if(jug.getVida()>0) {
			int eleccion=1;
			while(eleccion!=0) {
				Heroe.barrajug(jug);
				System.out.println("\t1. Caminar (llevas " + jug.getKm() + " km)"
						+ "\n\t2. Mazmorra (a partir del km " + jug.getKmmazmo() + ")"
						+ "\n\t3. Objetos"
						+ "\n\t4. Curaci�n (" + jug.getCuramin() + " de man�)\n\t0. Salir");
				eleccion = reader.nextInt(); 
				if(eleccion==1) {int num = new Random().nextInt(jug.getNivel()+2)+1; Caminar.caminar(jug, num, inv);}
				if(eleccion==2) {Mazmorra.Avanzar(jug, inv);}
				if(eleccion==3) {int encombate=0; Objetos.Misobjetos(jug, inv, encombate);}
				if(eleccion==4) {Combate.Curar(jug);}
			}
		}
		
	}

}
