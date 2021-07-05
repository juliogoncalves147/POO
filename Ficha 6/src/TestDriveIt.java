import java.util.ArrayList;

public class TestDriveIt {


    public static void main(String[] args){

        Veiculo v1 = new Veiculo("Ford", "Fiesta", "AA-10-10", 2017, 55, 4, new ArrayList<>(), 30221, 120);

        VeiculoOcasiao vo1 = new VeiculoOcasiao("Fiat", "500", "BB-33-11", 2017, 55, 4, new ArrayList<>(), 30221, 120, false);

        VeiculoPremium vp1 = new VeiculoPremium("Ferrari", "TestaRossa", "FF-42-41", 2021, 100, 8, new ArrayList<>(), 10023, 1232, 3);

        DriveIt braga = new DriveIt();

        braga.adiciona(v1);
        braga.adiciona(vo1);
        braga.adiciona(vp1);

        System.out.println("Lista de Veiculos\n");
        System.out.println(braga.getVeiculosAsList().toString());
    }

}
