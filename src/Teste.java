import java.util.ArrayList;
import java.util.List;

public class Teste {
		
		private static String[] modelos;
		private static String[] Placa;
		private static String[][] matriz;

		public static void main(String[] args) {
			
			String[] modelos = new String[] {"FIAT-UNO","FORD-KA1","AUDI-A11","CITROEN-C31","RENAULT-CLIO1","AUDI-A12","FORD-KA2","RENAULT-CLIO2","CITROEN-C32","FORD-KA3",	"AUDI-A4"};
			String[] Placa = new String[] {"JGG-7389","JGF-8573","JGE-0620","JWM-1235","KRM-6771","JGE-4583","JGE-9393","JGE-0611","JHM-7491","JGM-4773","JMM-7513"};
			
			int numCarros = 11;
			
			double[]ConsumoEtanol = new double[numCarros];
			ConsumoEtanol[0]= 8.9; 	ConsumoEtanol[1]= 8.1;	ConsumoEtanol[2]= 10;	ConsumoEtanol[3]= 7.5;	ConsumoEtanol[4]= 9.5;	ConsumoEtanol[5]= 10;	
			ConsumoEtanol[6]= 8.1;	ConsumoEtanol[7]= 9.5;	ConsumoEtanol[8]= 7.5;	ConsumoEtanol[9]= 8.1;	ConsumoEtanol[10]= 8;
		
			double[]ConsumoGasolina = new double[numCarros];
			ConsumoGasolina[0]= 12.7;	ConsumoGasolina[1]= 11.6;	ConsumoGasolina[2]= 10.8;	ConsumoGasolina[3]= 11.9;	ConsumoGasolina[4]= 14.3;	ConsumoGasolina[5]= 8;
			ConsumoGasolina[6]= 11.6;	ConsumoGasolina[7]= 14.3;	ConsumoGasolina[8]= 11.9;   ConsumoGasolina[9]= 11.6;	ConsumoGasolina[10]= 8;
			
			double[] CapacidadeTanque = new double[numCarros];
			CapacidadeTanque[0]= 48;	CapacidadeTanque[1]= 55;	CapacidadeTanque[2]= 45;	CapacidadeTanque[3]= 47;	CapacidadeTanque[4]= 50;	CapacidadeTanque[5]= 45;
			CapacidadeTanque[6]= 55;    CapacidadeTanque[7]= 50;	CapacidadeTanque[8]= 47;   	CapacidadeTanque[9]= 55;	CapacidadeTanque[10]= 65;
		
		System.out.printf("O modelo do carro �:FIAT-UNO, Carro JGG-7389\n O consumo do carro � com ETANOL �: 8.9 \n O consumo do carro � com GASOLINA �: 12.7 \n A capacidade do tanque �:48 \n\n");
		
		System.out.printf("O modelo do carro �:FORD-KA1, Carro JGF-8573\n O consumo do carro � com ETANOL �: 8.1 \n O consumo do carro � com GASOLINA �: 11.6 \n A capacidade do tanque �:55 \n\n");
		
		System.out.printf("O modelo do carro �:AUDI-A11, Carro JGE-0620\n O consumo do carro � com ETANOL �: 10 \n O consumo do carro � com GASOLINA �: 10.8 \n A capacidade do tanque �:45 \n\n");
		
		System.out.printf("O modelo do carro �:CITROEN-C31, Carro JWM-1235\n O consumo do carro � com ETANOL �: 7.5 \n O consumo do carro � com GASOLINA �: 11.9 \n A capacidade do tanque �:47 \n\n");
		
		System.out.printf("O modelo do carro �:RENAULT-CLIO1, Carro KRM-6771\n O consumo do carro � com ETANOL �: 9.5 \n O consumo do carro � com GASOLINA �: 14.3 \n A capacidade do tanque �:50 \n\n");
		
		System.out.printf("O modelo do carro �:AUDI-A12, Carro JGE-4583\n O consumo do carro � com ETANOL �: 10 \n O consumo do carro � com GASOLINA �: 8 \n A capacidade do tanque �:45 \n\n");
		
		System.out.printf("O modelo do carro �:FORD-KA2, Carro JGE-9393\n O consumo do carro � com ETANOL �: 8.1 \n O consumo do carro � com GASOLINA �: 11.6 \n A capacidade do tanque �:55 \n\n");
		
		System.out.printf("O modelo do carro �:RENAULT-CLIO2, Carro JGE-0611\n O consumo do carro � com ETANOL �: 9.5 \n O consumo do carro � com GASOLINA �: 14.3 \n A capacidade do tanque �:50 \n\n");
		
		System.out.printf("O modelo do carro �:CITROEN-C32, Carro JHM-7491\n O consumo do carro � com ETANOL �: 7.5 \n O consumo do carro � com GASOLINA �: 11.9 \n A capacidade do tanque �:47 \n\n");
		
		System.out.printf("O modelo do carro �:FORD-KA3, Carro JGM-4773\n O consumo do carro � com ETANOL �: 8.1 \n O consumo do carro � com GASOLINA �: 11.6 \n A capacidade do tanque �:55 \n\n");
		
		System.out.printf("O modelo do carro �:AUDI-A4, Carro JMM-7513\n O consumo do carro � com ETANOL �: 8 \n O consumo do carro � com GASOLINA �: 8 \n A capacidade do tanque �:65 \n\n\n\n");
		

		System.out.println("Crie uma lista e adicione novos modelos de carro:\n");
		
	
		ArrayList<String> modelosNovos = new ArrayList<String>();
		
		modelosNovos.add("OPALA - Carro JHG-3562 \n\n");
		modelosNovos.add("D20 - Carro JUY-3582 \n\n");
		modelosNovos.add("FERRARI - Carro OUR-9858 \n\n");
		modelosNovos.add("DODGE - Carro JZW-8704 \n\n");
		
		System.out.println(modelosNovos.toString());
		
		ArrayList<String>  novoCombustivel = new ArrayList<String>() ;
		
		novoCombustivel.add("DIESEL\n");
		novoCombustivel.add("G�S \n");
		novoCombustivel.add("ELETRICO \n");
		
		System.out.println(novoCombustivel.toString()); 
		
		int GastoTotalFIAT = 0;
		int GastoTotalFORDK1 = 1;
		int GastoTotalAUDI = 2;
		int GastoTotalCITROEN1 = 3;
		int GastoTotalRENAUTCLIO1 = 4;
		int GastoTotalAUDIA12 = 5;
		int GastoTotalFORDK2 = 6;
		int GastoTotalRENAUTLCLIO2 = 7;
		int GastoTotalCITROEN2 = 8;
		int GastoTotalFORDK3 = 9;
		int GastoTotalAUDIA4= 10;
		
		System.out.println("Consumo do FIAT" + ConsumoGasolina[GastoTotalFIAT] * CapacidadeTanque[GastoTotalFIAT]);
		System.out.println("Consumo do FORDK1" + ConsumoGasolina[GastoTotalFORDK1] * CapacidadeTanque[GastoTotalFORDK1]);
		System.out.println("Consumo do AUDI" + ConsumoGasolina[GastoTotalAUDI] * CapacidadeTanque[GastoTotalAUDI]);
		System.out.println("Consumo do CITROEN1" + ConsumoGasolina[GastoTotalCITROEN1] * CapacidadeTanque[GastoTotalCITROEN1]);
		System.out.println("Consumo do RENAUTCLIO1" +ConsumoGasolina[GastoTotalRENAUTCLIO1] * CapacidadeTanque[GastoTotalRENAUTCLIO1]);
		System.out.println("Consumo do AUDIA12" +ConsumoGasolina[GastoTotalAUDIA12] * CapacidadeTanque[GastoTotalAUDIA12]);
		System.out.println("Consumo do FORDK2" +ConsumoGasolina[GastoTotalFORDK2] * CapacidadeTanque[GastoTotalFORDK2]);
		System.out.println("Consumo do RENAUTLCLIO2" +ConsumoGasolina[GastoTotalRENAUTLCLIO2] * CapacidadeTanque[GastoTotalRENAUTLCLIO2]);
		System.out.println("Consumo do CITROEN2" +ConsumoGasolina[GastoTotalCITROEN2] * CapacidadeTanque[GastoTotalCITROEN2]);
		System.out.println("Consumo do FORDK3" +ConsumoGasolina[GastoTotalFORDK3] * CapacidadeTanque[GastoTotalFORDK3]);
		System.out.println("Consumo do AUDIA4" +ConsumoGasolina[GastoTotalCITROEN2] * CapacidadeTanque[GastoTotalCITROEN2]);
		
		
	}

}
