import java.util.ArrayList;

public class VeiculoOcasiao extends Veiculo{

    private boolean promocao;

    public VeiculoOcasiao(){
        super();
        this.promocao = false;
    }

    public VeiculoOcasiao(String marca, String modelo, String matricula, int ano, double velocidademedia, double precokm, ArrayList<Integer> classificacao, int kms, int kmsUltimo, boolean p){
        super(marca,modelo,matricula,ano,velocidademedia,precokm,classificacao,kms,kmsUltimo);
        this.promocao = p;
    }

    public VeiculoOcasiao(VeiculoOcasiao vo){
        super(vo);
        this.promocao = vo.getPromocao();
    }

    public boolean getPromocao(){
        return this.promocao;
    }

    public void setPromocao(boolean p){
        this.promocao = p;
    }

    @Override
    public double custoRealKM() {
        return this.promocao ? super.custoRealKM() * 0.75 : super.custoRealKM();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(" Promocao? ").append(this.promocao);
        return sb.toString();
    }

    public VeiculoOcasiao clone(){
        return new VeiculoOcasiao(this);
    }
}
