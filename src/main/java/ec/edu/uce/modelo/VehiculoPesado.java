package ec.edu.uce.modelo;

public class VehiculoPesado extends Vehiculo {

	private String pesoToneladas;

	
	
	@Override
	public String toString() {
		return "VehiculoPesado [pesoToneladas=" + pesoToneladas + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getPlaca()=" + getPlaca() + ", getTipo()=" + getTipo() + ", getPropietario()="
				+ getPropietario() + ", getPrecio()=" + getPrecio() + ", getValorMatricula()=" + getValorMatricula()
				+ "]";
	}

	//Metodos GET y SET
	public String getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(String pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}
	
	
}
