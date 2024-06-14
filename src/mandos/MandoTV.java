package mandos;

import interfaces.Volumen;

public class MandoTV extends Mando implements Volumen {
	
	private int volumen=20;
	
	private int canal=1;

	public MandoTV(String modelo, double anchura, double altura) {
		super(modelo, anchura, altura);
	}

	public MandoTV(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public void subirVolumen() {
		if (this.volumen<100) {
			this.volumen+=5;
		}
	}

	@Override
	public void bajarVolumen() {
		if (this.volumen>0) {
			this.volumen-=5;
		}
	}
	
	@Override
	public String toString() {
		String res=super.toString();
		res+="Volumen: " + this.volumen + "\n";
		res+="Canal: " + this.canal + "\n";
		return res;
	}

}
