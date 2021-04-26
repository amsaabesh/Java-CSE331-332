/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse_331_332;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class prob2_30 {//HW 26 April 2021 CR!M!N4L 0F W4R pechano
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    int a;
        a = sc.nextInt();
    while(a!=0){
    int b[];
      b = new int[5];
      for(int i=0;i<5;i++){
          b[i]=a%10;
          a/=10;
      }
      for(int i=4;i>=0;i--){
          System.out.print(b[i]+" ");
      }
    }
        
    
    }
    
}
