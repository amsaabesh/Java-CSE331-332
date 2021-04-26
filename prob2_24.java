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
public class prob2_24{//HW 26 April 2021 CR!M!N4L 0F W4R find large and small form 5 value
  public static void main(String []args) {
    int n=5,i,j,temp; 
    Scanner sc = new Scanner(System.in);
    int a[];
      a = new int[n];
    for (i=0;i< n;i++) 
      a[i]=sc.nextInt();
    for (i = 0; i < ( n - 1 ); i++) {
      for (j = 0; j < n - i - 1; j++) {
        if (a[j]>a[j+1]) 
        {
           temp=a[j];
           a[j]=a[j+1];
           a[j+1] = temp;
        }
      }
    }
      System.out.println(a[0]+" poribarer shobcheye choto shodosso\n"+a[4]+" elakar boro vai");
  }
}
