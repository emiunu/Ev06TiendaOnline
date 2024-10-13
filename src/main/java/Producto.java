import java.util.*;

public class Producto {

	private Collection<FamiliaDeProductos> familia;
	private int codigoBarras;
	private int precio;
	private String nombre;

	public int getCodigoBarras() {
		return this.codigoBarras;
	}

	/**
	 * 
	 * @param codigoBarras
	 */
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public int getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

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

	/**
	 * 
	 * @param codigoBarras
	 * @param precio
	 * @param nombre
	 */
	public Producto(int codigoBarras, int precio, String nombre) {
		// TODO - implement Producto.Producto
		throw new UnsupportedOperationException();
	}

}