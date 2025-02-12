package view;

import javax.swing.JOptionPane; 

import Soma.ClasseSoma;
 
public class ClassePrincipal
{
	 public static void main(String[] args)
	 {
         ClasseSoma Soma = new ClasseSoma();//define o nome do método para chamar funções de outros pacotes/imports
         int N2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o número até o qual deseja realizar a soma a partir de 0"));
         int soma = Soma.soma(N2);//chamada da função recursiva "soma" instânciada na classe "ClasseSoma"
         System.out.println("O valor da soma dos números a partir de 0 até "+ N2 + " é: " + soma);
     }
}