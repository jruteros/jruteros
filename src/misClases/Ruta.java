package misClases;

import java.sql.Date;
import java.sql.Time;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ruta {
@Id @GeneratedValue
private Long id_ruta;
private String nombre;
private String descripcion;
private Float distancia;
private Time tiempo_estimado;
private Date fecha_realizacion;
@ManyToOne(optional = true)
@JoinColumn(name="id_usuario")
private Usuario usuario;
@ManyToOne(optional = true)
@JoinColumn(name="id_formato")
private Formato formato;
@ManyToOne(optional = true)
@JoinColumn(name="id_actividad")
private Actividad actividad;
@ManyToOne(optional = true)
@JoinColumn(name="id_dificultad")
private Dificultad dificultad;
@ManyToOne(optional = true)
@JoinColumn(name="id_privacidad")
private Privacidad privacidad;
//private Collection<Usuario>rutasRealizadas;
@OneToMany(mappedBy="ruta")
private Collection<Puntaje> puntajes;
@OneToMany(mappedBy="ruta")
private Collection<Coordenada>coordenadas;
@OneToMany(mappedBy="ruta")
private Collection<Imagen>imagenes;

public Long getId_ruta() {
	return id_ruta;
}
public void setId_ruta(Long id_ruta) {
	this.id_ruta = id_ruta;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public Float getDistancia() {
	return distancia;
}
public void setDistancia(Float distancia) {
	this.distancia = distancia;
}
public Time getTiempo_estimado() {
	return tiempo_estimado;
}
public void setTiempo_estimado(Time tiempo_estimado) {
	this.tiempo_estimado = tiempo_estimado;
}
public Date getFecha_realizacion() {
	return fecha_realizacion;
}
public void setFecha_realizacion(Date fecha_realizacion) {
	this.fecha_realizacion = fecha_realizacion;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public Formato getFormato() {
	return formato;
}
public void setFormato(Formato formato) {
	this.formato = formato;
}
public Actividad getActividad() {
	return actividad;
}
public void setActividad(Actividad actividad) {
	this.actividad = actividad;
}
public Dificultad getDificultad() {
	return dificultad;
}
public void setDificultad(Dificultad dificultad) {
	this.dificultad = dificultad;
}
/*public Collection<Usuario> getRutasRealizadas() {
	return rutasRealizadas;
}
public void setRutasRealizadas(Collection<Usuario> rutasRealizadas) {
	this.rutasRealizadas = rutasRealizadas;
}*/
public Collection<Puntaje> getPuntajes() {
	return puntajes;
}
public void setPuntajes(Collection<Puntaje> puntajes) {
	this.puntajes = puntajes;
}
public Collection<Coordenada> getCoordenadas() {
	return coordenadas;
}
public void setCoordenadas(Collection<Coordenada> coordenadas) {
	this.coordenadas = coordenadas;
}
public Collection<Imagen> getImagenes() {
	return imagenes;
}
public void setImagenes(Collection<Imagen> imagenes) {
	this.imagenes = imagenes;
}
public Privacidad getPrivacidad() {
	return privacidad;
}
public void setPrivacidad(Privacidad privacidad) {
	this.privacidad = privacidad;
}


}
