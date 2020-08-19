 package modelo.negocio;

import java.util.List;

import modelo.entidad.Bombero;
import modelo.persistencia.DaoModificarBombero;

public class GestorModificarBombero {
	
	//vamos a meter alguna regla de negocio, supongamos que me dice
			//que el nombre de la persona tiene que tener al menos 3 carateres
			//y la edad debe de ser al menos de 18
			/**
			 * Metodo que da de alta una persona
			 * @param id1 
			 * @param p la persona a dar de alta
			 * @return -1 en caso de que el nombre sea menor de 3 caracteres, -2 en caso
			 * de que la edad sea menor que 18, 0 en caso de error con la bbdd
			 * y un numero positivo que representa el id en caso de que se haya dado de 
			 * alta
			 */
			//@SuppressWarnings("null")
			public  int modificar(Bombero b) {
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
				DaoModificarBombero daoModificarBombero = new DaoModificarBombero();
				int id = daoModificarBombero.modificar(b);
				return id;
			}
			
			
			//aqui podriamos poner reglas de negocio
				DaoModificarBombero daoModificarBombero = new DaoModificarBombero();
				public List<Bombero> listar(){
				return daoModificarBombero.listar();
			}
										
		}
