
package br.ifrn.dominio;

import java.io.Serializable;


public class Notebook extends ProdutosEletronicos implements Serializable{
    private String processador;
    private int memoria;
    private int armazenamento;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public void imprimirInformacoes() {
         System.out.println();
        System.out.println("__________Informações do notebook___________");
        System.out.println("Nome do produto: "+this.getNome());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Armazenamento: "+this.getArmazenamento());
       System.out.println("Memória: "+this.getMemoria());
       System.out.println("Processador: "+this.getProcessador());
       System.out.println("Preço: "+this.getPreco()+ " R$");
       System.out.println("Quantidade disponível: "+this.getQuantida()+" disponíveis");
        System.out.println("Cidade disponível: "+this.getCidade().getCidade());
        System.out.println("Estado: "+this.getCidade().getEstado());
        
        System.out.println("Cadastrado!");
        System.out.println();
    }
    
}

