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
public class Mesa {
    private int largo;
    private int ancho;

public void setLargo(int largo){
    if (largo>0) this.largo=largo;
}

public int getLargo(){
    return largo;
}

public void setAncho(int ancho){
    if (ancho>0) this.ancho=ancho;
}

public int getAncho(){
    return ancho;
}

}