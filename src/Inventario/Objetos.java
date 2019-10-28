package Inventario;

import java.util.Scanner;

import Personajes.Heroe;
import Principal.Main;

public class Objetos {
	
	static Scanner reader = new Scanner(System.in);
	
	public static void Misobjetos(Heroe jug, Inventario inv, int encombate) {
		int eleccion=1;
		while(eleccion!=0) {
			System.out.println("Tienes: ");
			System.out.println("\t1. Poción vida(cura " + jug.getVidamax()/4 + "): " + inv.getNumpocvida() );
			System.out.println("\t2. Poción maná(restaura " + jug.getManamax()/4 + "): " + inv.getNumpocmana() );
			System.out.println("\t3. Revivir (te revive al morir): " + inv.getNumrevivir() );
			System.out.println("\t4. Armadura: " + inv.getArmadura());
			if(encombate==0) {
				System.out.println("\t5. Comprar objetos");
			}
			System.out.println("\t0. Salir");
			eleccion =  reader.nextInt(); 
			if(eleccion==1) {Usar.Usarpocvida(jug, inv);}
			if(eleccion==2) {Usar.Usarpocmana(jug, inv);}
			if(eleccion==5) {Comprarobjetos(jug, inv);}
			
	 	}
	}
	public static void Comprarobjetos(Heroe jug, Inventario inv) {
		System.out.println("¿Qué quieres comprar? Tienes: " + jug.getOro() + " oros");
		System.out.println("\t1. Poción vida (tienes: " + inv.getNumpocvida() + "): " + jug.getVidamax()/10 + " oros");
		System.out.println("\t2. Poción maná (tienes: " + inv.getNumpocmana() + "): " + jug.getManamax()/10 + " oros");
		System.out.println("\t3. Revivir (tienes: " + inv.getNumrevivir() + "): " + jug.getNivel()*50 + " oros");
		System.out.println("\t4. Armadura bronce (30 puntos): 30 oros ");
		System.out.println("\t5. Armadura oro (60 puntos): 45 oros ");
		System.out.println("\t6. Armadura diamante (100 puntos): 65 oros ");
		System.out.println("\t0. Salir");
		int eleccion =  reader.nextInt();
		if(eleccion==1) {int precio=jug.getVidamax()/10; Comprar.Comprarpocvida(jug, inv, precio);}
	 	if(eleccion==2) {int precio=jug.getManamax()/10; Comprar.Comprarpocmana(jug, inv, precio);}
	 	if(eleccion==3) {int precio=jug.getNivel()*50; Comprar.Comprarrevivir(jug, inv, precio);}
	 	if(eleccion==4) {int num = 30; int precio = 30; Inventario.setCompArmadura(jug, inv, num, precio);}
		if(eleccion==5) {int num = 60; int precio = 45; Inventario.setCompArmadura(jug, inv, num, precio);}
		if(eleccion==6) {int num = 100; int precio = 65; Inventario.setCompArmadura(jug, inv, num, precio);}
	 	if(eleccion==0) {int encombate=0; Misobjetos(jug, inv, encombate);}
	}
}
