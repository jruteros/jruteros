package pruebas;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
import misClases.Privacidad;
import misClases.Puntaje;
import misClases.Ruta;
import misClases.Sexo;
import misClases.Usuario;
import clasesUtiles.EMF;

/**
 * Servlet implementation class PruebaPersistencia
 */
@WebServlet("/Prueba")
public class PruebaPersistencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaPersistencia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		
		Sexo masculino = new Sexo();
		masculino.setGenero("masculino");
		
		Sexo femenino = new Sexo();
		femenino.setGenero("femenino");
		
		Administrador admin = new Administrador();
		admin.setNombre("Alex");
		admin.setApellido("Rojas");
		admin.setDni(35609879);
		admin.setDomicilio("60 y 25");
		admin.setNombreUsuario("Alex");
		admin.setClave("alex");
		admin.setSexo(masculino);
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Ignacio");
		usuario.setApellido("Vacca");
		usuario.setDni(35000000);
		usuario.setDomicilio("7 y 50");
		usuario.setNombreUsuario("Ignacio");
		usuario.setClave("ignacio");
		usuario.setSexo(masculino);
		
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Sofia");
		usuario1.setApellido("Bartoli");
		usuario1.setDni(33000000);
		usuario1.setDomicilio("Plaza Moreno");
		usuario1.setNombreUsuario("Sofia");
		usuario1.setClave("sofia");
		usuario1.setSexo(femenino);
		
		Formato ida = new Formato();
		ida.setNombre("ida");
		
		Actividad mountanbike = new Actividad();
		mountanbike.setNombre("mountanbike");
		
		Actividad ciclismo = new Actividad();
		ciclismo.setNombre("ciclismo");
		
		Actividad cicloturismo = new Actividad();
		cicloturismo.setNombre("cicloturismo");
		
		Actividad senderismo = new Actividad();
		senderismo.setNombre("senderismo");
		
		Actividad carreraPorMontaña= new Actividad();
		carreraPorMontaña.setNombre("carrera por montaña");
		
		Actividad alpinismo = new Actividad();
		alpinismo.setNombre("alpinismo");
		
		Coordenada coordenada = new Coordenada();
		
		
		Dificultad facil = new Dificultad();
		facil.setNombre("facil");
		
		Dificultad moderado = new Dificultad();
		moderado.setNombre("moderado");
		
		Dificultad dificil = new Dificultad();
		dificil.setNombre("dificil");
		
		Dificultad muydificil = new Dificultad();
		muydificil.setNombre("muydificil");
		
		Dificultad experto = new Dificultad();
		experto.setNombre("solo expertos");
		
		Privacidad publica = new Privacidad();
		publica.setNombre("privada");
		
		Privacidad privada = new Privacidad();
		privada.setNombre("publica");
		
		Ruta ruta = new Ruta();
		ruta.setNombre("ruta1");
		ruta.setDescripcion("ruta - amazonas");
		Date date = new Date(Calendar.getInstance().getTime().getTime());
		ruta.setFecha_realizacion(date);
		ruta.setPrivacidad(publica);
		ruta.setDificultad(moderado);
		ruta.setFormato(ida);
		ruta.setActividad(ciclismo);
		ruta.setUsuario(usuario);
		
		Puntaje puntaje = new Puntaje();
		puntaje.setRuta(ruta);
		puntaje.setUsuario(usuario1);
		puntaje.setPuntuacion(8);
		
		em.persist(masculino);
		em.persist(femenino);
		em.persist(admin);
		em.persist(usuario);
		em.persist(usuario1);
		em.persist(ida);
		em.persist(mountanbike);
		em.persist(ciclismo);
		em.persist(cicloturismo);
		em.persist(carreraPorMontaña);
		em.persist(alpinismo);
		em.persist(senderismo);
		em.persist(coordenada);
		em.persist(facil);
		em.persist(moderado);
		em.persist(dificil);
		em.persist(muydificil);
		em.persist(experto);
		em.persist(privada);
		em.persist(publica);
		em.persist(ruta);
		em.persist(puntaje);
		etx.commit();
	    em.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
