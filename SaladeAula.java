/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salajanela;

/**
 *
 * @author senai
 */
public class SaladeAula {

    public static void main(String[] args) {
        Janela janela1 = new Janela();
        janela1.abrir();
        System.out.println(janela1.getSituacao());
        janela1.fechar();
        System.out.println(janela1.getSituacao());
    }
}
