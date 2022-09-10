
package com.mycompany.conversor.tipos;

import javax.swing.JOptionPane;


public class OpcionesConversor {
    
    double dolar = 0.0071;
    double euro = 0.0070;
    double libra = 0.0062;
    double yen = 1.02;
    double won = 9.85;
    
    ConversorMoneda moneda = new ConversorMoneda();
    
    public void ConvertirMoneda(double valor){
    String option = (JOptionPane.showInputDialog(
            null, 
            "Elige la moneda a la que deseas convertir tu dinero", 
            "Monedas", 
            JOptionPane.PLAIN_MESSAGE, 
            null, 
            new Object[]{
                "De pesos a dolar", 
                "De pesos a euro", 
                "De pesos a libra",
                "De pesos a yen",
                "De pesos a won coreano",
                "De dolar a pesos",
                "De euro a pesos",
                "De libra a pesos",
                "De yen a pesos",
                "De won coreano a pesos"}, 
            "Seleccion")).toString();
    
        switch (option) {
            case "De pesos a dolar" -> moneda.ConvertirPesoA(valor, dolar, " dolares");
                
            case "De pesos a euro" -> moneda.ConvertirPesoA(valor, euro, " euros");
                
            case "De pesos a libra" -> moneda.ConvertirPesoA(valor, libra, " libras");
            
            case "De pesos a yen" -> moneda.ConvertirPesoA(valor, yen, " yenes");
            
            case "De pesos a won coreano" -> moneda.ConvertirPesoA(valor, won, " wons");
            
            case "De dolar a pesos" -> moneda.ConvertirAPeso(valor, dolar);
            
            case "De euro a pesos" -> moneda.ConvertirAPeso(valor, euro);
            
            case "De libra a pesos" -> moneda.ConvertirAPeso(valor, libra);
            
            case "De yen a pesos" -> moneda.ConvertirAPeso(valor, yen);
            
            case "De won coreano a pesos" -> moneda.ConvertirAPeso(valor, won);
        }
    
    }
}
