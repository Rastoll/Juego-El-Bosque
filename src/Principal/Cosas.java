package Principal;

import Personajes.Heroe;

public class Cosas {

	public static void Subirnivel(Heroe jug) {
		if(jug.getExp() >= jug.getExpmax()) {
			jug.setNivel(jug.getNivel()+1);
			System.out.println("¡Has subido al nivel " + jug.getNivel() + "! Obtienes 2 puntos de personaje");
			//Se comprueba si ha sobrado exp para guardarla
			int dif = jug.getExp() - jug.getExpmax();
			jug.setExp(dif);
			//Se aumenta la exp requerida para subir de nivel otra vez
			jug.setExpmax(jug.getExpmax()*2);
			 //Se aumentan la vida y el maná maximo
			jug.setVidamax(jug.getVidamax()+(jug.getVidamax()/10)); 
			jug.setManamax(jug.getManamax()+(jug.getManamax()/10));
			//Se restauran la vida y el maná al máximo
			jug.setVida(jug.getVidamax()); 
			jug.setMana(jug.getManamax());
			jug.setPuntos(jug.getPuntos()+2);
		}
	}
	public static void ComprobarVida(Heroe jug) {
		if(jug.getVida()>jug.getVidamax()) {jug.setVida(jug.getVidamax());}
	}
	public static void ComprobarMana(Heroe jug) {
		if(jug.getMana()>jug.getManamax()) {jug.setMana(jug.getManamax());}
	}
}
