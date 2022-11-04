/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < a.length ; i++){
            System.out.print("a["+i+"]= ");
            a[i] = sc.nextInt();
        }
        int  dem =0;
        for( int i=0; i< n-1; i++){
            if(a[i+1] - a[i] != 1){
               int k = a[i+1] - a[i];
                for(int j =1; j< k; j++){
                    System.out.println(a[i] + j);
                    dem++;
                }
               
            }
        }   
        if(dem ==0){
            System.out.println("Yes");
        }
               
        
     
        
        
    }
    
}
