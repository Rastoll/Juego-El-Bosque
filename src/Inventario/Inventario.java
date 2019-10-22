package Inventario;

public class Inventario {
	
	int numpocvida, numpocmana, numrevivir;
	
	public Inventario(int numpocvida, int numpocmana, int numrevivir) {
		this.numpocvida = numpocvida;
		this.numpocmana = numpocmana;
		this.numrevivir = numrevivir;
		
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
}
