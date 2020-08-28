package modelo.negocio;

import java.util.List;

import modelo.entidad.Bombero;
import modelo.persistencia.DaoAltaBombero;

public class GestorAltaBombero {
	
		
		/**
		 * Metodo que da de alta un Bombero
		 * @param <Bombero1>
		 * @param b el Bombero a dar de alta
		 * @param Idbombero 
		 */		
		
		public int alta(Bombero b) {
			//esto serian reglas de negocio
						
			if (b.getNombre().length() < 10) {
				return -1;
			}
			
			if(b.getIdbombero() > 10000){
				return -2;
			}
			
			if ( b.getCategoria().equals("0")) {
				return -3;
			}
			
			if (b.getIdbombero() ==0) {
				return -4;
			}
			
			if (b.getTurno() ==0) {
				return -5;				
			}
		
			//si llegamos a este punto, debemos de comunicarnos con la capa DAO
			DaoAltaBombero daoBombero = new DaoAltaBombero();
			int id = daoBombero.alta(b);
			return id;
		}
		
		//aqui podriamos poner reglas de negocio
			DaoAltaBombero daoBombero = new DaoAltaBombero();
			public List<Bombero> listar(){
			return daoBombero.listar();
		}
									
	}



