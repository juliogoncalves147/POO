import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DriveIt implements Serializable{

    private String nome;
    private Map<String, Veiculo> veiculos;
    private boolean promocao;

    public DriveIt() {
        this.nome = "";
        this.veiculos = new HashMap<>();
        this.promocao = false;
    }


    public DriveIt(String n, Map<String, Veiculo> vs) {
        this.nome = n;
        setVeiculos(vs);
        this.promocao = false;
    }

    public DriveIt(DriveIt vs) {
        this.nome = vs.getNome();
        this.veiculos = vs.getVeiculos2();
        this.promocao = vs.getPromocao();
    }

    public String getNome() {
        return this.nome;
    }

    public Map<String, Veiculo> getVeiculos2() {
        Map<String, Veiculo> aux = new HashMap<>();
        for (Veiculo v : this.veiculos.values())
            aux.put(v.getMatricula(), v.clone());

        return aux;
    }

    public void setVeiculos(Map<String, Veiculo> vs) {
        this.veiculos = new HashMap<>();
        for (Veiculo v : vs.values())
            this.veiculos.put(v.getMatricula(), v.clone());
    }

    public boolean existeVeiculo(String cod) {
        return this.veiculos.containsKey(cod);
    }

    public int quanto() {
        return this.veiculos.size();
    }

    public int quantos(String marca) {
        return (int) this.veiculos.values().stream().
                filter(v -> v.getMarca().equals(marca))
                .count();
    }

    public List<Veiculo> getVeiculos() {
        return this.veiculos.values().stream().
                map(Veiculo::clone).collect(Collectors.toList());

    }

    public void adiciona(Veiculo v) {
        this.veiculos.put(v.getMatricula(), v.clone());
    }

    public boolean getPromocao() {
        return this.promocao;
    }

    public void setPromocao(boolean p) {
        this.promocao = p;
    }


    public List<Veiculo> getVeiculosAsList() {
        return this.veiculos.values().stream().collect(Collectors.toList());
    }

    public Set<Veiculo> ordenarVeiculos(){
        Set<Veiculo> vs = new TreeSet<>();
        for (Veiculo v : this.veiculos.values())
            vs.add(v.clone());
        return  vs;
    }

    public List<Veiculo> ordenarVeiculosAsList(){
        return this.veiculos.values().stream().sorted().map(v ->v.clone()).collect(Collectors.toList());
    }


    public void gravaTXT(String fn) throws IOException {
        PrintWriter p = new PrintWriter(fn);
        p.print(this);
        p.flush();
        p.close();
    }

    public void gravaObj (String f) throws IOException{
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
        o.writeObject(this);
        o.flush();
        o.close();
    }

    public DriveIt lerObj (String f) throws IOException , ClassNotFoundException {
        ObjectInputStream i = new ObjectInputStream(new FileInputStream());
        DriveIt d = (DriveIt) i.readObject();
        i.close();
        return d;
    }
}