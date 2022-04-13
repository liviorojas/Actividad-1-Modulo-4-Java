public class Remuneraciones {

	public static void main(String[] args) {
		if (args.length <6) {
			mostrarAyuda();

	} else {
		calcularRemuneraciones(args);
	}
	}
	private static void mostrarAyuda() {
		System.out.println("R[sueldoBase] [colacion] [movilizacion] [afp] [salud] [tipoContrato]");
		
	}
	
	private static void calcularRemuneraciones(String[]args) {
		int sueldoBase = Integer.parseInt(args[0]);
		int colacion = Integer.parseInt(args[1]);
		int movilización = Integer.parseInt(args[2]);
		String afp = args[3];
		String salud = args[4];
		char tipoContrato = args[5].charAt(0);
		
		
		int montoImponible = CalcularMontoImponible(sueldoBase);
		int montoAFP = calcularMontoAFP(montoImponible,afp);
		
		
		System.out.printf("Monto Imponible: %s\n",sueldoBase);
		System.out.printf("AFP: %s\n",afp);
		System.out.printf("AFP: $%d\n", montoAFP);
		
			
	}
	private static int CalcularMontoImponible(int sueldoBase) {
		return sueldoBase ;
}
	private static int CalcularMontoNoImponible(int colacion,int movilizacion) {
		return colacion + movilizacion;
	}
	private static int calcularMontoAFP	(int montoImponible, String afp) {
		switch (afp) {
			case "capital" :{ 
			return (int) (montoImponible*0.1144);
			}
			case "cuprum" :{ 
				return (int) (montoImponible*0.1144);
			}
			case "habitat" :{ 
				return (int) (montoImponible*0.1127);
			}
			case "planvital" :{ 
				return (int) (montoImponible*0.1116);
			}
			case "provida" :{ 
				return (int) (montoImponible*0.1145);
			}
			case "modelo" :{ 
				return (int) (montoImponible*0.1145);
			}
			case "uno" :{ 
				return (int) (montoImponible*0.1069);
			}
			
			}
		return 0;	
	}
}