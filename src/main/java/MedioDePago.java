public class MedioDePago {

	private Cuenta cuenta;
	private String numeroTarjeta;
	private String fechaExp;
	private int cvv;
	private String nombreTitular;

	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	/**
	 * 
	 * @param numeroTarjeta
	 */
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getFechaExp() {
		return this.fechaExp;
	}

	/**
	 * 
	 * @param fechaExp
	 */
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}

	public int getCvv() {
		return this.cvv;
	}

	/**
	 * 
	 * @param cvv
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getNombreTitular() {
		return this.nombreTitular;
	}

	/**
	 * 
	 * @param nombreTitular
	 */
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	/**
	 * 
	 * @param numeroTarjeta
	 * @param fechaExp
	 * @param cvv
	 * @param nombreTitular
	 */
	public MedioDePago(String numeroTarjeta, String fechaExp, int cvv, String nombreTitular) {
		// TODO - implement MedioDePago.MedioDePago
		throw new UnsupportedOperationException();
	}

}