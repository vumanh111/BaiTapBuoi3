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
public class bai3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n:");
        int n = sc.nextInt();
        
       
        int[] a = new int[n];
        for(int i=0; i< a.length; i++){
            a[i] = sc.nextInt();
          
        }
        
        int[] b = new int[n];
        for(int i =0; i< b.length; i++){
            b[i] = 1;
        }
        for(int i =n-1;i>0; i--){
            if(a[i] >= a[i -1]){
                b[i-1] = b[i]+1;
            }
        }
//        System.out.println("mang b:");
//        for(int i=0; i< b.length; i++){
//            System.out.println(+b[i]);
//        }
        int max = b[0];
        for(int i=0; i< n; i++){
            if(b[i] > max){
                max = b[i];
            }
        }
     //   System.out.println("max:"+max);
        int sl =max;
        int count=0,dem =0;
        for(int i =0; i< n ; i++ ){
            if(b[i] ==sl){
                 System.out.println("Mảng có độ dài tăng dần dài nhất:");
                for(int j =i; j < sl+i; j++){
                    System.out.println(+a[j]);
                    count++;
                }
                dem++;
            }
        }
        
       // System.out.println("độ dài: "+count);
        if(dem >=2){
            System.out.println("\nđộ dài:"+count/dem);
        }
        else{
            System.out.println("độ dài: "+count);
        }
        
      
       
        
        
        
        
    }
    
}
    

