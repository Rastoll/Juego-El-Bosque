package Inventario;

import Personajes.Heroe;
import Principal.Cosas;

public class Usar {

	public static void Usarpocvida(Heroe jug, Inventario inv) {
		if(inv.getNumpocvida()>0) {
			inv.setNumpocvida(inv.getNumpocvida()-1);
			jug.setVida(jug.getVida()+jug.getVidamax()/4);
			Cosas.ComprobarVida(jug);
			System.out.println("Usas una poción y te curas " + jug.getVidamax()/4 + " puntos de vida");
		}else {System.out.println("No tienes pociones");}
	}
	public static void Usarpocmana(Heroe jug, Inventario inv) {
		if(inv.getNumpocmana()>0) {
			inv.setNumpocmana(inv.getNumpocmana()-1);
			jug.setMana(jug.getMana()+jug.getManamax()/4);
			Cosas.ComprobarMana(jug);
			System.out.println("Usas una poción y restauras " + jug.getManamax()/4 + " puntos de maná");
		}else {System.out.println("No tienes pociones");}
	}
	
}
