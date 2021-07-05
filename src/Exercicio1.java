import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;


public class Exercicio1 {
	
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
		
			
		System.out.println("Crie uma lista e adicione novos modelos de carro:\n");
		
		
		
		ArrayList<String> modelosNovos = new ArrayList<String>();
		
		modelosNovos.add("OPALA");
		modelosNovos.add("D20");
		modelosNovos.add("FERRAR");
		modelosNovos.add("DODGE");
		
		System.out.println(modelosNovos.toString());
		
		ArrayList<String>  novoCombustivel = new ArrayList<String>() ;
		
		novoCombustivel.add("DIESEL");
		novoCombustivel.add("GÁS");
		novoCombustivel.add("ELETRICO");
		
		System.out.println(novoCombustivel.toString()); 
		
		System.out.print(modelos.length);
			
			System.out.println("O elemento da matriz na posicao [0][0] e " + matriz[0][0]);
			}   	

	}