/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.ui;
import java.util.Scanner;
import mx.itson.brocoli.negocio.Operacion;
/**
 *
 * @author luism
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Escriba el texto a separar:");
        
        Scanner scanner = new Scanner(System.in);
        String oracion = scanner.nextLine();    
        
        String[] resultado = new Operacion().separar(oracion);
        
        for(String r: resultado){
            System.out.println(r);
            System.out.println(r);
        }
    }
}
