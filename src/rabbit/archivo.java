/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rabbit;

import java.util.ArrayList;

/**
 *
 * @author Valeria
 */
public class archivo {
    String nombre;
    String token;
    ArrayList<String> tokens= new ArrayList<>();

    public archivo() {
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public void setTokens(String token) {
        tokens.add(token);
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
   
    
    
}
