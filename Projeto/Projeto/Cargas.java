
/**
 * Write a description of class Cargas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Cargas
{   
    private int codigo;
    private double peso;
    private int cubicagem;
    private double preco;
    private double consumo;
    
    public Cargas(int c, double p, int cub, double pre, double con){
       this.codigo=c;
       this.peso=p;
       this.cubicagem=cub;
       this.preco=pre;
       this.consumo=con;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public double getPeso(){
        return this.peso;
    }
    public int getCubicagem(){
        return this.cubicagem;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getConsumo(){
        return this.consumo;
    }
    public abstract Cargas clone();
    
    public boolean equals(Cargas n){
        if(n!=null){
            return this.codigo==n.getCodigo();
        }else{
            return false;
        }
    }
}
