
package br.ifrn.controller;

import br.ifrn.arq.FileUtil;
import br.ifrn.dominio.ProdutosEletronicos;
import java.io.Serializable;


import java.util.ArrayList;


public class CadastroProduto implements Serializable{
     private  ArrayList<ProdutosEletronicos> lista = new ArrayList<ProdutosEletronicos>();
     
     public void adicionarProdutos(ProdutosEletronicos pro){  
      lista.add(pro);
     }

     public void imprimirProdutos(){
           for (ProdutosEletronicos p : lista) {
           
    p.imprimirInformacoes();
        }
     }
     
     public void removerProduto(String modelo){
            for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getModelo().equals(modelo)) {
                lista.remove(i);
     }
}
     }
public void cadastrar(){
    String caminho = "arquivo.txt";
    
    boolean gravou = FileUtil.gravarObjeto(lista, caminho);
    System.out.println("Gravou");
}
   public void listar(){
       
       lista  = (ArrayList<ProdutosEletronicos>) FileUtil.recuperarObjeto("arquivo.txt");
       for(ProdutosEletronicos p : lista){
       System.out.println(p);
       }
   }
}