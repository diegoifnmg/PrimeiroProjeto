/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.ltp3;

import java.util.Date;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Diego
 */
public class Venda {
    private int codigo;
    private Pessoa cliente;
    private Double valorTotal;
    private String data;
    private List<ItemVenda> itens;

    public Venda() {
    
    }

    public Venda(int codigo, Pessoa cliente, Double valorTotal, String data) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.data = data;
        itens = new ArrayList<ItemVenda>();
    }
   
    public void addItens(ItemVenda item){
        if(!itens.contains(item)){
            itens.add(item);
            valorTotal += item.getProduto().getPreco() * item.getQtd();
        }
    }
    public void removeItens(ItemVenda item){
        if(itens.contains(item)){
            itens.remove(item);
            valorTotal -= item.getProduto().getPreco() * item.getQtd();
        }
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        Pattern Data = Pattern.compile("\\d{1,31}\\/\\d{1,12}\\/\\d{0,}");
        Matcher verifica = Data.matcher(data);
        
        if(verifica.matches())
              this.data = data;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.cliente);
        hash = 29 * hash + Objects.hashCode(this.valorTotal);
        hash = 29 * hash + Objects.hashCode(this.data);
        hash = 29 * hash + Objects.hashCode(this.itens);
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
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.valorTotal, other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.itens, other.itens)) {
            return false;
        }
        return true;
    }
    
    
    
}
