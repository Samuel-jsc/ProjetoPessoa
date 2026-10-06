/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuel.com.projetopessoa;

/**
 *
 * @author Samuel
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum){
        this.salario += aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return (int) salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
