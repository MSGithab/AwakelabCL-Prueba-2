package Tienda.awakelab.cl;

public class Television extends Electrodomestico{

	//Atributos propios:

	private int resolucion;
	boolean sintonizador;


	//Constructor (atributos heredados):

	public Television(double precio, int consumo, int pe) {
		super(precio, consumo, pe);
		// TODO Auto-generated constructor stub
	}

	//Metodo que muestre los datos:

	public void mostrar(){
		System.out.println("**");
		System.out.println("Tipo de Electrodomestico (2:Television)");
		System.out.println("Precio Base: " + getPrecioBase());
		System.out.println("Consumo Electrico: " + getConsumoElectrico());
		System.out.println("Peso: " + getPeso() + "Kilos");
		System.out.println("Resolucion: " + resolucion + " pulgadas");
		System.out.println("Precio final: " + precioFinal());
		System.out.println("**");
		System.out.println();
	}


	public double precioFinal(){

		// Variables: Invocamos el método precioFinal de la calse Electrodomestico
		double monto = super.precioFinal();

		// Precio condicional:
		if (resolucion >= 40 ) {
			monto += precioBase*0.3; 

		} else if (sintonizador = true) {
			monto = precioBase +50; // este monto extra es en EUR
		}

		return monto;
	}

}
