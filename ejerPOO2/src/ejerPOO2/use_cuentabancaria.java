package ejerPOO2;

public class use_cuentabancaria {
	public static void main(String[] args) {
		cuenta_bancaria cuentaAdri = new cuenta_bancaria();
		cuentaAdri.establece_titular();
		System.out.println(cuentaAdri.dime_titular());
		cuentaAdri.establece_saldo();
		System.out.println(cuentaAdri.dime_saldo());
	}
}
