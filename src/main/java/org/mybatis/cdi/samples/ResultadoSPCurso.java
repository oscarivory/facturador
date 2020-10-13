package org.mybatis.cdi.samples;


public class ResultadoSPCurso {

	private int id;
	private boolean activo;
	private String titulo;
	private String nivel;
	private int horas;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setProfesor(String Nombre) {
		this.nombre = Nombre;
	}
}
