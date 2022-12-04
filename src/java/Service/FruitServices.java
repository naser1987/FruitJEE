
package Service;

import Model.Fruit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FruitServices {
    static ArrayList<Fruit> fruits= new ArrayList<>();
    public static ArrayList<Fruit> getFruits(){
        File file = new File("C:\\Users\\Naser\\Documents\\NetBeansProjects\\Fruits\\web\\WEB-INF\\fruit.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line= br.readLine();
            while((line=br.readLine())!= null){
            Fruit f =new Fruit(line);
            fruits.add(f);
            }
            br.close();
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FruitServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(FruitServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    return fruits;
    }
    public static Fruit getOneFruit(int id) {
        Fruit fruit = null;
        File file = new File("C:\\Users\\Naser\\Documents\\NetBeansProjects\\Fruits\\web\\fruit.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line= br.readLine();
            while((line=br.readLine())!= null){
                if(line.startsWith(id+"|")){
                fruit=new Fruit(line);
                    break;
                }
            }    
            br.close();
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FruitServices.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(FruitServices.class.getName()).log(Level.SEVERE, null, ex);
        }
    return fruit;
    }
    public static void main(String[] args) {
        ArrayList<Fruit> fruits =getFruits();
      
            System.out.println(fruits.size()+"");
        
    }

    
}
