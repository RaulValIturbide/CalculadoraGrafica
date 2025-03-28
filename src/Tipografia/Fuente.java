/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipografia;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author baske
 */
public class Fuente {
    
    /**
     * Este metodo sirve para añadir la fuente "awesome" 
     * @param Resultado se trata del label en el que se va a mostrar la fuente
     */
    public static void addFuenteAwesome(javax.swing.JLabel Resultado){
                try{
        Font fuentePersonalizada = Font.createFont(Font.TRUETYPE_FONT,new File("tools\\fonts\\Awesome.otf"));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fuentePersonalizada);
        Resultado.setFont(new Font("Awesome",Font.PLAIN,24));
        }catch(FontFormatException  e){
            System.out.println("Error con el fichero de fuentes");
        }catch(IOException ex){
            System.out.println("Error");
        }
    }
    
}
