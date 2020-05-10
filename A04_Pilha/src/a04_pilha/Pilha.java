/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a04_pilha;

/**
 *
 * @author rafae
 * @param <T>
 */
public class Pilha<T> {
    
    class No{
        T elemento;
        No proximo;
    }
        
    public void empilha(T valor) {
        No e = new No();
        e.elemento = valor;
        No t = e;
        t.proximo = e;
        //for (int index = 0; index < pilhaAux.length; index++) {
        //    this.pilha[index] = pilhaAux[index];
        //}
    }
    
    public void desempilha() {
        //int sizePilha = this.pilha.length;
        // sizePilha = this.pilha[sizePilha-1] == null ? sizePilha-2 : sizePilha-1;
        //T[] pilhaAux = (T[]) new Object[sizePilha];
        //for (int index = 0; index < sizePilha; index++) {
        //    pilhaAux[index] = this.pilha[index];
        //}
        //this.pilha = pilhaAux;
    }
    
    public String toString() {
        String result = "[ ";
        //for (int index = this.pilha.length -1; index >= 0; index--) {
        //    if (this.pilha[index] == null)
        //        continue;
        //    if (index == 0)
        //        result += this.pilha[index] + "";
        //    else
        //        result += this.pilha[index] + " , ";
        //}
        
        return result += " ]";
    }
}
