package org.ufpr.tads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Pedido {
    private String nomeCliente;
    private List<ItemDePedido> ItensDePedido;
    private double valorTotalPermitido;
    
    public Pedido(double valorTotalPermitido, String nomeCliente) {
        this.valorTotalPermitido = valorTotalPermitido;
        this.nomeCliente = nomeCliente;
    }

    public Pedido() {
    }
    
    public String getCliente() {
        return nomeCliente;
    }
    
    public List<ItemDePedido> getItens() {
        return ItensDePedido;
    }
    
    public void excluiPedidoByNomeCliente(String nomeCliente, Pedido pedido) {
        if (nomeCliente.equals(this.nomeCliente)) {
            pedido = null;
            System.out.println("Pedido excluído!");
        } else {
            System.out.println("Não existe Pedido para esse cliente");
        }
    }
    
    public void acrescentaItem(ItemDePedido Item) {
        if (Item == null) {
            throw new RuntimeException("Item de pedido não pode ser nulo.");
        }
        if (Item.preco > this.valorTotalPermitido) {
            throw new RuntimeException("Item de Pedido não incluído. Valor do pedido excedido.");
        }
        if (this.valorTotalPermitido == 0) {
            throw new RuntimeException("Cliente não tem nenhum crédito.");
        }  
        if (this.ItensDePedido != null) {
            for (ItemDePedido itemLista : this.ItensDePedido) {
                if (itemLista.getNome().equals(Item.nome)) {
                    itemLista.quantidade += Item.quantidade;
                    return;
                }
            }
            this.ItensDePedido.add(Item);
        }
        else {
            this.ItensDePedido = new ArrayList<>();
            this.ItensDePedido.add(Item);
        }
    }
    
    public void retiraItem(String nome) {
        for (ItemDePedido itemLista : this.ItensDePedido) {
            if (itemLista.getNome().equals(nome)) {
                this.ItensDePedido.remove(itemLista);
                return;
            }
        }
        throw new RuntimeException("Item não encontrado no pedido.");
    }
    
    public double getTotal() {
        double totalPedido = 0;
        if (this.ItensDePedido != null) {
            for (ItemDePedido itemLista : this.ItensDePedido) {
                totalPedido += itemLista.getPreco() * itemLista.getQuantidade();
            }
        }
        
        return totalPedido;
    }
    
    public String toString() {
        String output = "----------------------------------\n"
                + "Nome do cliente: " + this.getCliente() + "\n"
                + "Total do Pedido: " + this.getTotal() + "\n";
        if (this.getItens() != null && this.getItens().size() != 0) {
            output += "Item                     |Preco \n";
            for (ItemDePedido item : this.getItens()) {                                   
                output += item.getNome();
                for (int i = 0; i < (25 - item.getNome().length()); i++)
                    output += " ";
                       
                output += "|R$" + item.getPreco() + "\n";
            }
        }
        
    return output;
    }
}
