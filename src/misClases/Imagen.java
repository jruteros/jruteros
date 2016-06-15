package misClases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Imagen {

	@Id @GeneratedValue
	private Long id_imagen;
	
	private String nombre;
	
	private String descripcion;
	
	private int anchura;
	
	private float altura;
	
	@ManyToOne(optional = true)
	@JoinColumn(name="id_ruta")
	private Ruta ruta;
	
	private String ruta_relativa;
	
	public Long getId_imagen() {
		return id_imagen;
	}
	
	public void setId_imagen(Long id_imagen) {
		this.id_imagen = id_imagen;
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
	
	public int getAnchura() {
		return anchura;
	}
	
	public void setAnchura(int ancho) {
		this.anchura = ancho;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	
	public String getRuta_relativa() {
		return ruta_relativa;
	}
	
	public void setRuta_relativa(String ruta_relativa) {
		this.ruta_relativa = ruta_relativa;
	}
}
