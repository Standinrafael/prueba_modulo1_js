package ec.edu.uce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Propietario;
import ec.edu.uce.modelo.Vehiculo;
import ec.edu.uce.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	private static final Logger LOG = LoggerFactory.getLogger(MatriculaServiceImpl.class);
	
	private Propietario propietario;
	
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaRepository matricula1;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaRepository matricula2;

	@Override
	public void ImprimirCarro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MatricularCarro(Vehiculo vehiculo, Propietario propietario, int tipo) {
		// TODO Auto-generated method stub
		
		if (tipo ==1) {
			this.matricula1.crearMatricula(vehiculo);
		}
		else {
			this.matricula2.crearMatricula(vehiculo);
		}
		
	}

	@Override
	public void crearNuevaMatricula(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encontrarMatricula(String matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarMatricula(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarMatricula(String matricula) {
		// TODO Auto-generated method stub
		
	}
	

}
