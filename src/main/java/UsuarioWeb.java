public class UsuarioWeb {

	private EstadoCuenta estado;
	private Carrito carrito;
	private Cliente cliente;
	private String usuario;
	private String contrasenna;

	public String getUsuario() {
		return this.usuario;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenna() {
		return this.contrasenna;
	}

	/**
	 * 
	 * @param contrasenna
	 */
	public void setContrasenna(String contrasenna) {
		this.contrasenna = contrasenna;
	}

	/**
	 * 
	 * @param usuario
	 * @param contrasenna
	 * @param estado
	 * @param cliente
	 */
	public UsuarioWeb(String usuario, String contrasenna, String estado, Cliente cliente) {
		// TODO - implement UsuarioWeb.UsuarioWeb
		throw new UnsupportedOperationException();
	}

}