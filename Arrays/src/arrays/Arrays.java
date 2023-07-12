/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author andre
 */
public class Arrays 
{
    public static void main(String[] args) 
    {  
    //Array de uma dimensão (lista) 
        System.out.println("Vetor:");
        //Declaração: não é informada a quantidade de elementos no array
        int vet[];
        
        //Construção: é informada a quantidade de elementos no array
        vet = new int[10];
        
        //Preenchimento
        for(int i=0; i<vet.length; i++)
            vet[i]= i*i;
            
        //Impressão
        for(int i=0; i<vet.length; i++)
            System.out.print(vet[i] + "\t");
        
        System.out.println("\n");  
        
        
    //Array com duas dimensões (matriz)
        System.out.println("Matriz:");
        //Declaração
        int mat[][];
        
        //Construção
        mat = new int[5][10];
        
        //Preenchimento
        for(int lin=0; lin<mat.length; lin++)
        {
            for(int col=0; col<mat[lin].length; col++)
                mat[lin][col] = lin+col;
        }
        
        //Impressão
        for(int lin=0; lin<mat.length; lin++)
        {
            for(int col=0; col<mat[lin].length; col++)
                System.out.print(mat[lin][col] + "\t");
            System.out.println();       
        }
        
        System.out.println();
        
        
    //Array com quantidades diferentes nas colunas
        System.out.println("Escadaria:");
        //Declaração
        int m[][];
        
        //Construção
        m = new int[10][];
        
        for(int lin=0; lin<m.length; lin++)
            m[lin]=new int[lin+1];
        
        //Preenchimento
        for(int lin=0; lin<m.length; lin++)
        {
            for(int col=0; col<m[lin].length; col++)
                m[lin][col] = lin-col;
        }
        
        //Impressão
        for(int lin=0; lin<m.length; lin++)
        {
            for(int col=0; col<m[lin].length; col++)
                System.out.print(m[lin][col] + "\t");
            System.out.println();
        }
        
        System.out.println();
        
    //Array com três dimensões(cubo)
        System.out.println("Cubo:");
        
        int cub[][][] = new int[3][3][3];
        
        //Preenchimento
        for(int i=0; i<cub.length; i++)
            for(int j=0; j<cub[i].length; j++)
                for(int k=0; k<cub[i][j].length; k++)
                    cub[i][j][k] = i+j+k;
        
        //Impressão
        for(int i=0; i<cub.length; i++)
            for(int j=0; j<cub[i].length; j++)
                for(int k=0; k<cub[i][j].length; k++)
                    System.out.println("["+i+"]["+j+"]["+k+"] = " + cub[i][j][k]);     
    } 
}//fim 
