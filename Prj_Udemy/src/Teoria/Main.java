package Teoria;

public class Main {

	public static void main(String[] args) {
		
		Smartphone sm = new Smartphone();
		sm.setImiei("12431r11");
		sm.setMarca("Apple");
		sm.setModello("Iphone 13");
		
		Smartphone sm2 = new Smartphone();
		sm2.setImiei("121aa1r11");
		sm2.setMarca("Samsung");
		sm2.setModello("Galaxy 21");
		
		System.out.println(sm2.getStores());
		

	}

}
