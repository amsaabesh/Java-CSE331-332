/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse_331_332;
/**
 *
 * @author user
 */
public class HelloWorld {//CW 22 April 2021 CR!M!N4L 0F W4R

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ahmed Mahir Shoaib\nId: 18192103235");
        int n=100, i;
        System.out.println("Even");
        for(i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("\nOdd");
        for(i=1;i<=n;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }   
        }
    }
}
