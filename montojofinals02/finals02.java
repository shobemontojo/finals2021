/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montojo_finals02;

import java.util.*;

public class finals02 {
    
     public static String Encode1(String str){
        String encodedA = "";
        int i = 0;
        
        while (i < str.length()){
            int cnt = 1;
            
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)){
                cnt++;
                i++;
            }
            encodedA = encodedA + cnt + str.charAt(i);
            i++;
        }
        return encodedA;
    }
    
    public static String Encode2(String str){
        
        String encodedB = "";
        int i = 0;
        int count = 0;
        char current = str.charAt(i);
        
        while (i <= str.length()){
            
            if (i == str.length()){
                encodedB = encodedB + count + current;
            }
            else if (current != str.charAt(i) && i==1){
                encodedB = encodedB + count + current;
                current = str.charAt(i);
                count = 1;
            }
            else if(current != str.charAt(i)){
                encodedB = encodedB + (count) + current;
                current = str.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
            
            i++;
        }
        
        return encodedB;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String input = scanner.next();

        
        System.out.println("Encode1 output: ");
        System.out.println(Encode1(input));

        
        System.out.println("Encode2 ouutput: ");
        System.out.println(Encode2(input));      
        System.out.println("Comparison of both outputs if equal: " + Encode2(input).equals(Encode1(input)));
        
    }
}
