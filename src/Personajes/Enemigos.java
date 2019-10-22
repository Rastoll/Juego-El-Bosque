package Personajes;

import Combate.Caminar;
import Inventario.Inventario;

public class Enemigos {

	  //declaración de atributos
		public String nombre;
		public int vida, vidamax, ataquemin, ataquemax, premiooro, premioexp;

		  //declaración de constructor
		public Enemigos(String nombre, int vida, int vidamax, int ataquemin, int ataquemax) {
		    this.nombre = nombre;
			this.vida= vida;
		    this.vidamax= vidamax;
		    this.ataquemin= ataquemin;
		    this.ataquemax= ataquemax;
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

		public void setAtaque(Enemigos ene, int niv) {
			ataquemin = ene.getAtaquemin()*niv;
			ataquemax = ene.getAtaquemax()*niv;
		}

		public int getAtaquemax() {
			return ataquemax;
		}

		public int getVidamax() {
			return vidamax;
		}

		public void setVida(Enemigos ene, int niv) {
			vidamax = ene.getVidamax()*niv;
			ene.setVida(ene.getVidamax());
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPremiooro() {
			return premiooro;
		}

		public void setPremios(int niv, int num) {
			premiooro = niv*num+10;
			premioexp = niv*num+20;
		}

		public int getPremioexp() {
			return premioexp;
		}
		public static String nombresenem(Heroe jug, int num, int niv, Inventario inv) {
			String nombre="null";
			if(num==1) {nombre="Murloc salvaje";}
			if(num==2) {nombre="Gnomo bandido";}
			if(num==3) {nombre="Oso pequeño";}
			if(num==4) {nombre="Espíritu errante";}
			if(num==5) {nombre="Murloc cazador";}
			if(num==6) {nombre="Gnomo brujo";}
			if(num==7) {nombre="Oso grande";}
			if(num==8) {nombre="Espíritu antiguo";}
			return nombre;
			

		}
		public static void barraenem(Enemigos ene, int niv) {
			System.out.print("Enemigo | Vida: " + ene.getVida() + "/" + ene.getVidamax());
			System.out.print(" | Ataque: " + ene.getAtaquemin() + "/" + ene.getAtaquemax());
			System.out.println(" | Nivel: " + niv + " |");
		}
}