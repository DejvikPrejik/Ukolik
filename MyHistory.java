/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hlavni;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2016-e-preucil
 */
public class MyHistory extends Hlavni {

    
    ArrayList a = new ArrayList();
    private Path cesta;

    public MyHistory(String fileName) {
        
        cesta = Paths.get(fileName);
    }

    public void read(){
       try{ Files.readAllLines(cesta);
       } catch (IOException ex) {
            System.out.println("Spatne zadana cesta k souboru");
        }
    }

    public void save() {

        try{Files.write(cesta, a);
        } catch (IOException ex){
            System.out.println("Spatne zadana cesta k souboru");
        }
    }

    public void addLine(String str) {
        if (a == null) {
            a = new ArrayList<>();
        } else {
            if (a.contains(str)) {
                System.out.println("Uz tam je");
            } else {
                a.add(str);
            }
        }
    }

    public String toString() {
        return String.join("\n", a);
    }

}
