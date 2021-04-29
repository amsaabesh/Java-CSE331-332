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
public class prob2_18_4 {//HW 26 April 2021 CR!M!N4L 0F W4R
    public static void main(String[] args){
    int i,j;
    for(i=0;i<9;i++){
        if(i==0||i==8){//1and9
            for(j=0;j<9;j++){
            if(j==4)
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
        else if(i==1||i==7){//2 and 8
        for(j=0;j<9;j++){
            if(j==3||j==5)
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
        else if(i==2||i==6){//3 and 7
        for(j=0;j<9;j++){
            if(j==2||j==6)
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.print("\n");
    }   
        else if(i==3||i==5){//4 and 6
        for(j=0;j<9;j++){
            if(j==1||j==7)
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.print("\n");
    }
        
        else if(i==4){//middle
        for(j=0;j<9;j++){
            if(j==0||j==8)
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.print("\n");
    }
   }
    }