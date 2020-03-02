package models;

import java.io.Serializable;

/**
 *
 * @author tawany
 */
public class Produto implements Serializable {
    
   private static final long serialVersionUID = 1L;
   private int codigo;
   private String nome;
   private int quantidade;
   private double preco;

    public Produto(String codigo, String nome, String quantidade, String preco) {
        this.codigo = Integer.parseInt(codigo);
        this.nome = nome;
        this.quantidade = Integer.parseInt(quantidade);
        this.preco = Double.parseDouble(preco);
    }

  //  public Produto(int codigo, String nome, int quantidade, double preco) {
       // this.codigo = codigo;
        //this.nome = nome;
        //this.quantidade = quantidade;
      //  this.preco = preco;
    //}
    
    public Produto(){
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
