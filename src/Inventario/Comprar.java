package Inventario;

import Personajes.Heroe;

public class Comprar {

	public static void Comprarpocvida(Heroe jug, Inventario inv, int precio) {
		if(jug.getOro()>=precio) {
			jug.setBajaroro(precio);
			inv.setNumpocvida(inv.getNumpocvida()+1);
		}else {System.out.println("No tienes suficiente dinero");}
	}
	public static void Comprarpocmana(Heroe jug, Inventario inv, int precio) {
		if(jug.getOro()>=precio) {
			jug.setBajaroro(precio);
			inv.setNumpocmana(inv.getNumpocmana()+1);
		}else {System.out.println("No tienes suficiente dinero");}
	}
	public static void Comprarrevivir(Heroe jug, Inventario inv, int precio) {
		if(jug.getOro()>=precio) {
			jug.setBajaroro(precio);
			inv.setNumrevivir(inv.getNumrevivir()+1);
		}else {System.out.println("No tienes suficiente dinero");}
	}
}
