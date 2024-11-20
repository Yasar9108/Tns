package Basics_Java;

public class VariableDemo {
//	instance variable
	int a =100;
	void start() {
//		local variable
		String name ="Yasar";
		System.out.println(name);
	}
	static String name ="Hey";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo ob =new VariableDemo();
		ob.start();
		System.out.println(ob.a);
		System.out.println(name);

	}

}
