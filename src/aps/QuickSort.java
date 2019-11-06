package aps;

import java.util.List;


public class QuickSort {   
    public List Ordenar(List lista){        
       quicksort(lista, 0, lista.size() - 1);
       return lista;
    }
    
    private List quicksort(List lista, int inicio, int fim)
   {
    
        int Pivo;
        if (inicio < fim) 
        {
            Pivo = separar(lista, inicio, fim);
            quicksort(lista, inicio, Pivo - 1);
            quicksort(lista, Pivo + 1, fim);
//            System.out.println(lista);
        }
       
       return lista;
   }
    public int separar(List lista, int inicio, int fim)
    {
        double pivo = (double) lista.get(fim);
        int i = inicio - 1;
        double troca;
        
        for(int j = inicio; j <= fim - 1; j++)
        {
            if( (double) lista.get(j) <= pivo)
            {
                i++;
                troca = (double) lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, troca);
            }
        }
        
        troca = (double) lista.get(fim);
        lista.set(fim , lista.get(i + 1));
        lista.set(i + 1, troca);
        
        return i+1;
    }
}
