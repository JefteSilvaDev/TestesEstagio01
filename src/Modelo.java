package br.com.teste;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    public static void main(String[] args) {

        //Lista de Modelos.
        List<Modelo> lista = new ArrayList<>();
        Modelo carro1 = new Modelo();
        carro1.setModelo("FIAT-UNO");
        Modelo carro2 = new Modelo();
        carro2.setModelo("FORD-KA1");
        Modelo carro3 = new Modelo();
        carro3.setModelo("FORD-KA1");
        Modelo carro4 = new Modelo();
        carro4.setModelo("CITROEN-C31");
        Modelo carro5 = new Modelo();
        carro5.setModelo("RENAULT-CLIO1");
        Modelo carro6 = new Modelo();
        carro6.setModelo("AUDI-A12");
        Modelo carro7 = new Modelo();
        carro7.setModelo("FORD-KA2");
        Modelo carro8 = new Modelo();
        carro8.setModelo("RENAULT-CLIO2");
        Modelo carro9 = new Modelo();
        carro9.setModelo("CITROEN-C32");
        Modelo carro10 = new Modelo();
        carro10.setModelo("FORD-KA3");
        Modelo carro11 = new Modelo();
        carro11.setModelo("AUDI-A4");
        lista.add(carro1);
        lista.add(carro2);
        lista.add(carro3);
        lista.add(carro4);
        lista.add(carro5);
        lista.add(carro6);
        lista.add(carro7);
        lista.add(carro8);
        lista.add(carro9);
        lista.add(carro10);
        lista.add(carro11);
    }
}