package Personajes;

import java.util.Scanner;

public class Habilidades {
	
	static Scanner reader = new Scanner(System.in);

	public static void Menu (Heroe jug) {
		int eleccion=1;
		while(eleccion!=0) {
			System.out.println("¿Qué quieres mejorar? Puntos: " + jug.getPuntos());
			System.out.println("\t1. Vida máx (1 punto): +" + jug.getVidamax()/4);
			System.out.println("\t2. Maná máx (1 punto): +" + jug.getManamax()/4);
			System.out.println("\t3. Ataque (2 puntos): +" + jug.getAtaquemin()/4 + "/+" + jug.getAtaquemax()/4);
			System.out.println("\t4. Curación (2 puntos): +" + jug.getCuramin()/4 + "/+" + jug.getCuramax()/4);
			System.out.println("\t5. Desbloquear Bola de fuego (3 puntos)");
			System.out.println("\t0. Salir ");
			eleccion = reader.nextInt(); 
			if(eleccion==1) {Mejvida(jug);}
			if(eleccion==2) {Mejmana(jug);}
			if(eleccion==3) {Mejataque(jug);}
			if(eleccion==4) {Mejcura(jug);}
			if(eleccion==5) {if(jug.getBolfue()==0) {Compbolafue(jug);}else{System.out.println("Ya tienes eso");}}
			if(eleccion==0) {}
		}
	}
	public static void Compbolafue(Heroe jug) {
		if(jug.getPuntos()>2) {
			jug.setBolfue(1);
			jug.setPuntos(jug.getPuntos()-3);
		}else {System.out.println("No tienes puntos");}
	}
	public static void Mejvida(Heroe jug) {
		if(jug.getPuntos()>0) {
			jug.setVidamax(jug.getVidamax()+jug.getVidamax()/4);
			jug.setPuntos(jug.getPuntos()-1);
		}else {System.out.println("No tienes puntos");}
	}
	public static void Mejmana(Heroe jug) {
		if(jug.getPuntos()>0) {
			jug.setManamax(jug.getManamax()+jug.getManamax()/4);
			jug.setPuntos(jug.getPuntos()-1);
		}else {System.out.println("No tienes puntos");}
	}
	public static void Mejataque(Heroe jug) {
		if(jug.getPuntos()>1) {
			jug.setAtaquemin(jug.getAtaquemin()+jug.getAtaquemin()/4);
			jug.setAtaquemax(jug.getAtaquemax()+jug.getAtaquemax()/4);
			jug.setPuntos(jug.getPuntos()-2);
		}else {System.out.println("No tienes puntos");}
	}
	public static void Mejcura(Heroe jug) {
		if(jug.getPuntos()>1) {
			jug.setCuramin(jug.getCuramin()+jug.getCuramin()/4);
			jug.setCuramax(jug.getCuramax()+jug.getCuramax()/4);
			jug.setPuntos(jug.getPuntos()-2);
		}else {System.out.println("No tienes puntos");}
	}
}
