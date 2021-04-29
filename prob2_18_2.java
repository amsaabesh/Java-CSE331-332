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
public class prob2_18_2 {//HW 26 April 2021 CR!M!N4L 0F W4R
    public static void main(String[] args){
    int i,j;
    //1st line
    for(i=0; i<9;i++){
    if(i>2&&i<6){
    System.out.print("*");
    }
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    
    //2nd line
    for(i=0; i<9;i++){
    if(i==1||i==7){
    System.out.print("*");
    }
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    
    //3-5th line
    for(j=0;j<3;j++){
    for(i=0; i<9;i++){
    if(i==0||i==8){
    System.out.print("*");
    }
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    }
    
    //2nd last line
    for(i=0; i<9;i++){
    if(i==1||i==7){
    System.out.print("*");
    }
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    
    //last line
    for(i=0; i<9;i++){
    if(i>2&&i<6){
    System.out.print("*");
    }
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    }
    
}
