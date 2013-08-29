/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.ltp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Venda {
    private int idVenda;
    private Double valorTotalVenda;
    private ItemVenda qtdVenda;
    private Pessoa idPessoa;
    private List<Produto> produtos;
    //construtor
    public Venda(int idVenda, Double valorTotalVenda, Produto idProduto, ItemVenda qtdVenda, Pessoa idPessoa) {
        this.idVenda = idVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.qtdVenda = qtdVenda;
        this.idPessoa = idPessoa;
        produtos = new ArrayList<Produto>();
    }
    //metodos
    public void addProduto(Produto produto){
        if(!produtos.contains(produto)){
            produtos.add(produto);
        }
    }
    
    
    
    public void removeProduto(Produto produto){
        if(produtos.contains(produto)){
            produtos.remove(produto);
        }
    }
    
    
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(Double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public ItemVenda getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(ItemVenda qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idVenda;
        hash = 37 * hash + Objects.hashCode(this.valorTotalVenda);
        hash = 37 * hash + Objects.hashCode(this.qtdVenda);
        hash = 37 * hash + Objects.hashCode(this.idPessoa);
        hash = 37 * hash + Objects.hashCode(this.produtos);
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
        final Venda other = (Venda) obj;
        if (this.idVenda != other.idVenda) {
            return false;
        }
        if (!Objects.equals(this.valorTotalVenda, other.valorTotalVenda)) {
            return false;
        }
        if (!Objects.equals(this.qtdVenda, other.qtdVenda)) {
            return false;
        }
        if (!Objects.equals(this.idPessoa, other.idPessoa)) {
            return false;
        }
        if (!Objects.equals(this.produtos, other.produtos)) {
            return false;
        }
        return true;
    }

    
    

}
