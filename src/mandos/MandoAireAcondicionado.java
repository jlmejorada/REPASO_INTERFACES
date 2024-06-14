package mandos;

import interfaces.Velocidad;

public class MandoAireAcondicionado extends Mando implements Velocidad {

	private enum Modo {FRIO, CALOR};
	
	private int temperatura = 24;
	
	private int velocidad = 0;
	
	private Modo modito = Modo.FRIO;

	public MandoAireAcondicionado(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoAireAcondicionado(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public Modo getModito() {
		return modito;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void cambiarModo() {
		if (this.modito == Modo.FRIO) {
			this.modito = Modo.CALOR;
		} else {
			this.modito = Modo.FRIO;
		}
	}

	@Override
	public void subirVelocidad() {
		if (this.velocidad<5) {
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
