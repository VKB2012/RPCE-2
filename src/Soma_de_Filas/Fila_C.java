package Soma_de_Filas;

public class Fila_C {private int[] valores;
    private int inicio;
    private int fim;
    private int total;
    private int primeiro;
    private int ultimo;

    public Fila_C() {
        valores = new int[10];
        inicio = 0;
        fim =0;
        total =0;

    }

    public void inserir(int elemento) {
        valores[fim]=elemento;
        fim=(fim+1);
        total++;
    }

    public int retirar() {

        int elemento=valores[inicio];
        inicio=(inicio+1);
        total--;
        return elemento;

    }

    public int end() {

        ultimo=valores[total-1];
        return ultimo;
    }

    public int start() {
        primeiro=valores[inicio];
        return primeiro;
    }

    public boolean isEmpy() {
        return(total==0);
    }

    public boolean isFull() {
        return(total==10);
    }

}
