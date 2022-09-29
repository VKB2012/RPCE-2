package Soma_de_Filas;

import Fila.fila;

public class Loterica {    public static void main(String args[]) {
    Fila_A fA;
    Fila_B fB;
    Fila_C fC;
    int primeiro;
    int ultimo;
    int e;
    fA = new Fila_A();
    fA.inserir(1);
    fA.inserir(3);
    fA.inserir(5);
    fA.inserir(7);
    fA.inserir(9);

    fB = new Fila_B();
    fB.inserir(2);
    fB.inserir(4);
    fB.inserir(6);
    fB.inserir(8);
    fB.inserir(9);


    fC = new Fila_C();
for (int i=1;i<10;i++) {

    int a = fA.start();
    int b = fB.start();

    if(fA.start()<fB.start()){
        fC.inserir(a);
    fA.retirar(i);}
    else {
        fC.inserir(b);
        fB.retirar(i);
    }
}
for (int i=0;i<10;i++){
        e=fC.retirar();
        System.out.println(e);}}}
