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
public class Email{
    private int idEmail;
    private String nomeEmail;

    
    public void setcadastra(int idEmail, String nomeEmail) {
        this.idEmail = idEmail;
        this.nomeEmail = nomeEmail;
    }
    

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idEmail;
        hash = 17 * hash + Objects.hashCode(this.nomeEmail);
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
        if (this.idEmail != other.idEmail) {
            return false;
        }
        if (!Objects.equals(this.nomeEmail, other.nomeEmail)) {
            return false;
        }
        return true;
    }
}
