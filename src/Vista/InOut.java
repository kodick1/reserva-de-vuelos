/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc Smart
 */
public class InOut {
     public String Pedirstring (String m){
        return JOptionPane.showInputDialog(m);
    
}
    public void mostrar (String m){
    JOptionPane.showMessageDialog(null, m);
}


 public int pedirentero (String m){
     String e= JOptionPane.showInputDialog(m);
     return Integer.parseInt(e);
 }   
public int mostrarentero(int n){
    JOptionPane.showInputDialog(n);
        return 0;
}
 public double pedirdouble(String n) {
        return Double.parseDouble(JOptionPane.showInputDialog(n));
    }
}