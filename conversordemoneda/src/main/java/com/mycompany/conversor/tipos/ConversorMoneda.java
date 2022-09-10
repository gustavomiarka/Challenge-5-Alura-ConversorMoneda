
package com.mycompany.conversor.tipos;

import javax.swing.JOptionPane;


public class ConversorMoneda {
    
    public void ConvertirPesoA(double valor, double moneda, String tipoMoneda){
        double resultado = valor * moneda;
        resultado = (double) Math.round(resultado * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + resultado + tipoMoneda);
    }
    
    public void ConvertirAPeso(double valor, double moneda){
        double resultado = valor / moneda;
        resultado = (double) Math.round(resultado * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + resultado + " pesos");
    }
    
}
