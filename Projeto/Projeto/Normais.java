
/**
 * Write a description of class Normais here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Normais extends Cargas implements Servico
{
    private static final double fixo= 50.5;
    public Normais(int c, double p, int cub, double pre,double con){
    super(c,p,cub,pre,con);
    }
    public double getConsumo(){
        return fixo;
    }
    public Normais clone(){
        return new Normais(super.getCodigo(),super.getPeso(),super.getCubicagem(),super.getPreco(),super.getConsumo());
    } 
}
