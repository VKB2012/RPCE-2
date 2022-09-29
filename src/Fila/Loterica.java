package Fila;

public class Loterica {
    public static void main(String args[]){
        fila f;
        int primeiro;
        int ultimo;
        int e;
        f=new fila();
       f.inserir(57);
       f.inserir(54198);
       f.inserir(1);
       f.inserir(5);
       f.inserir(21);

       primeiro=f.start();
       ultimo=f.end();

       System.out.println("Primeiro elemento da fila:"+primeiro+"\nUltimo elemento da fila:"+ultimo+"\n");

       while(!f.isEmpy()){
           e=f.retirar();
           System.out.println(e);
       }

    }
}
