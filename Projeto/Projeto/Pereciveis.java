
/**
 * Write a description of class Perecíveis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pereciveis extends Cargas implements Servico
{
    private static final int kms=33; //temporario
    public Pereciveis(int c, double p, int cub, double pre,double con){
    super(c,p,cub,pre,con);
    }
    public double getConsumo(){
        return this.getPeso()*kms;
    }
    public Pereciveis clone(){
        return new Pereciveis(super.getCodigo(),super.getPeso(),super.getCubicagem(),super.getPreco(),super.getConsumo());
    } 
}
