/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filacircular;

/**
 *
 * @author BETE
 */
public class filavetorcircular implements interfacefilaarranjosimples
{
private int capacidade;
private int quantidade = 0;
private novetorcircular fila [];
private int inicio = 0;
private int fim = 0;

    @Override
    public void criarFila(int tamanho) {
     fila=new novetorcircular[tamanho];
     capacidade=quantidade;
    
    }

    @Override
    public boolean eCheia() {
    return fim == capacidade;
}

    @Override
    public boolean eVazia() {
    return fim == inicio;    
}

    @Override
    public int tamanho() {
    return fim + 1;
    }

    @Override
    public novetorcircular enfileirar(int valor) {
    if (capacidade == quantidade){
        System.out.println("fila cheia!");
    }
    else{
        novetorcircular elemento = null;
        fila [fim] = elemento;
        fim =(fim+1)% quantidade;
        capacidade++;
        return elemento;
    }
        System.out.println("fila cheia");
        return null;
    }
    @Override
    public novetorcircular desenfileirar() {
if (quantidade > 0 ){
            novetorcircular x = fila[inicio];
            fila[inicio++]=null;
            inicio=(inicio+1)% quantidade;
            capacidade --;
            return x;
        }
        System.out.println("fila cheia");
            return null;
    }

    @Override
    public int pegarInicio() {
    if (inicio != 0 && fim != 0) {
        return fila[inicio].getValor();
        } else {
        return -1;
    }
    }
    @Override
    public void listar() {
    for (int i = 0; i < capacidade; i++){
    if(fila[i]!=null){
        System.out.println("["+ fila[i]+ "]");
    }
    }
    }
   
    }
