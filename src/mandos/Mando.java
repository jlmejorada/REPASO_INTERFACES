package mandos;

/**
 * Clase padre Mando (recoge la estructura que tendran todos los mandos)
 */
public class Mando implements Comparable<Mando> {

	/**
	 * Atributo que recoge el modelo del mando
	 */
	protected String modelo="";
	
	/**
	 * Atributo que recoge la anchura del mando
	 */
	protected double anchura=5;
	
	/**
	 * Atributo que recoge la altura del mando
	 */
	protected double altura=10;
	
	/**
	 * Atributo que recoge el precio del mando
	 */
	protected double precio=5;
	
	/**
	 * Atributo que recoge si el mando está encendido o apagado
	 */
	protected boolean estaEncendido=false;

	/**
	 * Constructor con los parametros modelo, anchura y altura
	 * @param modelo String que recoge el modelo del mando
	 * @param anchura double que recoge la anchura del mando
	 * @param altura double que recoge la altura del mando
	 */
	public Mando(String modelo, double anchura, double altura) {
		if (modelo!=null&&!modelo.equals("")) {
			this.modelo = modelo;			
		}
		if (anchura>=5) {
			this.anchura = anchura;
		}
		if (altura>=10) {
			this.altura = altura;
		}
	}

	/**
	 * /**
	 * Constructor con los parametros modelo, anchura, altura y precio
	 * @param modelo String que recoge el modelo del mando
	 * @param anchura double que recoge la anchura del mando
	 * @param altura double que recoge la altura del mando
	 * @param precio double que recoge el precio del mando
	 */
	public Mando(String modelo, double anchura, double altura, double precio) {
		this(modelo,anchura,altura);
		if (precio>=5) {
			this.precio = precio;
		}
	}

	/**
	 * Getter del modelo
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Getter de la anchura
	 * @return
	 */
	public double getAnchura() {
		return anchura;
	}

	/**
	 * Getter de la altura
	 * @return
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Getter del precio
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Getter de si está o no encendido el mando
	 * @return
	 */
	public boolean isEstaEncendido() {
		return estaEncendido;
	}

	/**
	 * Setter de precio
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if (precio>=5) {
			this.precio = precio;
		}
	}
	
	/**
	 * Metodo que enciende el mando
	 */
	public void encender() {
		estaEncendido=true;
	}
	
	/**
	 * Metodo que apaga el mando
	 */
	public void apagar() {
		estaEncendido=false;
	}
	
	/**
	 * Metodo que compara si los objetos son iguales por su modelo
	 */
	@Override
	public boolean equals(Object obj) {
		boolean esIgual=false;
		Mando mn = (Mando) obj;
		if (this.modelo.equals(mn.modelo)) {
			esIgual=true;
		}
		return esIgual;
	}
	
	/**
	 * Metodo que ordena los mandos segun su orden alfabetico
	 */
	@Override
	public int compareTo(Mando o) {
		int res=0;
		res = this.modelo.compareToIgnoreCase(o.modelo);
		return res;
	}
	
	@Override
	public String toString() {
		String res="";
		res+="Modelo: " + this.modelo + "\n";
		res+="Anchura: " + this.anchura + "\n";
		res+="Altura: " + this.altura + "\n";
		res+="Precio: " + this.precio + "\n" + "Encendido: ";
		res+= (estaEncendido) ? "Si" + "\n" : "No" + "\n" ;
		return res;
	}
}
