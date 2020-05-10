/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ufpr.tads;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class SistemaPedidos {
    private static Scanner scan = new Scanner(System.in);
        
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
                
        int opcaoMenu;
        do {
            int a = 5;
            System.out.println("a: " + a);
            int b = a;
            System.out.println("b: " + b);
            a = 6;
            System.out.println("af: " + a);
            System.out.println("bf: " + b);
            
                    
            System.out.println("1 – Incluir Pedido");
            System.out.println("2 – Excluir pedido por nome do cliente");
            System.out.println("3 – Listar Pedidos");
            System.out.println("4 – Incluir Item de Pedido em Pedido");
            System.out.println("5 – Excluir Item de Pedido em Pedido");
            System.out.println("6 – Imprimir a lista de Pedidos");
            
            opcaoMenu = scan.nextInt();
            String nomeProduto;
            double precoProduto;
            int quantidadeProduto;           
            String nomeCliente;
            
            switch (opcaoMenu){
            case 1:
                System.out.println("Digite o valor total permitido para o pedido: ");
                double valorTotalPermitido = scan.nextDouble();
                System.out.println("Digite o nome do cliente");
                nomeCliente = scan.next();
                pedido = new Pedido(valorTotalPermitido, nomeCliente);
                
                break;
            case 2:
                System.out.println("Digite o nome do cliente: ");
                nomeCliente = scan.next();
                
                pedido.excluiPedidoByNomeCliente(nomeCliente, pedido);
                
                break;
            case 3:
            case 6:
                System.out.println(pedido.toString());
                
                break;
            case 4:
                if (pedido.getCliente() == null) {
                    System.out.println("Não há pedido cadastrado");
                    
                    break;
                }
                
                System.out.println("Digite o nome do produto: ");
                nomeProduto = scan.next();
                System.out.println("Digite o preco do produto: ");
                precoProduto = scan.nextDouble();
                System.out.println("Digite o a quantidade: ");
                quantidadeProduto = scan.nextInt();
                
                ItemDePedido item = new ItemDePedido(nomeProduto, precoProduto, quantidadeProduto);
                
                item.setNome(nomeProduto);
                item.setPreco(precoProduto);
                item.setQuantidade(quantidadeProduto);
                
                pedido.acrescentaItem(item);
                
                break;
            case 5:
                System.out.println("Digite o nome do produto: ");
                nomeProduto = scan.next();
                
                pedido.retiraItem(nomeProduto);
                
                break;
            default:
                System.out.println("Comando nao reconhecido. Encerrando...");
                break;
            }
        } while (opcaoMenu > 0 && opcaoMenu < 7);
    }
}
