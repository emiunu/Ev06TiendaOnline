public class Cliente {

	private Cuenta cuenta;
	private String nombre;
	private String rut;
	private String correo;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	/**
	 * 
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return this.correo;
	}

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * 
	 * @param nombre
	 * @param rut
	 * @param correo
	 */
	public Cliente(String nombre, String rut, String correo) {
		// TODO - implement Cliente.Cliente
		throw new UnsupportedOperationException();
	}

}