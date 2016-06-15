package pruebas;

import interfacesDAO.ActividadDAO;
import interfacesDAO.AdministradorDAO;
import interfacesDAO.DificultadDAO;
import interfacesDAO.FormatoDAO;
import interfacesDAO.PerfilDAO;
import interfacesDAO.PrivacidadDAO;
import interfacesDAO.SexoDAO;
import interfacesDAO.UsuarioDAO;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import misClases.Actividad;
import misClases.Administrador;
import misClases.Coordenada;
import misClases.Dificultad;
import misClases.Formato;
import misClases.Perfil;
import misClases.Privacidad;
import misClases.Puntaje;
import misClases.Ruta;
import misClases.Sexo;
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
		
		SexoDAO sexoDAO = DAOFactory.getSexoDAO();
		Sexo hombre = new Sexo("Hombre");
		Sexo mujer = new Sexo("Mujer");
		sexoDAO.persistir(hombre);
		sexoDAO.persistir(mujer);
		
		System.out.println("Listado de sexo...");
		List<Sexo> listaSexo = sexoDAO.recuperarTodos();	
		for(Sexo s:listaSexo){
			System.out.println(s.getId_sexo() + ": " + s.getGenero());
		}
		System.out.println();
		
		
		DificultadDAO dificultadDAO = DAOFactory.getDificultadDAO();
		
		Dificultad facil = new Dificultad("Fácil");
		Dificultad moderada = new Dificultad("Moderada");
		Dificultad dificil = new Dificultad("Difícil");
		Dificultad muyDificil = new Dificultad("Muy difícil");
		Dificultad soloExpertos = new Dificultad("Sólo expertos");
		
		dificultadDAO.persistir(facil);
		dificultadDAO.persistir(moderada);
		dificultadDAO.persistir(dificil);
		dificultadDAO.persistir(muyDificil);
		dificultadDAO.persistir(soloExpertos);
		
		System.out.println("Listado de dificultades...");
		
		List<Dificultad> listaDificultad = dificultadDAO.recuperarTodos();	
		for(Dificultad d:listaDificultad){
			System.out.println(d.getId_dificultad() + ": " + d.getNombre());
		}
		System.out.println();
		
		PrivacidadDAO privacidadDAO = DAOFactory.getPrivacidadDAO();
		
		Privacidad publica = new Privacidad("Pública");
		Privacidad privada = new Privacidad("Privada");
		
		privacidadDAO.persistir(publica);
		privacidadDAO.persistir(privada);
		
		System.out.println("Listado privacidad...");
		List<Privacidad> listaPrivacidad = privacidadDAO.recuperarTodos();
		for(Privacidad p: listaPrivacidad){
			System.out.println(p.getId_privacidad() + ": " + p.getNombre());
		}
		System.out.println();
		
		FormatoDAO formatoDAO = DAOFactory.getFormatoDAO();
		Formato circular = new Formato("Circular");
		Formato soloIda = new Formato("Sólo ida");
		
		formatoDAO.persistir(circular);
		formatoDAO.persistir(soloIda);
		
		System.out.println("Listado formato...");
		List<Formato> listaFormato = formatoDAO.recuperarTodos();
		for(Formato f: listaFormato){
			System.out.println(f.getId_formato() + ": " + f.getNombre());
		}
		System.out.println();
		
		ActividadDAO actividadDAO = DAOFactory.getActividadDAO();
		Actividad mountainbike = new Actividad("Mountain Bike");
		Actividad ciclismo = new Actividad("Ciclismo");
		Actividad cicloturismo = new Actividad("Cicloturismo");
		Actividad senderismo = new Actividad("Senderismo");
		Actividad carreraMontaña = new Actividad("Carrera por Montaña");
		Actividad alpinismo = new Actividad("Alpinismo");
		Actividad motociclismo = new Actividad("Motociclismo");
		Actividad cuatriciclo = new Actividad("Cuatriciclo");
		Actividad esqui = new Actividad("Esquí");
		Actividad kayak = new Actividad("Kayak");
		Actividad vela = new Actividad("Vela");
		Actividad aCaballo = new Actividad("A caballo");
		
		actividadDAO.persistir(mountainbike);
		actividadDAO.persistir(ciclismo);
		actividadDAO.persistir(cicloturismo);
		actividadDAO.persistir(senderismo);
		actividadDAO.persistir(carreraMontaña);
		actividadDAO.persistir(alpinismo);
		actividadDAO.persistir(motociclismo);
		actividadDAO.persistir(cuatriciclo);
		actividadDAO.persistir(esqui);
		actividadDAO.persistir(kayak);
		actividadDAO.persistir(vela);
		actividadDAO.persistir(aCaballo);
		
		System.out.println("Listado actividades...");
		List<Actividad> listaActividad = actividadDAO.recuperarTodos();
		for(Actividad a: listaActividad){
			System.out.println(a.getId_actividad() + ": " + a.getNombre());
		}
		System.out.println();
		
		UsuarioDAO usuarioDAO = DAOFactory.getUsuarioDAO();
		PerfilDAO perfilDAO = DAOFactory.getPerfilDAO();
		
		Usuario nacho = new Usuario("Ignacio", "Vacca", "ignaciovacca", "ignaciovacca@email.com", "passwordhasheaada", 36987718, "Calle 6", hombre );
		Usuario alex = new Usuario("Alex", "Rojas", "alexrojas", "alexrojas@hotmail.com", "passwordsegura", 33333333, "25 y 60", hombre);
		Usuario josefina = new Usuario("Josefina", "De Tal", "josefinadetal", "josefinadetal@gmail.com", "clave", 4444444, "1 y 59", mujer);
		Administrador admin = new Administrador("Admin", "Admin", "admin", "admin@admin", "admin", 5555555, "algun lugar", hombre);
		Administrador admin2 = new Administrador("Admin2", "Admin2", "admin2", "admin2@admin2", "admin2pass", 666666, "otro lugar", mujer);

		
		@SuppressWarnings("deprecation")
		Time timeruta1 = new Time(3,12,02);
		@SuppressWarnings("deprecation")
		Time timeruta2 = new Time(1,45,12);

		@SuppressWarnings("deprecation")
		Date dateruta1 = new Date(2015, 04, 06);
		@SuppressWarnings("deprecation")
		Date dateruta2 = new Date(2015, 05, 26);

		Ruta ruta1 = new Ruta("Montañas blancas", "Paseo por las montañas nevadas de Mendoza", (float) 34.08, 
				timeruta1, dateruta1, nacho, soloIda, carreraMontaña, publica);
		ruta1.agregarCoordenada((float) 34.01, (float) 33.05);
		ruta1.agregarCoordenada((float) 34.02, (float) 33.05);
		ruta1.agregarCoordenada((float) 34.03, (float) 33.05);
		ruta1.agregarCoordenada((float) 34.04, (float) 33.05);
		ruta1.agregarCoordenada((float) 34.05, (float) 33.05);
		ruta1.agregarCoordenada((float) 34.06, (float) 33.05);
		ruta1.agregarCoordenada((float) 34.07, (float) 33.04);
		ruta1.agregarCoordenada((float) 34.08, (float) 33.04);
		Ruta ruta2 = new Ruta("A caballo por la playa", "A caballo por la playa", (float) 34.08, 
				timeruta1, dateruta1, nacho, circular, aCaballo, publica);
		ruta2.agregarCoordenada((float) -34.01, (float) 33.00);
		ruta2.agregarCoordenada((float) -34.11, (float) 33.01);
		ruta2.agregarCoordenada((float) -34.21, (float) 33.02);
		ruta2.agregarCoordenada((float) -34.31, (float) 33.03);
		ruta2.agregarCoordenada((float) -34.41, (float) 33.04);
		ruta2.agregarCoordenada((float) -34.51, (float) 33.05);
		ruta2.agregarCoordenada((float) -34.41, (float) 33.04);
		ruta2.agregarCoordenada((float) -34.31, (float) 33.03);
		ruta2.agregarCoordenada((float) -34.21, (float) 33.02);
		ruta2.agregarCoordenada((float) -34.11, (float) 33.01);
		ruta2.agregarCoordenada((float) -34.01, (float) 33.00);
		
		nacho.agregarRutaSubida(ruta1);
		nacho.agregarRutaSubida(ruta2);

		alex.puntuarRuta(ruta1, 10);
		usuarioDAO.persistir(nacho);
		usuarioDAO.persistir(alex);
		usuarioDAO.persistir(josefina);
		perfilDAO.persistir(admin);
		perfilDAO.persistir(admin2);

		
		List<Perfil> listaPerfiles = perfilDAO.recuperarTodos();
		for(Perfil p:listaPerfiles){
			System.out.println("perfil " +p.getNombre());
		}
		
		List<Usuario> listaUsuarios = usuarioDAO.recuperarTodos();
		for(Usuario u:listaUsuarios){
			System.out.println("usuario "+u.getNombre());
		}
		Usuario usuario =  (Usuario) usuarioDAO.recuperarNombreUsuario("ignaciovacca");
		Usuario usuario2 = (Usuario) usuarioDAO.recuperarNombreUsuario("alexrojas");
		List<Ruta> rutasNacho = (List<Ruta>) usuario.getMisRutas();
		for (Ruta r: rutasNacho){
			System.out.println(r.getId_ruta()+" "+r.getNombre());
		}
		
		List<Puntaje> puntajesAlex = (List<Puntaje>) usuario2.getMisPuntajes();
		for (Puntaje p: puntajesAlex){
			System.out.println(p.getId_puntaje()+ " " + p.getRuta().getNombre() + " " + p.getRuta().getUsuario().getNombreUsuario());
		}
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
