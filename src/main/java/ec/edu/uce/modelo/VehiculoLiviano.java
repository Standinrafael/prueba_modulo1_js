package ec.edu.uce.modelo;

public class VehiculoLiviano extends Vehiculo {
	private String cilindraje;

	
	
	@Override
	public String toString() {
		return "VehiculoLiviano [cilindraje=" + cilindraje + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getPlaca()=" + getPlaca() + ", getTipo()=" + getTipo() + ", getPropietario()="
				+ getPropietario() + ", getPrecio()=" + getPrecio() + ", getValorMatricula()=" + getValorMatricula()
				+ "]";
	}

	//Metodos GET y SET
	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	

}
