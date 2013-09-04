
package br.edu.ifnmg.ltp3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Produto {
    private int codProduto;
    private String nomeProduto;
    private Double Preco;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String produto) {
        Pattern Produto = Pattern.compile("//w//d{3,50}");
        Matcher busca = Produto.matcher(produto);
        if(busca.matches()){
            System.out.println("OK!");
            this.nomeProduto = produto;
        }else{
            System.out.println("ERRO!");
        }
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
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.codProduto;
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
        if (this.codProduto != other.codProduto) {
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
