package lista.test;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {
  public static void main(String[] args) {
    ListaEncadeada<Integer> lista = new ListaEncadeada<>();
    
    lista.adiciona(1);
    System.out.println(lista);
    
    lista.adiciona(2);
    System.out.println(lista);
    
    lista.adiciona(3);
    System.out.println(lista);

    System.out.println("Tamanho = " + lista.getTamanho());
  }
}
