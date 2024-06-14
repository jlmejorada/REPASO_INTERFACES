package mandos;

import interfaces.Volumen;

public class MandoMinicadena extends Mando implements Volumen {

	private int volumen = 20;

	public MandoMinicadena(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoMinicadena(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	public int getVolumen() {
		return volumen;
	}

	@Override
	public void subirVolumen() {
		if (this.volumen < 100) {
			this.volumen += 10;
		}
	}

	@Override
	public void bajarVolumen() {
		if (this.volumen > 0) {
			this.volumen -= 10;
		}
	}

	@Override
	public String toString() {
		String res = super.toString();
		res += "Volumen: " + this.volumen + "\n";
		return res;
	}
}
