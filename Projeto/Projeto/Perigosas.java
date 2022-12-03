
/**
 * Write a description of class Perigosas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Perigosas extends Cargas implements Servico
{
    private static final int ref=15;
    public Perigosas(int c, double p, int cub, double pre,double con){
    super(c,p,cub,pre,con);
    }
    public double getConsumo(){
        return 3*(ref/this.getPeso());
    }
    public Perigosas clone(){
        return new Perigosas(super.getCodigo(),super.getPeso(),super.getCubicagem(),super.getPreco(),super.getConsumo());
    } 
}
