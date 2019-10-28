package Inventario;

import Personajes.Heroe;

public class Inventario {
	
	int numpocvida, numpocmana, numrevivir, armadura;
	
	public Inventario(int numpocvida, int numpocmana, int numrevivir, int armadura) {
		this.numpocvida = numpocvida;
		this.numpocmana = numpocmana;
		this.numrevivir = numrevivir;
		this.armadura = armadura;
		
	}

	public int getNumpocvida() {
		return numpocvida;
	}

	public void setNumpocvida(int numpocvida) {
		this.numpocvida = numpocvida;
	}

	public int getNumpocmana() {
		return numpocmana;
	}

	public void setNumpocmana(int numpocmana) {
		this.numpocmana = numpocmana;
	}

	public int getNumrevivir() {
		return numrevivir;
	}

	public void setNumrevivir(int numrevivir) {
		this.numrevivir = numrevivir;
	}

	public int getArmadura() {
		return armadura;
	}
	

	public static void setCompArmadura(Heroe jug, Inventario inv, int num, int precio) {
		if(jug.getOro()>=precio) {
			inv.setSubirArmadura(num);
			jug.setBajaroro(precio);
		}else {System.out.println("No tienes suficiente oro");}
	}
	public void setSubirArmadura(int num) {
		armadura = armadura+num;
	}
	public void setBajarArmadura(int num) {
		armadura = armadura-num;
	}
	public void setArmadura(int num) {
		this.armadura= armadura;
	}
}
