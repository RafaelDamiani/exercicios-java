/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String texto = null;
        String textoInvertido = null;

        System.out.println("Entre com um texto: ");
        texto = s.nextLine();
        textoInvertido = new StringBuilder(texto).reverse().toString();

        texto = texto.replace(" ", "");
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        texto = texto.replace("-", "");
        texto = texto.replace("!", "");
        texto = texto.toUpperCase();
        textoInvertido = textoInvertido.replace(" ", "");
        textoInvertido = textoInvertido.replace(",", "");
        textoInvertido = textoInvertido.replace(".", "");
        textoInvertido = textoInvertido.replace("-", "");
        textoInvertido = textoInvertido.replace("!", "");
        textoInvertido = textoInvertido.toUpperCase();

        System.out.println("Texto digitado = " + texto);
        System.out.println("Texto inveritdo = " + textoInvertido);

        if (texto.equals(textoInvertido)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }

}
