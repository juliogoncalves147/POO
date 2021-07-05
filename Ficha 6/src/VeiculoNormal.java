import java.util.ArrayList;
import java.util.List;

public class VeiculoNormal extends Veiculo
{

    public VeiculoNormal(){
        super();
    }

    public VeiculoNormal(String marca, String modelo, String matricula, int ano, int velocidade, double precoKm, ArrayList<Integer> classificacao, int kms, int kmsUltimo){
        super(marca,modelo,matricula,ano,velocidade,precoKm,classificacao, kms, kmsUltimo);
    }

    public  VeiculoNormal(VeiculoNormal v){
        super(v);
    }

    public double custoRealKM(){
        return getPrecokm()*1.1;
    }

    public VeiculoNormal clone(){
        return new VeiculoNormal(this);
    }

}
