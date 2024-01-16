package ejerPOO2;

public class cuenta_bancaria {
	private String titular;
	private Double saldo;
	
	public String dime_titular() {
		return ("El titular es " +titular);
	}
	public void establece_titular() {
		titular = "Adrian";
	}
	public String dime_saldo() {
		return ("El saldo es " +saldo);
	}
	public void establece_saldo() {
		saldo=(double) -5;
		if(saldo >= 0) {
			saldo = saldo;
		}else {
			System.out.println("El saldo no puede ser negativo");
		}
	}
}
