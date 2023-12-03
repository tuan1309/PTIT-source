/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class so_thuan_nghich {
    static boolean check(String s)
    {
        char[] a=s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
            if(a[i]!=a[s.length()-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            System.out.println(check(s)&& s.matches("[^014689]+")?"YES":"NO");
        }
    }
}
