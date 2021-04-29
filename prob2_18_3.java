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
public class prob2_18_3 {//HW 26 April 2021 CR!M!N4L 0F W4R
    public static void main(String[] args){
    int i,j;
    //1st line
    for(i=0;i<5;i++){
    if(i==2)
        System.out.print("*");
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    
    //2nd line
    for(i=0;i<5;i++){
    if(i!=0&&i!=4)
        System.out.print("*");
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    
    //3rd line
    for(i=0;i<5;i++){
        System.out.print("*");
    }
    System.out.print("\n");
    
    //4th to 10th line
    for(i=0;i<7;i++){
    for(j=0;j<5;j++){
        if(j==2)
        System.out.print("*");
    else
        System.out.print(" ");
    }
    System.out.print("\n");
    }
    }
}
