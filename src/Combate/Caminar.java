package Combate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import Inventario.Inventario;
import Personajes.Enemigos;
import Personajes.Heroe;

public class Caminar {
		

	public static void caminar(Heroe jug, int num, Inventario inv) {
		int niv = new Random().nextInt(6)+jug.getNivel()-3;
		if(jug.getNivel()<3) {
			niv = new Random().nextInt(3)+1;
		}
		String nombre = Enemigos.nombresenem(jug, num, niv, inv);
		Enemigos ene = new Enemigos(nombre, 10*num, 10*num, 1*num, 3*num);
		genenemigo(ene, jug, niv, niv, inv);
		jug.setKm(jug.getKm()+1);
		System.out.println("Caminas y te encuentras con un " + ene.getNombre());
		Combate.Combatir(ene, jug, niv, inv);
	}
	public static void genenemigo(Enemigos ene, Heroe jug, int niv, int num, Inventario inv) {
		ene.setVida(ene, niv);
		ene.setAtaque(ene, niv);
		ene.setPremios(niv, num);
	}
}
