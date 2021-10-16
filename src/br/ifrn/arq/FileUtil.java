
package br.ifrn.arq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FileUtil {
    

    public static boolean gravarObjeto(Object obj, String caminho){
        File arquivo = new File(caminho);
        if(! arquivo.exists()){
            try{
            arquivo.createNewFile();
            }catch(Exception erro){
                erro.printStackTrace();
                return false;
            }
        }
        try{
        FileOutputStream fileOutput = new FileOutputStream(arquivo);
        ObjectOutputStream o = new ObjectOutputStream(fileOutput);
        o.writeObject(obj);
        o.flush();
        fileOutput.flush();
        
        o.close();
        fileOutput.close();        
        return true;
        
        }catch(Exception erro){
            erro.printStackTrace();
            return false;
        }     
    }
    public static Object recuperarObjeto(String caminho){
        File arquivo = new File(caminho);
        try{
        FileInputStream fileInput = new FileInputStream(arquivo);
        ObjectInputStream objInput = new ObjectInputStream(fileInput);
        
        Object retorno = objInput.readObject();
        
        objInput.close();
        fileInput.close();
        
        return retorno;
        
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }       
      
    }
}

