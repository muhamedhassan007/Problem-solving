/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamicconnectivity;

/**
 *
 * @author HP
 */
public class quickfind {
    protected int []id;
    quickfind(int N){
        id=new int[N];
        for (int i = 0; i < N; i++) {
            id[i]=i;
        }}
    public boolean connect(int p, int q){
        return id[p]==id[q];
    }
    public void union(int p, int q){
        int pnode=id[p];
        int qnode=id[q];
        for (int i = 0; i <id.length ; i++) {
            if(id[i]==pnode){
                id[i]=qnode;
            }
            
        }
    }
    public int[] returnarr(){
        return id;
    }
        
        
    }
    

