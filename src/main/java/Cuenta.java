import java.util.*;

public class Cuenta {

	private UsuarioWeb usuarioWeb;
	private MedioDePago mediosDePago;
	private Carrito carrito;
	private Collection<Pedido> pedidos;
	private String numero;
	private int saldo;

	public String getNumero() {
		return this.numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return this.saldo;
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @param numero
	 * @param saldo
	 * @param usuarioWeb
	 */
	public Cuenta(String numero, int saldo, UsuarioWeb usuarioWeb) {
		// TODO - implement Cuenta.Cuenta
		throw new UnsupportedOperationException();
	}

}