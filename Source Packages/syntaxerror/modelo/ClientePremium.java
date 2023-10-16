package syntaxerror.modelo;


public class ClientePremium extends Cliente{
	
	//Constructor
	public ClientePremium(String correoElectronico, String nombre, String direccion) {
		super(correoElectronico, nombre, direccion);
	}

	@Override
	public String tipoCliente() {
		return "Premium";
	}

	@Override
	public double calcAnual() {
		// Implementación del cálculo de la cuota anual para un cliente premium.
		return 0.0;
	}

	@Override
	public double descuentoEnv() {
		// Implementación del descuento de gastos de envío para un cliente premium.
		return 0.0;
	}
	
	
	
	
}
