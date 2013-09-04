
package br.edu.ifnmg.ltp3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email{
    private int codEmail;
    private String nomeEmail;

    public Email(int codEmail, String nomeEmail) {
        this.codEmail = codEmail;
        this.nomeEmail = nomeEmail;
    }

    public int getIdEmail() {
        return codEmail;
    }

    public void setIdEmail(int codEmail) {
        this.codEmail = codEmail;
    }

    public String getNomeEmail() {
        return nomeEmail;
    }

    public void setNomeEmail(String nomeEmail) {
        Pattern Email = Pattern.compile("[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+");
        Matcher busca = Email.matcher(nomeEmail);
        if(busca.matches()){
            System.out.println("OK!");
            this.nomeEmail = nomeEmail;
        }else{
            System.out.println("ERRO!");
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.codEmail;
        hash = 89 * hash + Objects.hashCode(this.nomeEmail);
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
        final Email other = (Email) obj;
        if (this.codEmail != other.codEmail) {
            return false;
        }
        if (!Objects.equals(this.nomeEmail, other.nomeEmail)) {
            return false;
        }
        return true;
    }
    
    
}
