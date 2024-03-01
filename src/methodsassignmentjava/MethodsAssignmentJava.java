/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsassignmentjava;

import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author f.wegert
 */
public class MethodsAssignmentJava {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Welcome to formatting Numbers ", "Formatting Numbers", JOptionPane.PLAIN_MESSAGE);        
        number();
        
    }
    public static void number(){
     String number = JOptionPane.showInputDialog(null, "Please enter your number: ", "Formatting Numbers", JOptionPane.PLAIN_MESSAGE);
        double number2 = Double.parseDouble(number);    
        double minimum = 1000;
       
        
        if (number2 >= minimum) {
        System.out.printf("%f, ", number2);   
       }
        
        JOptionPane.showMessageDialog(null, "Formatted Number: " + number2, "Formatting Numbers ", JOptionPane.INFORMATION_MESSAGE);
        
     } 
    }

