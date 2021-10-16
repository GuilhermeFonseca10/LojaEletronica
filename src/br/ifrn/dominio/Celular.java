
package br.ifrn.dominio;

import java.io.Serializable;

public class Celular extends ProdutosEletronicos implements Serializable{
    private String armazenamento;
    private String duracaobtr;

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getDuracaobtr() {
        return duracaobtr;
    }

    public void setDuracaobtr(String duracaobtr) {
        this.duracaobtr = duracaobtr;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println();
        System.out.println("__________Informações do celular___________");
        System.out.println("Nome do produto: "+this.getNome());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Armazenamento: "+this.getArmazenamento());
        System.out.println("Duração da bateria: "+this.getDuracaobtr());
        System.out.println("Preço: "+this.getPreco()+" R$");
        System.out.println("Quantidade disponível: "+this.getQuantida()+" disponíveis.");
        System.out.println("Cidade disponível: "+this.getCidade().getCidade()+"/"+this.getCidade().getEstado());
    
        
        System.out.println("Cadastrado!");
        System.out.println();
    }
    
}
