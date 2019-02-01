/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class operaciones {
    private int numerador;
    private int denominador;
private int resultado;
private int num;
private int aux;
    public operaciones() {
    }

    public operaciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void invertir(){
    
    aux=numerador;
    numerador=denominador;
    denominador=aux;
    
}
    public double Multiplicacion(){
    aux=num*numerador;
    numerador=aux;
    resultado = numerador/denominador;
    return resultado;
}
    public double DivisionFracion(){
        resultado= numerador/denominador;
        return resultado;
    }
    public double Division(){
        aux=num*denominador;
        denominador=aux;
        resultado=numerador/denominador;
        return resultado;
    }
}
