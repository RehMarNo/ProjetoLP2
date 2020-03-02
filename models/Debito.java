package models;

public class Debito extends Pagamento{
    
    public Debito(String valorTotal, String troco, double limite, String total) {
        super(valorTotal, troco, limite, total);
    }
    public Debito(){
        
    }
    public void pagarDebito(){
        if(isLimite()){
            diminuirLimite(Double.parseDouble(calcularTotal()));
        }else {
            setInsuficiente();
        }
    }
    public String toString() {
        return String.valueOf(getLimite());
    }
}
