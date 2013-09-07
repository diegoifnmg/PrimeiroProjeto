
package br.edu.ifnmg.ltp3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Endereco{
    private int codEndereco;
    private String rua;
    private String bairro;
    private String cidade;
    private int numero;
    //Construtor
    public Endereco(int codEndereco, String rua, String bairro, String cidade, int numero) {
        this.codEndereco = codEndereco;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }
    //Metodos
    public int getCodEndereco(){
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        Pattern Rua = Pattern.compile("//w{1,50}");
        Matcher busca = Rua.matcher(rua);
        if(busca.matches()){
            System.out.println("OK!");
            this.rua = rua;
        }else{
            System.out.println("ERRO!");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        Pattern Bairro = Pattern.compile("//w{1,50}");
        Matcher busca = Bairro.matcher(bairro);
        if(busca.matches()){
            System.out.println("OK!");
            this.bairro = bairro;
        }else{
            System.out.println("ERRO!");
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        Pattern Cidade = Pattern.compile("//w{1,50}");
        Matcher busca = Cidade.matcher(cidade);
        if(busca.matches()){
            System.out.println("OK!");
            this.cidade = cidade;
        }else{
            System.err.println("ERRO!");
        }
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
        hash = 71 * hash + this.codEndereco;
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
        if (this.codEndereco != other.codEndereco) {
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
    

