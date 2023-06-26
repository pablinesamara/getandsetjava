/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salajanela;

/**
 *
 * @author senai
 */
public class Janela {
   private String situacao;
   
   
   public void setSituacao(String situacao){
       this.situacao=situacao;       
   }
   public String getSituacao(){
       return this.situacao;
   }
   public void abrir(){
       setSituacao("Aberta");       
   }
   public void fechar(){
       setSituacao("Fechada");
   }
   
    
}
