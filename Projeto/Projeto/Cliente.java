import java.util.*;

public class Cliente
{
    private String nome;
    private long nif;
    private String endereco;
    
    public Cliente(){
        this.nome="João";
        this.nif=333123123;
        this.endereco="Rua João Paulo, Porto";       
    }
    public Cliente(String n, long ni, String end){
        this.nome=n;
        this.nif=ni;
        this.endereco=end;
    }
    public Cliente(Cliente c){
        this.nome=c.getNome();
        this.nif=c.getNif();
        this.endereco=c.getEndereco();
    }
    public String getNome(){
        return this.nome;
    }
    public long getNif(){
        return this.nif;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public Cliente clone(){
        return new Cliente(this);
    }
    public boolean equals(Cliente n){
        if(n!=null){
            return this.nome.equals(this.getNome());
        }else{
            return false;
        }
    }
}
