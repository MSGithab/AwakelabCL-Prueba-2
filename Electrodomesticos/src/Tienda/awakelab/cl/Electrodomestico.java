package Tienda.awakelab.cl;

public abstract class Electrodomestico {

	//Atributos:

	protected double precioBase;
	protected int consumoElectrico;
	protected int peso;



	// constructores
	public Electrodomestico() {
		// TODO Auto-generated constructor stub
	}


	public Electrodomestico(double precioBase, int consumoElectrico, int peso) {
		super();
		this.precioBase = precioBase;
		this.consumoElectrico = consumoElectrico;
		this.peso = peso;
	}



	//Declaramos los metodos get / set

	public Electrodomestico(double precioBase2, int peso2) {
		// TODO Auto-generated constructor stub
	}


	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getConsumoElectrico() {
		return consumoElectrico;
	}

	public void setConsumoElectrico(int consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}



	// calculamos el monto a pagar

	public double precioFinal(){

		double monto = 0;

		switch (consumoElectrico) {

		case 1:
			monto = 100;
			break;

		case 2:
			monto = 80;
			break;

		case 3:
			monto = 60;
			break;

		case 4:
			monto = 50;
			break;

		case 5:
			monto = 30;
			break;

		case 6:
			monto = 10;
			break;

		}

		// Calculamos como varía el monto segun el peso

		if (peso >= 0 && peso <= 19) {
			monto += 10;

		} else if (peso == 20 && peso <= 49) {
			monto += 50;

		} else if (peso == 50 && peso <= 79) {
			monto += 80;

		}else if (peso > 79) {
			monto += 100;

		}

		// Return para el precio base y le agregamos el monto

		return precioBase + monto;

	}


	//Mostrar datos

	public abstract void mostrar();

}

