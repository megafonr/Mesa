/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encapsula;

/**
 *
 * @author Rolo
 */
public class MiMesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Mesa MiMesa;
        MiMesa = new Mesa();
        MiMesa.setLargo(25);
        // MiMesa.getLargo();
        MiMesa.setAncho(-12);
        
        System.out.println( "Mesa ancho: " + MiMesa.getAncho());
        System.out.println( "Mesa largo: " + MiMesa.getLargo());
        
    }
}
