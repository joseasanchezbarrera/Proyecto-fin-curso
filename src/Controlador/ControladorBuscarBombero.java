package Controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Bombero;
//import modelo.negocio.GestorBuscarBombero;

/**
 * Servlet implementation class ControladorBuscarBombero
 */
@WebServlet("/ControladorBuscarBombero")
public class ControladorBuscarBombero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorBuscarBombero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param Bombero 
	 * @param bom 
	 * @param  
	 * @param  
	 * @return 
	 * @return 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("idbombero");
		
		int iId = Integer.parseInt(id);
		
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("ProyectoMavenJPAWeb");
		EntityManager em = factoria.createEntityManager();
		
		Bombero b = em.find(Bombero.class, iId);
		System.out.println(b);
		
		
			
		//habria que comunicarse con la capa gestora dentro del modelo, pero en est caso no lo haga
		//lo dejo preparado po si algun dia lo necesito
				//GestorBuscarBombero gb = new GestorBuscarBombero();	
			    //gb.buscar(iId);
			   				
		//response.getWriter().append("<h1>Datos del bombero buscado</h1>").append(b.toString());
		
		request.setAttribute("mensaje", "Bombero buscado con ID: "+ b.getIdbombero()+
		 ",    Categoria: "+b.getCategoria()+",    Turno: "+b.getTurno()+",    Nombre: "+b.getNombre());
		
		request.getRequestDispatcher("buscarBombero.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
