package Combate;

import java.util.Random;
import java.util.Scanner;

import Inventario.Inventario;
import Inventario.Objetos;
import Personajes.Enemigos;
import Personajes.Heroe;
import Principal.Cosas;
import Principal.Main;
import Personajes.Enemigos;
import Personajes.Heroe;

public class Combate {
	
	static Scanner reader = new Scanner(System.in);
	Enemigos ene;
	Heroe jug;
	
	public static void Combatir(Enemigos ene, Heroe jug, int niv, Inventario inv) {
		while(ene.getVida()>0) {
			Heroe.barrajug(jug, inv);
			Enemigos.barraenem(ene, niv);
			ataques(jug, ene, inv);
			Ganada(jug, ene, inv);
			ataqenem(jug, inv, ene);
			Muerto(jug, inv);
		}
	}
	public static void ataques(Heroe jug, Enemigos ene, Inventario inv) {
		System.out.print("\t1. Placaje\n\t2. Bola de fuego (" + jug.getManamax()/8 + " de maná)");
		if(jug.getBolfue()==0) {System.out.print(" (No disponible)");}
		System.out.println("\n\t3. Curación (" + jug.getCuramin() + " de maná)"
				+ "\n\t4. Objetos\n\t0. Huir");
		int eleccion = reader.nextInt(); 
		if(eleccion==1) {Atacar(jug, ene);}
		if(eleccion==2) {if(jug.getBolfue()==1) {Bolfue(jug, ene);}else{System.out.println("Aún no has conseguido eso");}}
		if(eleccion==3) {Curar(jug);}
		if(eleccion==4) {int encombate=1; Objetos.Misobjetos(jug, inv, encombate);}
		if(eleccion==0) {Huir(jug, inv);}
	}
	public static void ataqenem(Heroe jug, Inventario inv, Enemigos ene) {
		if(ene.getVida()>0) {
			int difene = ene.getAtaquemax()-ene.ataquemin;
			int ataqene = new Random().nextInt(difene)+ene.getAtaquemin();
			Armadura(ataqene, inv);
			System.out.println("El enemigo te ataca y te hace " + ataqene + " de daño");
			jug.setVida(jug.getVida()-ataqene);
		}
	}
	public static void Ganada(Heroe jug, Enemigos ene, Inventario inv) {
		if(ene.getVida()<1) {
			System.out.println("¡Has ganado el combate y " + ene.getPremiooro() + " de oro!");
			int cantoro = ene.getPremiooro();
			jug.setSubiroro(cantoro); //Se suma el oro ganado
			jug.setExp(jug.getExp()+ene.getPremioexp()); //Se suma la exp ganada
			Cosas.Subirnivel(jug);
		}else {
			if(jug.getVida()<1) {
				System.out.println("Has perdido el combate");
				jug.setVida(1);
			}
		} 
	}
	public static void Huir(Heroe jug, Inventario inv) {
		int huir = new Random().nextInt(10)+1;
		if(huir==9) {
			System.out.println("No consigues huir");
			}else {
				System.out.println("Consigues escapar a tiempo pero pierdes " + jug.getExp()/2 + " de exp");
				jug.setExp(jug.getExp()-jug.getExp()/2);
				Main.Menu(jug, inv);			
			}
	}
	public static void Atacar(Heroe jug, Enemigos ene) {
		int dif = jug.getAtaquemax()-jug.getAtaquemin();
		int dano = new Random().nextInt(dif)+jug.getAtaquemin(); 
		ene.setVida(ene.getVida()-dano);
		System.out.println("Atacas al enemigo y le haces " + dano + " de daño");
	}
	public static void Bolfue(Heroe jug, Enemigos ene) {
		int dif = jug.getAtaquemax()*2-jug.getAtaquemin()*2;
		int dano = new Random().nextInt(dif)+jug.getAtaquemin()*2; 
		ene.setVida(ene.getVida()-dano);
		jug.setMana(jug.getMana()-jug.getManamax()/8);
		System.out.println("Lanzas Bola de fuego al enemigo y le haces " + dano + " de daño");
	}
	public static void Curar(Heroe jug) {
		if(jug.getMana()>jug.getCuramin()) {
			int dif = jug.getCuramax()-jug.getCuramin();
			int cura = new Random().nextInt(dif)+jug.getCuramin(); 
			jug.setVida(jug.getVida()+cura);
			Cosas.ComprobarVida(jug); //Se comprueba si la vida es superior al maximo
			jug.setMana(jug.getMana()-jug.getCuramin()); //Se resta el mana
			System.out.println("Te curas: " + cura + " puntos");
		}else {System.out.println("No tienes suficiente maná");}
	}
	public static void Muerto(Heroe jug, Inventario inv) {
		if(jug.getVida()<1) {
			if(inv.getNumrevivir()<1) {
			System.out.println("Has muerto"); System.exit(0);
			}else {
				System.out.println("Usas un revivir y continuas...");
				inv.setNumrevivir(inv.getNumrevivir()-1);
				jug.setVida(jug.getVidamax());
				Main.Menu(jug, inv);
				}
		}
	}
	public static int Armadura(int ataqene, Inventario inv) {
		if(inv.getArmadura()>0) {
			ataqene = ataqene/2;
			inv.setBajarArmadura(ataqene/4);
			if(inv.getArmadura()<0) {inv.setArmadura(0);}
		}
		return ataqene;
	}
}
