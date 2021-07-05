package br.com.teste;
import java.util.ArrayList;
import java.util.List;

public class Carro{

    private String placa;
    private double consumo;
    private double capTanque;

        public static void main(String[] args) {

            //Lista de placas
            List<Carro> placaVeiculo = new ArrayList<>();
            Carro placa1 = new Carro();
            placa1.setPlaca("JGG-7389");
            Carro placa2 = new Carro();
            placa2.setPlaca("JGF-8573");
            Carro placa3 = new Carro();
            placa3.setPlaca("JGE-0620");
            Carro placa4 = new Carro();
            placa4.setPlaca("JWM-1235");
            Carro placa5 = new Carro();
            placa5.setPlaca("KRM-6771");
            Carro placa6 = new Carro();
            placa6.setPlaca("JGE-4583");
            Carro placa7 = new Carro();
            placa7.setPlaca("JGE-9393");
            Carro placa8 = new Carro();
            placa8.setPlaca("JGE-0611");
            Carro placa9 = new Carro();
            placa9.setPlaca("JHM-7491");
            Carro placa10 = new Carro();
            placa10.setPlaca("JGM-4773");
            Carro placa11 = new Carro();
            placa11.setPlaca("JMM-7513");
            placaVeiculo.add(placa1);
            placaVeiculo.add(placa2);
            placaVeiculo.add(placa3);
            placaVeiculo.add(placa4);
            placaVeiculo.add(placa5);
            placaVeiculo.add(placa6);
            placaVeiculo.add(placa7);
            placaVeiculo.add(placa8);
            placaVeiculo.add(placa9);
            placaVeiculo.add(placa10);
            placaVeiculo.add(placa11);

        }
    //Lista de consumo

    List<Carro> consumoVeiculo = new ArrayList<>();
    Carro consumoCarro1 = new Carro();
        consumoCarro1.setConsumo(12.7);
    Carro consumoCarro2 = new Carro();
        consumoCarro2.setConsumo(11.6);
    Carro consumoCarro3 = new Carro();
        consumoCarro3.setConsumo(10.8);
    Carro consumoCarro4 = new Carro();
        consumoCarro4.setConsumo(11.9);
    Carro consumoCarro5 = new Carro();
        consumoCarro5.setConsumo(14.3);
    Carro consumoCarro6 = new Carro();
        consumoCarro6.setConsumo(8d);
    Carro consumoCarro7 = new Carro();
        consumoCarro7.setConsumo(11.6);
    Carro consumoCarro8 = new Carro();
        consumoCarro8.setConsumo(14.3);
    Carro consumoCarro9 = new Carro();
        consumoCarro9.setConsumo(11.9);
    Carro consumoCarro10 = new Carro();
        consumoCarro10.setConsumo(11.6);
    Carro consumoCarro11 = new Carro();
        consumoCarro11.setConsumo(8d);
        consumoVeiculo.add(consumoCarro1);
        consumoVeiculo.add(consumoCarro2);
        consumoVeiculo.add(consumoCarro3);
        consumoVeiculo.add(consumoCarro4);
        consumoVeiculo.add(consumoCarro5);
        consumoVeiculo.add(consumoCarro6);
        consumoVeiculo.add(consumoCarro7);
        consumoVeiculo.add(consumoCarro8);
        consumoVeiculo.add(consumoCarro9);
        consumoVeiculo.add(consumoCarro10);
        consumoVeiculo.add(consumoCarro11);

    //Lista de Tanque

    List<Carro> tanqueVeiculo = new ArrayList<>();
    Carro tanqueCarro1 = new Carro();
        tanqueCarro1.setCapTanque(48d);
    Carro tanqueCarro2 = new Carro();
        tanqueCarro2.setCapTanque(55d);
    Carro tanqueCarro3 = new Carro();
        tanqueCarro3.setCapTanque(45d);
    Carro tanqueCarro4 = new Carro();
        tanqueCarro4.setCapTanque(47d);
    Carro tanqueCarro5 = new Carro();
        tanqueCarro5.setCapTanque(50d);
    Carro tanqueCarro6 = new Carro();
        tanqueCarro6.setCapTanque(45d);
    Carro tanqueCarro7 = new Carro();
        tanqueCarro7.setCapTanque(55d);
    Carro tanqueCarro8 = new Carro();
        tanqueCarro8.setCapTanque(50d);
    Carro tanqueCarro9 = new Carro();
        tanqueCarro9.setCapTanque(47d);
    Carro tanqueCarro10 = new Carro();
        tanqueCarro10.setCapTanque(55d);
    Carro tanqueCarro11 = new Carro();
        tanqueCarro11.setCapTanque(65d);
        tanqueVeiculo.add(tanqueCarro1);
        tanqueVeiculo.add(tanqueCarro2);
        tanqueVeiculo.add(tanqueCarro3);
        tanqueVeiculo.add(tanqueCarro4);
        tanqueVeiculo.add(tanqueCarro5);
        tanqueVeiculo.add(tanqueCarro6);
        tanqueVeiculo.add(tanqueCarro7);
        tanqueVeiculo.add(tanqueCarro8);
        tanqueVeiculo.add(tanqueCarro9);
        tanqueVeiculo.add(tanqueCarro10);
        tanqueVeiculo.add(tanqueCarro11);

        for (int i = 0; i < lista.size(); i++){
        System.out.println(lista.get(i).getModelo());
    }

}