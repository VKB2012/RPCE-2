package Soma_de_Filas;

import java.util.LinkedList;

public class tentativa {
    public static void main(String[] args) {
        LinkedList<Integer> fC = new LinkedList<Integer>();

        Fila_A fA;
        Fila_B fB;

        fA = new Fila_A();
        fB = new Fila_B();

        fA.inserir(1);
        fA.inserir(3);
        fA.inserir(5);
        fA.inserir(7);
        fA.inserir(9);

        fB.inserir(2);
        fB.inserir(4);
        fB.inserir(6);
        fB.inserir(8);
        fB.inserir(9);

        for (int i=0;i<=8;i++){

            if (fA.start()<fB.start()){
            fC.add(fA.start());
            fA.retirar(fA.start());}

           else{fC.add(fB.start());
            fB.retirar(fB.start());}}
        System.out.println(fC);}}


