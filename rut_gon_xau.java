/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.*;
public class rut_gon_xau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack st=new Stack();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(!st.isEmpty()&& s.charAt(i)==(char)st.peek())
                st.pop();
            else 
                st.push(s.charAt(i));
        }
        if(st.isEmpty())
            System.out.print("Empty String");
        else 
        {
            while(!st.isEmpty())
                System.out.print(st.pop());
        }
    }
}
