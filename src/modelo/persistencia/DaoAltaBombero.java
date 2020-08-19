package modelo.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.entidad.Bombero;

public class DaoAltaBombero {

private EntityManager em;
	
	private boolean abrirConexion(){
		try {
			EntityManagerFactory factoria = Persistence.createEntityManagerFactory("ProyectoMavenJPAWeb");
			em = factoria.createEntityManager();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private boolean cerrarConexion(){
		try {
			em.close();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * metodo que inserta en la bbdd un bombero
	 * @param b el bombero a insertar
	 * @return 0 en caso de que no haya conexion, el id en caso de que
	 * se haya dado de alta
	 */
	public int insertar(Bombero b) {
		if(!abrirConexion()) {
			return 0;
		}
		EntityTransaction et = em.getTransaction();
		et.begin();
		/*if(existe(b.getIdbombero()) == null) {
			System.out.println(b);
		}else {
			return -6;
		}*/
			em.persist(b);
			et.commit();
			//System.out.println(em.find(Bombero.class, b.getIdbombero()));
			cerrarConexion();
		
		
		//una vez persistido se me actualiza el objeto con su id, y podemos devolverlo
		System.out.println("a ver si sale " + b.getIdbombero());
		return b.getIdbombero();
	}
	
	@SuppressWarnings("unchecked")
	public List<Bombero> listar() {
		if(!abrirConexion()) {
			return null;
		}
		
		//para hacer la consulta debemos de usar JPQL
		Query query = em.createQuery("select b from Bombero b");
		List<Bombero> listaBomberos = query.getResultList();
		return listaBomberos;
	}
	
	public Bombero existe(int idbombero) {
		if(abrirConexion()) {
			return em.find(Bombero.class, idbombero);
		}
		return null;
	}
}


