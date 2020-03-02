package helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*

 * @author tawany
 */
public class Arquivo {
    
    public static String Read(String caminho){
        String conteudo = "";
        try{
            FileReader arquivo = new FileReader(caminho);
            BufferedReader lerArquivo  = new BufferedReader(arquivo);
            String linha = "";
            try{
                linha = lerArquivo.readLine();
                while(linha != null){
                    conteudo += linha;
                    linha = lerArquivo.readLine();
                }
                arquivo.close();
            } catch (IOException e){
                conteudo = "erro nao foi possivel ler ";
                System.out.println("erro nao salvou");
            }
        }catch (FileNotFoundException e){
            conteudo = "erro  nao encontrado";
            System.out.println("erro nao encontrado");
        }
        if(conteudo.contains("erro"))
            return "erro";
        else 
    return conteudo;
    }
    
    public static boolean White(String caminho, String texto){
      try{
          FileWriter arquivo = new FileWriter(caminho);
          PrintWriter gravarArquivo = new PrintWriter(arquivo);
          gravarArquivo.println(texto);
          gravarArquivo.close();
          return true;
      }catch (IOException e){
          System.out.println(e.getMessage());
          return false;
      }  
    }

    public static boolean White(String caminho, ArrayList<Object> objects) {
        try{
          FileWriter arquivo = new FileWriter(caminho);
          PrintWriter gravarArquivo = new PrintWriter(arquivo);
          gravarArquivo.println(""+objects);
          gravarArquivo.close();
          return true;
      }catch (IOException e){
          System.out.println(e.getMessage());
          return false;
      }  
    }
    
}
