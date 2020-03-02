package models;

public class Dinheiro extends Pagamento{
    public Dinheiro(String valorTotal, String troco, double limite, String total) {
        super(valorTotal, troco, limite, total);
    }
    public Dinheiro(){
        
    }

    public String pagarDinheiro(double valorTotal) {
        if(valorTotal>=Double.parseDouble(getValorTotal())){
            return calcularTroco(valorTotal, Double.parseDouble(getValorTotal()));
        }else{
            return "Valor Insuficiente!!";
        }
        
    }
}
