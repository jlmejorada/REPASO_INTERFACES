package mandos;

import interfaces.Velocidad;

public class MandoAspiradora extends Mando implements Velocidad {

	private int velocidad = 0;

	public MandoAspiradora(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoAspiradora(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public void subirVelocidad() {
		if (this.velocidad<3) {
			++this.velocidad;
		}
	}

	@Override
	public void bajarVelocidad() {
		if (this.velocidad>0) {
			--this.velocidad;
		}
	}
	
	@Override
	public String toString() {
		String res=super.toString();
		res+="Velocidad: " + this.velocidad + "\n";
		return res;
	}
}
