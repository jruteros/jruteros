package misClases;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("usuario")
public class Usuario extends Perfil{
@OneToMany(mappedBy="usuario")
private Collection<Ruta> misRutasSubidas;
//private Collection<Ruta> rutasRealizadas;
@OneToMany(mappedBy="usuario")
private Collection<Puntaje> misPuntajes;

public Collection<Ruta> getMisRutasSubidas() {
	return misRutasSubidas;
}
public void setMisRutasSubidas(Collection<Ruta> misRutasSubidas) {
	this.misRutasSubidas = misRutasSubidas;
}
/*public Collection<Ruta> getRutasRealizadas() {
	return rutasRealizadas;
}
public void setRutasRealizadas(Collection<Ruta> rutasRealizadas) {
	this.rutasRealizadas = rutasRealizadas;
}*/
public Collection<Puntaje> getMisPuntajes() {
	return misPuntajes;
}
public void setMisPuntajes(Collection<Puntaje> misPuntajes) {
	this.misPuntajes = misPuntajes;
}


}
