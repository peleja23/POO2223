import java.util.*;

public class Camiao implements Servico
{
    private String matricula;
    private int cubicagem;
    private ArrayList<Servico> histo;
    
    public Camiao(){
        this.matricula="AA-00-21";
        this.cubicagem=32;
        this.histo=new ArrayList<>();
    }
    public Camiao(String m, int cub){
        this.matricula=m;
        this.cubicagem=cub;
        this.histo = new ArrayList<>();
    }
    public Camiao(Camiao c){
        this.matricula=c.getMatricula();
        this.cubicagem=c.getCubicagem();
        this.histo = c.getHistorico();
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getCubicagem(){
        return this.cubicagem;
    }
    public ArrayList getHistorico(){
        return this.histo;
    }
    public Camiao clone(){
        return new Camiao(this);
    }
    public boolean equals(Camiao n){
        if(n!=null){
            return this.matricula.equals(n.getMatricula());
        }else{
            return false;
        }    
    }
}
