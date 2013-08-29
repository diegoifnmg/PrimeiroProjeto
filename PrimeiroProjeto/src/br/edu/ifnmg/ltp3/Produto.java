/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.ltp3;

import java.util.Objects;

/**
 *
 * @author Diego
 */
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private Double Preco;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        if(Preco <= 0){
            System.out.println("Erro Preço <= 0");
        }else{
            this.Preco = Preco;
        }
        
    }
    public void cadastraProduto(String nome, Double Preco) {
        setNomeProduto(nome);
        setPreco(Preco);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.idProduto;
        hash = 11 * hash + Objects.hashCode(this.nomeProduto);
        hash = 11 * hash + Objects.hashCode(this.Preco);
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
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        if (!Objects.equals(this.nomeProduto, other.nomeProduto)) {
            return false;
        }
        if (!Objects.equals(this.Preco, other.Preco)) {
            return false;
        }
        return true;
    }
    
    
    
}
