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
public abstract class Aluno extends Pessoa{
    private String matricula;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double provaf;
    
    public Aluno(){ }
    
    public Aluno(String matricula, String user, double nota1, double nota2, double nota3, double nota4, double provaf){
        super(user);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.provaf = provaf;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public double getTeste1(){
        return nota1;
    }
    
    public double getTeste2(){
        return nota2;
    }
    
    public double getTeste3(){
        return nota3;
    }
    
    public double getTeste4(){
        return nota4;
    }
    
    public double getSumtestes(){
        return (getTeste1()+getTeste2()+getTeste3()+getTeste4());
    }
    
    public void setTeste1(double nota1){
        this.nota1 = nota1;
    }
    
    public void setTeste2(double nota2){
        this.nota2 = nota2;
    }
    
    public void setTeste3(double nota3){
        this.nota3 = nota3;
    }
    
    public void setTeste4(double nota4){
        this.nota4 = nota4;
    }    
    
    public double getProva(){
        return provaf;
    }
    
    public void setProva(double provaf){
        this.provaf = provaf;
    }
    
    public void SuccessMsg(){
     System.out.println("Aprovado");
    }
    
    public void FailMsg(){
     System.out.println("Reprovado");
    }
        
    public abstract double getMedia();    
        
}
