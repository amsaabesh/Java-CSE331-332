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
public  class fibonacci {//CW 22 April 2021 CR!M!N4L 0F W4R
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b=0, c=1,i=1;
while(i<=a){
    System.out.print(b+" ");
    int s = b+c;
            b=c;
            c= s;
            i++;
        }
    }
}
