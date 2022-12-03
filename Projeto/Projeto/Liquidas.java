
/**
 * Write a description of class Liquidas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Liquidas extends Cargas implements Servico

{
    private static final double ref=10.5;
    public Liquidas(int c, double p, int cub, double pre, double con){
    super(c,p,cub,pre,con);
    }
    public double getConsumo(){
        return ref*this.getCubicagem();
    }
    public Liquidas clone(){
        return new Liquidas(super.getCodigo(),super.getPeso(),super.getCubicagem(),super.getPreco(),super.getConsumo());
    } 
}
