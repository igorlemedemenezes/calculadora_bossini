import javax.swing.*;

public class Calculadora{
   public static void main(String[] args){
   int  a;
   int b;
   int resp;
   String respUsuario = null;
   
   respUsuario = JOptionPane.showInputDialog("Digite + - / *");
   
    
      if(respUsuario.equals("+")){
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
         resp = a + b;
         JOptionPane.showMessageDialog(null, a + "+ " + b + " = " + resp);
      }
      JOptionPane.showMessageDialog(null, "Adios :)");
      
   }
}

