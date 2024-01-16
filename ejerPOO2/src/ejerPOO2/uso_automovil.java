package ejerPOO2;
public class uso_automovil {
	public static void main(String[] args) {
		automovil ferrari = new automovil();
		ferrari.establece_marca();
		System.out.println(ferrari.dime_marca());
	
		ferrari.establece_modelo();
		System.out.println(ferrari.dime_modelo());
	}
}
