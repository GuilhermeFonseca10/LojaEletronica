
package br.ifrn.dominio;

import java.io.Serializable;

public abstract class ProdutosEletronicos implements Serializable{
    private String nome;
    private String marca;
    private String modelo;
    private double preco;
    private int quantida;
   private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantida() {
        return quantida;
    }

    public void setQuantida(int quantida) {
        this.quantida = quantida;
    }
    public abstract void imprimirInformacoes();
    
}
