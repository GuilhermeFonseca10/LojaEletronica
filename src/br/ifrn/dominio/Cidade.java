
package br.ifrn.dominio;

import java.io.Serializable;


public class Cidade implements Serializable{
   private String cidade;
   private String estado;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
   
    
}
