package ec.edu.uce.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.modelo.VehiculoLiviano;
import ec.edu.uce.modelo.VehiculoPesado;

@Repository
@Qualifier("pesado")
public class MatriculaPesadoRepositoryImpl implements IMatriculaRepository {
	
	private VehiculoPesado vehiculo1;
	private static final Logger LOG = LoggerFactory.getLogger(MatriculaPesadoRepositoryImpl.class);

	@Override
	public void crearMatricula(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculo1=(VehiculoPesado) vehiculo;
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
		this.vehiculo1=(VehiculoPesado) vehiculo;
		LOG.info("Actualizando vehiculo: "+vehiculo);
	}

	@Override
	public void eliminarMatricula(String matricula) {
		// TODO Auto-generated method stub
		LOG.info("Eliminando vehiculo con matricula: "+matricula);
	}

}
