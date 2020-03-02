package models;
import view.TelaPagamento;
import view.TelaVenda;
/**
 *
 * @author renata
 */
public class Credito extends Pagamento {
    
    public Credito(String valorTotal, String troco, double limite, String total) {
        super(valorTotal, troco, limite, total);
    }
    public Credito() {
        
    }
    public double parcelaMax() {
        return Double.parseDouble(getLimite())/10.0;
    }
    
    public String toString(double valorParcela) {
        return ""+valorParcela;
    }
    
    public String pagarCredito( int num, double valor) {
        double parcela;
        //double parcelaMax = l/10.0;
        
        if(valor <= Double.parseDouble(getLimite())){
            diminuirLimite(valor);
            parcela = valor/num;
            return toString(parcela);
        }else{
            return "Deu ruim";
        }
    }
    
}
