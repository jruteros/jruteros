package pruebas;



import interfacesDAO.DificultadDAO;
import interfacesDAO.PerfilDAO;
import interfacesDAO.UsuarioDAO;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import misClases.Dificultad;
import misClases.Perfil;
import misClases.Usuario;
import clasesUtiles.DAOFactory;

/**
 * Servlet implementation class PruebaDAOS
 */
@WebServlet("/PruebasDAOS")
public class PruebaDAOS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaDAOS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DificultadDAO dificultadDAO = DAOFactory.getDificultadDAO();
		List<Dificultad> listaDificultad= dificultadDAO.recuperarTodos();
		for(Dificultad d:listaDificultad){
			System.out.println(d.getNombre());
		}
		Dificultad muyfacil = new Dificultad();
		muyfacil.setNombre("muyfacil");
		dificultadDAO.persistir(muyfacil);
		
		PerfilDAO perfilDAO = DAOFactory.getPerfilDAO();
		List<Perfil> listaPerfiles = perfilDAO.recuperarTodos();
		for(Perfil p:listaPerfiles){
			System.out.println("perfil " +p.getNombre());
		}
		
		UsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
		List<Usuario> listaUsuarios = usuarioDAO.recuperarTodos();
		for(Usuario u:listaUsuarios){
			System.out.println("usuario "+u.getNombre());
		}
		Usuario usuario =  (Usuario) usuarioDAO.recuperarNombreUsuario("Ignacio");
		usuario.setApellido("Bacca");
		usuarioDAO.actualizar(usuario);
	
	}
		
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
