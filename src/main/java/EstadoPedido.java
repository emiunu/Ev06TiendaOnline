public enum EstadoPedido {
	NUEVO("NUEVO"),
	CREADO("CREADO"),
	DESPACHADO("DESPACHADO"),
	RECIBIDO("RECIBIDO"),
	CERRADO("CERRADO");

	private String estado;

	public String getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	EstadoPedido(String estado) {
		// TODO - implement EstadoPedido.EstadoPedido
		throw new UnsupportedOperationException();
	}

}