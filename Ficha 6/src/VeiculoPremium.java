import java.util.ArrayList;

public class VeiculoPremium extends Veiculo{

    private int taxa;

    public VeiculoPremium(){
        super();
        this.taxa = 0;
    }

    public VeiculoPremium(String marca, String modelo, String matricula, int ano, double velocidademedia, double precokm, ArrayList<Integer> classificacao, int kms, int kmsUltimo, int taxa){
        super(marca,modelo,matricula,ano,velocidademedia,precokm,classificacao,kms,kmsUltimo);
        this.taxa = taxa;
    }

    public VeiculoPremium(VeiculoPremium vo){
        super(vo);
        this.taxa = vo.getTaxa();
    }

    public int getTaxa(){
        return this.taxa;
    }

    public double custoRealKM(){
        return getPrecokm()* 1.1 * (this.taxa / 100 + 1);
    }
}
