/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class sx_chen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();  
        for(int i=0;i<n;i++)
        {
            System.out.print("Buoc "+i+": ");
            a.add(sc.nextInt());
            Collections.sort(a);
            for(int j:a)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
