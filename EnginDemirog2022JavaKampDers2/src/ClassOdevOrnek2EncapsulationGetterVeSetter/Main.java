package ClassOdevOrnek2EncapsulationGetterVeSetter;


public class Main {
	
	public static void main(String[] args) {
		
		getterVeSetter xxx = new getterVeSetter();
		
		xxx.set_carName("BMW İ4 ");
		xxx.set_carColor("deedefefef");
		xxx.set_price(3113600);
		xxx.set_stock(17);
		
		
		
		
		System.out.println("Arabanın ismi ve modeli  = "+ xxx.getcarName()  );
		
		System.out.println("Rengi = " + xxx.getcarColor());
		
		System.out.println("Arabanın değeri = "+ xxx.get_price()  );
		
		System.out.println("Araban stoktaki adedi = "+ xxx.get_stock() );
	}
	

	
}