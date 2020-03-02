package helper;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tawany
 */
public class ControleDeArquivo {
    private final File file;
    private final ArrayList<Object> objects;
       
    public ControleDeArquivo(File file){
        this.file = file;
        objects = new ArrayList<>();
    }
    
    public ArrayList<Object> ler() {
        
        try{
            
            //FileInputStream f = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
          
            boolean read = true;
            while(read == true){
                Object o = in.readObject();
                if(o != null)
                    objects.add(o);
                else
                    read = false;                 
            }
            
        }catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (EOFException e) {
            System.out.println("Fim de carregamento!");
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ControleDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return objects;
    }
    
    public boolean salvar(ArrayList<Object> objects){
    
        try {
            
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(f);
            
            for(Object p: objects){
                os.writeObject(p);
            }
            
            os.close();
            f.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException ex) {
            Logger.getLogger(ControleDeArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return true;
    }
    
}
