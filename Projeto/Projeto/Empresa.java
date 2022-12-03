import java.util.*;
/**
 * Write a description of class Empresa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empresa
{
    private String nome;
    private HashMap<Servico,Cliente> lista;
    private ArrayList<Camiao> listacam;
    private ArrayList<Cliente> listacli;
    public Empresa(){
        this.nome="GrandeEmpresa";
        this.lista=new HashMap<Servico,Cliente>();
        this.listacam= new ArrayList<Camiao>();
        this.listacli= new ArrayList<Cliente>();
    }
    public int qtdcamioes(){
        return this.listacam.size();
    }
    public int qtdservicos(){
        return this.lista.size();
    }
    public void adicionarcli(Cliente c){
        this.listacli.add(c.clone());
    }
    public void adicionarcami(Camiao c){
        this.listacam.add(c.clone());
    }
}
