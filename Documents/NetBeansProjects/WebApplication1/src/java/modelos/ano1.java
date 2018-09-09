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
public abstract class ano1 extends Aluno {
    
    public ano1(){ }
    
    public ano1(String matricula, String user, double nota1, double nota2, double nota3, double nota4, double provaf){
        super(matricula, user, nota1, nota2, nota3, nota4, provaf);
    }
     
    public double getMedia()  {
        return (getSumtestes()/4);
    }
    
    public void provaff(){
      
        if (getMedia() > 6){
            SuccessMsg();   
        }
        else{
            FailMsg();         
        }
      
    }
    
    
}
