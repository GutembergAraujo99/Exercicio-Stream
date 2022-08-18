package exercicioContinuacaoSteam;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Veiculos> veiculos = new ArrayList<>();

        Veiculos veiculos1 = new Veiculos("VW", "Fox", "4F38p47NdTk387452");
        Veiculos veiculos2 = new Veiculos("Fiat", "Toro", "");
        Veiculos veiculos3 = new Veiculos("GM", "Cruzer", "2TgdA8SKYVU4u9620");
        Veiculos veiculos4 = new Veiculos("VW", "Nivus", " ");
        Veiculos veiculos5 = new Veiculos("Ford", "Fiesta", "3zu7e10edjnh30361");

        veiculos.add(veiculos1);
        veiculos.add(veiculos2);
        veiculos.add(veiculos3);
        veiculos.add(veiculos4);
        veiculos.add(veiculos5);


        for (Veiculos veiculo : veiculos){
            if(veiculo.getChassiVeiculo() != "");
        }

    }
}