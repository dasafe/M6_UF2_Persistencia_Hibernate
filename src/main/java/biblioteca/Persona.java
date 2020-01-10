package biblioteca;
// Generated 10-ene-2020 16:42:18 by Hibernate Tools 5.4.7.Final

/**
 * Persona generated by hbm2java
 */
public class Persona implements java.io.Serializable {

	private Integer dni;
	private String nomPersona;
	private Integer telefon;

	public Persona() {
	}

	public Persona(String nomPersona) {
		this.nomPersona = nomPersona;
	}

	public Persona(String nomPersona, Integer telefon) {
		this.nomPersona = nomPersona;
		this.telefon = telefon;
	}

	public Integer getDni() {
		return this.dni;
	}

	private void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNomPersona() {
		return this.nomPersona;
	}

	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}

	public Integer getTelefon() {
		return this.telefon;
	}

	public void setTelefon(Integer telefon) {
		this.telefon = telefon;
	}

}