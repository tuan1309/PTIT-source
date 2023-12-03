/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class so_nguyen_to {
    static String isprime(int n) {
        if(n<2) return ("NO");
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return("NO");
        }
        return("YES");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(isprime(n));
        }
    }
}
