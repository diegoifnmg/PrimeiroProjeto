
package br.edu.ifnmg.ltp3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ItemVenda {
    private Produto produto;
    private int qtd;

    public ItemVenda(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }
    
    public double getValorTotalItem()
    {
        double total = getQtd() * produto.getPreco();
        return total;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.produto);
        hash = 37 * hash + this.qtd;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemVenda other = (ItemVenda) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (this.qtd != other.qtd) {
            return false;
        }
        return true;
    }

    
    
   
}
