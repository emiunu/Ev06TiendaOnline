import java.util.*;

public class Pedido {

	private EstadoPedido estado;
	private Collection<MedioDePago> mediosDePago;
	private Collection<FamiliaDeProductos> familia;
	private String fechaPedido;
	private String fechaAproxEntrega;
	private String nPedido;

	public String getFechaPedido() {
		return this.fechaPedido;
	}

	/**
	 * 
	 * @param fechaPedido
	 */
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public String getFechaAproxEntrega() {
		return this.fechaAproxEntrega;
	}

	/**
	 * 
	 * @param fechaAproxEntrega
	 */
	public void setFechaAproxEntrega(String fechaAproxEntrega) {
		this.fechaAproxEntrega = fechaAproxEntrega;
	}

	public String getNPedido() {
		return this.nPedido;
	}

	/**
	 * 
	 * @param nPedido
	 */
	public void setNPedido(String nPedido) {
		this.nPedido = nPedido;
	}

	/**
	 * 
	 * @param fechaPedido
	 * @param fechaAproxEntrega
	 * @param nPedido
	 * @param familia
	 * @param estado
	 */
	public Pedido(String fechaPedido, String fechaAproxEntrega, String nPedido, FamiliaDeProductos familia, String estado) {
		// TODO - implement Pedido.Pedido
		throw new UnsupportedOperationException();
	}

}