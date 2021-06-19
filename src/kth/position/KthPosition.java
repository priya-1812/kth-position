/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kth.position;
import java.util.Scanner;
public class KthPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        System.out.println(str1.substring(4,5));
        String str2=in.nextLine();
        System.out.println(str2.substring(5,6));
    }
    
}
