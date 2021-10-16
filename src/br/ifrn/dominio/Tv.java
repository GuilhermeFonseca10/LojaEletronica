
package br.ifrn.dominio;

import java.io.Serializable;


public class Tv extends ProdutosEletronicos implements Serializable{
    private int qtdpolegadas;

    public int getQtdpolegadas() {
        return qtdpolegadas;
    }

    public void setQtdpolegadas(int qtdpolegadas) {
        this.qtdpolegadas = qtdpolegadas;
    }

    @Override
    public void imprimirInformacoes() {
          System.out.println();
        System.out.println("__________Informações da Tv___________");
        System.out.println("Nome do produto: "+this.getNome());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Polegadas: "+this.getQtdpolegadas()+" polegadas.");
        System.out.println("Preço: "+this.getPreco()+" R$");
        System.out.println("Quantidade disponível: "+this.getQuantida()+" disponíveis");
        System.out.println("Cidade disponível: "+this.getCidade().getCidade());
        System.out.println("Estado: "+this.getCidade().getEstado());
        
        System.out.println("Cadastrado!");
        System.out.println();
    }
    
}
