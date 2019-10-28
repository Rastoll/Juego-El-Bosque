package Personajes;

import java.util.Scanner;

import Inventario.Inventario;

public class Heroe {

	  //declaración de atributos
	public static String nombre;
	public static int vida, vidamax, ataquemin, ataquemax, nivel, km, oro, exp = 0, expmax = 100;
	public static int curamin, curamax, mana, manamax, kmmazmo, puntos, bolfue;

	  //declaración de constructor
	public Heroe(String nombre, int vida, int vidamax, int ataquemin, int ataquemax, int nivel, int km, 
				int oro, int curamin, int curamax, int mana, int manamax, int kmmazmo, int puntos, int bolfue) {
		this.nombre= nombre; 
	    this.vida= vida;
	    this.vidamax= vidamax;
	    this.ataquemin= ataquemin;
	    this.ataquemax= ataquemax;
	    this.nivel= nivel;
	    this.km= km;
	    this.oro= oro;
	    this.exp= exp;
	    this.expmax= expmax;
	    this.curamin= curamin;
	    this.curamax= curamax;
	    this.mana= mana;
	    this.manamax= manamax;
	    this.kmmazmo= kmmazmo;
	    this.puntos= puntos;
	    this.bolfue= bolfue;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaquemin() {
		return ataquemin;
	}

	public void setAtaquemin(int ataquemin) {
		this.ataquemin = ataquemin;
	}

	public int getAtaquemax() {
		return ataquemax;
	}

	public void setAtaquemax(int ataquemax) {
		this.ataquemax = ataquemax;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public static int getVidamax() {
		return vidamax;
	}

	public static void setVidamax(int vidamax) {
		Heroe.vidamax = vidamax;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km + 1;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Heroe.nombre = nombre;
	}

	public static int getOro() {
		return oro;
	}

	public static void setSubiroro(int cantoro) {
		oro = oro + cantoro;
	}
	public static void setBajaroro(int cantoro) {
		oro = oro - cantoro;
	}
	

	public static int getExp() {
		return exp;
	}

	public static void setExp(int exp) {
		Heroe.exp = exp;
	}

	public static int getExpmax() {
		return expmax;
	}

	public static void setExpmax(int expmax) {
		Heroe.expmax = expmax;
	}

	public static int getCuramin() {
		return curamin;
	}

	public static void setCuramin(int curamin) {
		Heroe.curamin = curamin;
	}

	public static int getCuramax() {
		return curamax;
	}

	public static void setCuramax(int curamax) {
		Heroe.curamax = curamax;
	}

	public static int getMana() {
		return mana;
	}

	public static void setMana(int mana) {
		Heroe.mana = mana;
	}

	public static int getManamax() {
		return manamax;
	}

	public static void setManamax(int manamax) {
		Heroe.manamax = manamax;
	}
	public static void barrajug(Heroe jug, Inventario inv) {
		System.out.print(jug.getNombre() + " | Vida: " + jug.getVida() + "/" + jug.getVidamax());
		System.out.print(" | Armadura: " + inv.getArmadura() + "/100");
		System.out.print(" | Mana: " + jug.getMana() + "/" + jug.getManamax());
		System.out.print(" | Ataque: " + jug.getAtaquemin() + "/" + jug.getAtaquemax());
		System.out.print(" | Cura: " + jug.getCuramin() + "/" + jug.getCuramax());
		System.out.print(" | Nivel: " + jug.getNivel());
		System.out.print(" | Exp: " + jug.getExp() + "/" + jug.getExpmax());
		System.out.println(" | Oro: " + jug.getOro() + " |");
	}

	public static int getKmmazmo() {
		return kmmazmo;
	}

	public static void setKmmazmo(int kmmazmo) {
		Heroe.kmmazmo = kmmazmo;
	}

	public static int getPuntos() {
		return puntos;
	}

	public static void setPuntos(int puntos) {
		Heroe.puntos = puntos;
	}

	public static int getBolfue() {
		return bolfue;
	}

	public static void setBolfue(int bolfue) {
		Heroe.bolfue = bolfue;
	}
	
}
