public class Frases {
	public static String[] frases = {
			"frase 1",
			"frase 2",
			"frase 3",
			"frase 4",
	};

	public static void main(String[] args) {
		
		if (args.length == 0) {
			mostrarFrasealeatoria ();
		}
		else {
			mostrarTodaslasfrases ();
		}
		
	}
	public static void mostrarFrasealeatoria () {
			double numeroAleatorio =Math.random()*frases.length;
			int numeroAleatorioEntero = (int)numeroAleatorio;
			System.out.println(frases[numeroAleatorioEntero]);
		}

	public static void mostrarTodaslasfrases () {
		for (int i=0; i<frases.length; i++ ) {
		System.out.println (frases[i] );
	}

}
}