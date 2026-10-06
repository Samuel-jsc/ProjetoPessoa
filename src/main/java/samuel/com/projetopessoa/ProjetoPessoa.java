/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package samuel.com.projetopessoa;

/**
 *
 * @author Samuel
 */
public class ProjetoPessoa {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa ();
        Aluno p2 = new Aluno();
        Funcionario p4 = new Funcionario ();
        Professor p3 = new Professor ();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informatica");
        p3.setSalario((int) 2500.75);
        p4.setSetor("Estoque");
        
        p3.receberAumento(550.20f);
        p4.mudarTrabalho();
        p2.cancelarMatricula();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
