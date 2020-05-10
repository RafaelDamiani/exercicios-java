package org.ufpr.tads;

/**
 *
 * @author rafae
 */
public class ItemDePedido {
    public String nome;
    public double preco;
    public int quantidade;

    public ItemDePedido(String nome, double preco, int quantidade) {
        if (preco < 0) {
            throw new RuntimeException("Preco é menor que 0. Por favor, insira um preco maior ou igual a 0");
        }
        if (nome == null || nome == "") {
            throw new RuntimeException("A descricao e obrigatoria");
        }
        if (quantidade <= 0) {
            throw new RuntimeException("Quantidade é menor ou igual a 0. Por favor, insira uma quantidade maior que 0.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
