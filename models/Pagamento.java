package models;

public class Pagamento {
    protected double valorTotal;
    protected double total;
    protected double troco;
    protected Produto p;
    protected double limite;
    protected boolean verificarLimite;
   
    public Pagamento(String valorTotal, String troco, double limite, String total){
        this.valorTotal = Double.parseDouble(valorTotal);
        this.troco = Double.parseDouble(troco);
        this.total = Double.parseDouble(total);
        this.limite = 2000.00;
        this.verificarLimite = true;
    } 

    public Pagamento() {
    
    }
    
    public boolean isLimite() {
        return verificarLimite;
    }
    
    public void diminuirLimite(double valor){
        this.limite = this.limite - valor;
        
    }
    public String setInsuficiente(){
        verificarLimite = false;
        return "Limite insuficiente!!";
    }
    
    public String calcularTotal(){
        valorTotal = p.getPreco()*p.getQuantidade();
        return String.valueOf(valorTotal);
    }
    
    public String calcularTroco(double valorTotal, double pagamento){
        return String.valueOf(valorTotal-pagamento);
    }

    public String getValorTotal() {
        return String.valueOf(valorTotal);
    }

    public double getTroco() {
        return troco;
    }
    public String getLimite(){
        return String.valueOf(this.limite);
    }
    public double getTotal(){
        return total;
    }
    public void setTotal( double total){
        this.total = total;
    }
}
