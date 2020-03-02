package view;

import helper.ControleDeArquivo;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Produto;



/**
 *
 * @author tawany
 */
public class AlteraProduto extends javax.swing.JFrame {
    
    private static final String ARQUIVO_PRODUTO = "data/produtos.sav";
    
    ArrayList<Produto> produtos = new ArrayList<>();
        
    
    /**
     * Creates new form AlteraProduto
     */
    public AlteraProduto() {
        initComponents();
    }
    
    public void Alterar(Produto p){
        //novoProduto = new Produto (jTextFieldACodigo.getText(),jTextFieldANome.getText(), jTextFieldAQtd.getText(),jTextFieldAPreco.getText());
        //posicao = produtoss.indexOf(p);
        
        
        /*Produto set = produtos.set(posicao, novoProduto);*/
        /*p.setNome(jTextFieldANome.getText());
        p.setCodigo(jTextFieldACodigo.getText());
        p.setPreco(jTextFieldAPreco.getText());
        p.setQuantidade(jTextFieldAQtd.getText()); * /
        /*jTextFieldANome.setText(p.getNome().toUpperCase());
        jTextFieldACodigo.setText(Integer.toString(p.getCodigo()));
        jTextFieldAQtd.setText(Integer.toString(p.getQuantidade()));
        jTextFieldAPreco.setText((Double.toString(p.getPreco())));
         */
        
    }
