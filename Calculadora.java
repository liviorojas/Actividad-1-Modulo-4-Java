public class Calculadora {

	public static void main(String[] args) {
		if (args.length != 3 ) {
			System.out.println("3 argumentos");
			return;
		}
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		String operacion = args[1];
		int resultado = 0;
		switch (operacion) {
			case "suma":
				resultado = sumar(n1,n2);
				break;
			case "resta":
				resultado = restar(n1,n2);
				break;
			case "multiplica":
				resultado = multiplicar(n1,n2);
				break;	
			case "divide":
				resultado = dividir(n1,n2);
				break;	
		}
		System.out.println(resultado);
	}

	public static int sumar(int n1, int n2) {
		return n1 + n2;
		
	}
	public static int restar(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int multiplicar(int n1, int n2) {
		return n1 * n2;
	}
	public static int dividir(int n1, int n2) {
		return n1 / n2;
}
}