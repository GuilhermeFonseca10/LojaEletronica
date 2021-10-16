
package br.ifrn.teste;

import br.ifrn.controller.CadastroProduto;
import br.ifrn.dominio.Celular;
import br.ifrn.dominio.Cidade;
import br.ifrn.dominio.Notebook;
import br.ifrn.dominio.Tv;

import java.util.Scanner;


public class Teste {
  
      public static void menu(){
          
               System.out.println("____________________________________MENU________________________________________");
           System.out.println();
           System.out.println("Escolha uma opção a baixo!");
 
           System.out.println();
           System.out.println("Digite 1 adicionar celulares na loja!");
           System.out.println("Digite 2 para adicionar notebooks na loja");
           System.out.println("Digite 3 para adicionar Tvs");
           System.out.println("Digite 4 para visualizar produtos disponíveis!");
           System.out.println("Digite 5 para remover do estoque!");
                System.out.println("Digite 6 para gerar arquivo!");
                System.out.println("Digite 7 para recuperar arquivo!");
                System.out.println("________________________________________________________________________________");
               
          
      }
      
      
    
      public static void main(String[] args) {
          
             
                  CadastroProduto pro = new CadastroProduto();
               Cidade c = new Cidade();
                Scanner ca = new Scanner(System.in);
  
                   
                      int resposta = 1;     
     while(resposta==1){
     int opcao=0;
     menu();
     Scanner ler = new Scanner(System.in);
     opcao = ler.nextInt();
        switch(opcao){
            case 1:              
                
                
                    System.out.println("_________________________________________");
                    System.out.println();
                    System.out.println("--------Cadastrando celulares--------");
                 
                    Celular c1 = new Celular();
               try{
                    System.out.println("Digite o nome do produto:");
                    c1.setNome(ca.nextLine());
                    System.out.println("Digite a marca:");
                    c1.setMarca(ca.nextLine());
                    System.out.println("Digite o modelo:");
                    c1.setModelo(ca.nextLine());
                      System.out.println("Digite a duação da bateria:");
                    c1.setDuracaobtr(ca.nextLine());
                      System.out.println("Digite a capacidade de armazenamento:");
                    c1.setArmazenamento(ca.nextLine());
                      System.out.println("Digite a cidade em que estão disponíveis:");
                    c.setCidade(ca.nextLine());
                    System.out.println("Digite o estado:");
                    c.setEstado(ca.nextLine());
                      System.out.println("Digite o valor de venda:");
                    c1.setPreco(ca.nextDouble());
                      System.out.println("Digite a quantidade disponível:");
                    c1.setQuantida(ca.nextInt());  
             
                    c1.setCidade(c);
                     System.out.println("_________________________________________");
                    pro.adicionarProdutos(c1);
                   
               }catch(Exception erro ){
                   System.out.println("Ocorreu um erro no cadastro: "+erro);
               }
                
        break;
            case 2:

     System.out.println("_________________________________________");
                    System.out.println();
                         System.out.println("--------Cadastrando notebooks--------");
                         Notebook n = new Notebook();
                         try{
                         System.out.println("Digite o nome do produto:");
                         n.setNome(ca.nextLine());
                         System.out.println("Digite a marca:");
                         n.setMarca(ca.nextLine());
                         System.out.println("Diigite o modelo");
                         n.setModelo(ca.nextLine());                     
                         System.out.println("Digite o processador:");
                         n.setProcessador(ca.nextLine());
                         System.out.println("Digite a cidade em que estão disponíveis:");
                      c.setCidade(ca.nextLine());
                      System.out.println("Digite o estado:");
                      c.setEstado(ca.nextLine());
                        System.out.println("Digite a capacidade de armazenamento:");
                         n.setArmazenamento(ca.nextInt());
                         System.out.println("Digite a memória:");
                         n.setMemoria(ca.nextInt());
                         System.out.println("Diigite o valor de venda:");
                         n.setPreco(ca.nextDouble());
                        System.out.println("Digite a quantidade disponível:");
                         n.setQuantida(ca.nextInt());
                      
                         n.setCidade(c);
                           System.out.println("_________________________________________");
                         pro.adicionarProdutos(n);
                        
                         }catch(Exception erro){
                             System.out.println("Ocorreu um erro no cadastro: "+erro);                         }
           break;
            case 3:
      
             System.out.println("_________________________________________");
                    System.out.println();
                         System.out.println("--------Cadastrando Tvs--------");
                         Tv t = new Tv();
                         try{
                              System.out.println("Digite o nome do produto:");
                         t.setNome(ca.nextLine());
                         System.out.println("Difite a marca:");
                         t.setMarca(ca.nextLine());
                         System.out.println("Digite o modelo");
                         t.setModelo(ca.nextLine());                       
                            System.out.println("Digite a cidade em que estão disponíveis:");
                    c.setCidade(ca.nextLine());
                    System.out.println("Digite o estado:");
                    c.setEstado(ca.nextLine());
                      System.out.println("Digite as polegadas:");
                         t.setQtdpolegadas(ca.nextInt());
                         System.out.println("Diigite o valor de venda:");
                         t.setPreco(ca.nextDouble());
                        System.out.println("Digite a quantidade disponível:");
                         t.setQuantida(ca.nextInt());
                   
                              
                         t.setCidade(c);
                        System.out.println("_________________________________________");
                         pro.adicionarProdutos(t);
                         }catch(Exception erro){
                             System.out.println("Ocorreu um erro no cadastro: "+erro);
                         }
                        
                 break;
            case 4:
             pro.imprimirProdutos();
                 break;
            case 5:
                    Scanner nome = new Scanner(System.in);
                    System.out.println("Digite o modelo do aparelho que você deseja remover da lista: ");
                    String  m =  nome.nextLine();
                break;
            case 6:
          pro.cadastrar();
              break;
            case 7: 
                pro.listar();
                break;
         default:
                System.out.println("Opção inválida!");  
                break;
        }
      System.out.println();
        System.out.println("Deseja realizar outra operação? [1]Sim [2]Não");
        resposta = ler.nextInt();
        if(resposta !=1){
            System.out.println("Finalizado");
        }
    }
 
    }
     
    }

 





    
  
     

       
           
         

                 

                 