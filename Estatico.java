class A {	
	
	// bloque no-estático de inicialización de la clase
	{
		// compila como "y" o como "this.y" o como "A.y"
		y++;

		// x en este bloque compila solo con la referencia this
		this.x++; 
		System.out.println("x en el bloque: " + this.x);
	}

	// "x" y "y" se declaran después del bloque y compila
	int x;
	static int y; // 

	A() {
		System.out.println("Constructor");
	}

	public static void main(String... args) {
		A a = new A();
		System.out.println("x en main(): " + a.x);
		System.out.println("y en main(): " + A.y);
	}
	
}