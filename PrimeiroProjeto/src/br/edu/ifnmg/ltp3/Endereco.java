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
public class Endereco{
    private int idEndereco;
    private String rua;
    private String bairro;
    private String cidade;
    private int numero;
    //Construtor
    public Endereco(int idEndereco, String rua, String bairro, String cidade, int numero) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }
    //Metodos
    public int getIdEndereco(){
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idEndereco;
        hash = 71 * hash + Objects.hashCode(this.rua);
        hash = 71 * hash + Objects.hashCode(this.bairro);
        hash = 71 * hash + Objects.hashCode(this.cidade);
        hash = 71 * hash + this.numero;
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
        final Endereco other = (Endereco) obj;
        if (this.idEndereco != other.idEndereco) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
   
 }
    

