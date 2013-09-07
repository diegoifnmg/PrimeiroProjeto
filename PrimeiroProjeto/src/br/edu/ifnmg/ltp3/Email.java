
package br.edu.ifnmg.ltp3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email{
    //private int codEmail;
    private String email;

    public Email(int codEmail, String email) {
        //this.codEmail = codEmail;
        this.email = email;
    }
    /*
    public int getCodEmail() {
        return codEmail;
    }

    public void setCodEmail(int codEmail) {
        this.codEmail = codEmail;
    }
    */
    public String getNomeEmail() {
        return email;
    }

    public void setNomeEmail(String email) {
        Pattern Email = Pattern.compile("[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+");
        Matcher busca = Email.matcher(email);
        if(busca.matches()){
            System.out.println("OK!");
            this.email = email;
        }else{
            System.out.println("ERRO!");
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Email other = (Email) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.email);
        return hash;
    }

    
    
    
}
