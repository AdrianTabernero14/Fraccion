package fraccion;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adria
 */
public class Operaciones {
   
    private int numerador;
    private int denominador;
private int resultado;
private int num;
private int aux;
    public Operaciones() {
    }

    public Operaciones(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Operaciones(int resultado, int num, int aux) {
        this.resultado = resultado;
        this.num = num;
        this.aux = aux;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
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
    System.out.println("Su fraccion invertida es: "+numerador+"/" +denominador);
            
}
    public double Multiplicacion(){
    aux=num*numerador;
    numerador=aux;
    resultado = numerador/denominador;
    System.out.println("El resultado de multiplicar "+num+" por "+numerador+"/"+denominador+" es: "+resultado);
    return resultado;
    
}
    public double DivisionFracion(){
        resultado= numerador/denominador;
        System.out.println("El resultado de dividir la fraccion "+numerador+"/"+denominador+" es: "+resultado);
        return resultado;
    }
    public double Division(){
        aux=num*denominador;
        denominador=aux;
        resultado=numerador/denominador;
        System.out.println("El resultado de dividir "+num+" entre "+numerador+"/"+denominador+" es: "+resultado);
        return resultado;
    }
    public String toString(){
        String datos;
        
        datos= "Tu fraccion es: "+numerador+"/"+denominador;
        return datos;
    }
}

