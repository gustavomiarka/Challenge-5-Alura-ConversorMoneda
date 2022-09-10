

package com.mycompany.conversor;

import com.mycompany.conversor.tipos.OpcionesConversor;
import javax.swing.JOptionPane;


public class Conversor {

    public static void main(String[] args) {
        
        OpcionesConversor conversor = new OpcionesConversor();
        
        while (true) {            
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
                    "Menu", JOptionPane.PLAIN_MESSAGE, null, 
                    new Object[]{"Conversor de monedas"}, "Elegir").toString();
            
            switch (opciones) {
                case "Conversor de monedas" -> {
                    String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
                    double valorRecibido = Double.parseDouble(input);
                    conversor.ConvertirMoneda(valorRecibido);
                }
            }
        }
    }
}
