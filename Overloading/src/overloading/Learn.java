/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author user
 */
public class Learn {
   void Pyro(String a){
       System.out.println("Claymore : "+a);
   }
   void Pyro(String b,String c) {
       System.out.println("Polearm : "+b);
   }
   void Pyro(int a,String d) {
       System.out.println("HP : "+a+d);
   }

}
