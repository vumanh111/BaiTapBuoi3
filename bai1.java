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
public class bai1 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n;
    do{
         System.out.print("nhap n: ");
          n = scanner.nextInt();
    }while( n < 2);
   
    //nhap mang
    int[] arr = new int[n];
         for(int i =0; i< arr.length; i++){
        System.out.print("a["+i+"]=");
        arr[i] = new Scanner(System.in).nextInt();
        }
    //sap xep mang theo chieu tang dan
        for(int i=0; i< arr.length; i++){
            for(int j =i+1; j < arr.length; j++ ){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
            }
        }
    //đếm số phần tử xuất hiện trong mảng:
    int count ,i ;
        for( i =0; i< arr.length ; i++){
            count =1;
            for(int j = i+1; j< arr.length; j++){
                if( arr[i] == arr[j]){
                   count++;
                   ++i;
                }
            }
            System.out.println("phần tử "+arr[i]+" xuất hiện "+count+" lần");
        }
       
             
        
        
    }
    
    
}
