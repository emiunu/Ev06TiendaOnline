public enum EstadoCuenta {
	NUEVO("NUEVO"),
	ACTIVO("ACTIVO"),
	BLOQUEADO_TEMPORALMENTE("BLOQUEADO TEMPORALMENTE"),
	PROHIBIDO("PROHIBIDO");

	private String estado;

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	EstadoCuenta(String estado) {
		// TODO - implement EstadoCuenta.EstadoCuenta
		throw new UnsupportedOperationException();
	}

}