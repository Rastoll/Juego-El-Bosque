package Combate;

import java.util.Random;

import Inventario.Inventario;
import Personajes.Enemigos;
import Personajes.Heroe;

public class Mazmorra {

	public static void Avanzar(Heroe jug, Inventario inv) {
		if(jug.getKm()>=jug.getKmmazmo()) {
			System.out.print("Te adentras en una mazmorra... ");
			int rondas=1;
			while(rondas<3) {
				System.out.println("Asalto " + rondas);
				int num = new Random().nextInt(jug.getNivel()+2)+1;
				int niv = new Random().nextInt(6)+jug.getNivel()-3;
			
				String nombre = Enemigos.nombresenem(jug, num, niv, inv);
				Enemigos ene = new Enemigos(nombre, 20, 20, 2, 4);
				Caminar.genenemigo(ene, jug, niv, num, inv);
				Combate.Combatir(ene, jug, niv, inv);
				rondas++;
			}
			jug.setKmmazmo(jug.getKmmazmo()+10);
			System.out.println("¡Has completado la mazmorra!");
		}else {System.out.println("Aún no puedes entrar ahí");}
	}
}
