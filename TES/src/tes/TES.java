/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

/**
 *
 * @author user
 */
public class TES {
    private static String username;

    /**
     * @param args the command line arguments
     */
    public static void setUserLogin(String username){
        UserID.username = username;
        
    }
    
    public static String getUserLogin(){
    return username;
    }
    
}


