/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Keb Kab
 */
public abstract class Pessoa {
    
    private String user;
    
    public Pessoa(){
    }
    
    public Pessoa(String user){
        this.user = user;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    
}
