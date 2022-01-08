package ec.edu.uce.repository;

import ec.edu.uce.modelo.Vehiculo;

public interface IMatriculaRepository {

	void crearMatricula(Vehiculo vehiculo); //C
	void buscarMatricula(String matricula); //R
	void actualizarMatricula(Vehiculo vehiculo); //U
	void eliminarMatricula(String matricula); //D
	
}
