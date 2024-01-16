package ejerPOO2;

public class automovil {
	private String marca;
	private String modelo;
	
	public String dime_marca() {
		return ("la marca del coche es " +marca);
	}
	public void establece_marca() {
		marca = "ferrari";
	}
	public String dime_modelo() {
		return ("El modelo del coche es " +modelo);
	}
	public void establece_modelo() {
		modelo = "portofino deportivo";
	}
}
