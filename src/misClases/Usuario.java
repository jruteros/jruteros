package misClases;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("usuario")
public class Usuario extends Perfil{
	
	@OneToMany(mappedBy="usuario")
	private Collection<Ruta> misRutas;

	@OneToMany(mappedBy="usuario")
	private Collection<Puntaje> misPuntajes;

	public Collection<Ruta> getMisRutas() {
		return misRutas;
	}

	public void setMisRutasSubidas(Collection<Ruta> misRutas) {
		this.misRutas = misRutas;
	}

	public Collection<Puntaje> getMisPuntajes() {
		return misPuntajes;
	}

	public void setMisPuntajes(Collection<Puntaje> misPuntajes) {
		this.misPuntajes = misPuntajes;
	}

	public void agregarPuntaje(Puntaje puntaje) {
		this.misPuntajes.add(puntaje);
	}
	
	public void agregarRutaSubida(Ruta ruta) {
		this.misRutas.add(ruta);
	}
}
