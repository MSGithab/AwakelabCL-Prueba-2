package Tienda.awakelab.cl;

public class Lavadora extends Electrodomestico {


	// Atributo propio:

	private int cargaLavadora = 5;


	// Constructores:
	
	public Lavadora() {
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double precioBase, int consumoElectrico, int peso) {
		super(precioBase, consumoElectrico, peso);
		// TODO Auto-generated constructor stub
	}

	// Constructor con la carga y el resto de los atributos heredados
	public Lavadora(double precio, int consumo, int pe, int cargaLavadora) {
		super(precio, consumo, pe);
		this.cargaLavadora = cargaLavadora;
	}



	//Metodo que muestre los datos:

	public void mostrar(){
		System.out.println("**");
		System.out.println("Tipo de Electrodomestico (1:Lavadora)");
		System.out.println("Precio Base: " + getPrecioBase());
		System.out.println("Consumo Electrico: " + getConsumoElectrico());
		System.out.println("Peso: " + getPeso() + "Kilos");
		System.out.println("Carga: " + cargaLavadora + "Kilos");
		System.out.println("Precio final: " + precioFinal());
		System.out.println("**");
		System.out.println();
	}

	//calcular pago:
	public double precioFinal(){

		// invocamos el valor de precioFinal desde clase padre
		double monto = super.precioFinal();

		// precio condicional:
		if (cargaLavadora > 30 ) {
			monto += 50; //este monto extra es en EUR

		}

		return monto;

	}

}
