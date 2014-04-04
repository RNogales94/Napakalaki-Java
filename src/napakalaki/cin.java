/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package napakalaki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rafa Nogales
 */
public class cin {
    public static int readInteger(String msg) throws IOException {
        int input=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        System.out.print(msg);
        try{
            input = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }
        catch(IOException ioe){
            System.err.println("IO Error!");            
        }
        return input;
    }
    public static String readString(String msg) {
        String input="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        System.out.print(msg);
        try{
            input = br.readLine();
        }
        catch(IOException ioe){
            System.err.println("IO Error!");            
        }
        return input;
    }

}
