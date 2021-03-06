
package br.edu.ifnmg.ltp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Pessoa{
    private int codPessoa;
    private String nomePessoa;
    private List<Email> emails;
    private List<Endereco> enderecos;
    //construtor
    public Pessoa(int idPessoa, String nomePessoa) {
        this.codPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        emails = new ArrayList<Email>();
        enderecos = new ArrayList<Endereco>();
    }
    //metodos
    public List<Email> getEmails(){
        return emails;
    }
    public void addEmail(Email email){
        if(!emails.contains(email)){
            emails.add(email);
        }
    }
    public void removeEmail(Email email){
        if(emails.contains(email)){
            emails.remove(email);
        }
    }
    
    public void addEndereco(Endereco endereco){
        if(!enderecos.contains(endereco)){
            enderecos.add(endereco);
        }
    }
    
    public void removeEndereco(Endereco endereco){
        if(enderecos.contains(endereco)){
            enderecos.remove(endereco);
        }
    }
    
    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codPessoa;
        hash = 71 * hash + Objects.hashCode(this.nomePessoa);
        hash = 71 * hash + Objects.hashCode(this.emails);
        hash = 71 * hash + Objects.hashCode(this.enderecos);
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
        final Pessoa other = (Pessoa) obj;
        if (this.codPessoa != other.codPessoa) {
            return false;
        }
        if (!Objects.equals(this.nomePessoa, other.nomePessoa)) {
            return false;
        }
        if (!Objects.equals(this.emails, other.emails)) {
            return false;
        }
        if (!Objects.equals(this.enderecos, other.enderecos)) {
            return false;
        }
        return true;
    }

    
    
}
