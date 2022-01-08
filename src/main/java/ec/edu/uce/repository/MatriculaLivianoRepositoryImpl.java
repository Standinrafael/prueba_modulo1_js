package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoLiviano;


@Repository
@Qualifier("liviano")
public class MatriculaLivianoRepositoryImpl implements IMatriculaRepository {

  
    private VehiculoLiviano vehiculo1;
	
	
	private static final Logger LOG = LoggerFactory.getLogger(MatriculaLivianoRepositoryImpl.class);
	@Override
	public void crearMatricula(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculo1=(VehiculoLiviano) vehiculo;
		LOG.info("Matricular vehiculo: "+vehiculo);
	}

	@Override
	public void buscarMatricula(String matricula) {
		// TODO Auto-generated method stub
		LOG.info("Buscando vehiculo con matricula : "+matricula);
	}

	@Override
	public void actualizarMatricula(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculo1=(VehiculoLiviano) vehiculo;
		LOG.info("Actualizando vehiculo: "+vehiculo);
	}

	@Override
	public void eliminarMatricula(String matricula) {
		// TODO Auto-generated method stub
		LOG.info("Eliminando vehiculo con matricula: "+matricula);
	}

}
