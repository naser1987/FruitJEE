
package Controller;

import Model.Fruit;
import Service.FruitServices;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Controller", urlPatterns = {"/C"})
public class Controller extends HttpServlet {

    ArrayList<Fruit> fruits=null;
    String cmd = null;

    @Override
    public void init() throws ServletException {
        super.init(); 
        fruits = FruitServices.getFruits();
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
       
        String b = "<tr><td>";
        String m = "</td><td>";
        String e = "</td></tr>";
        
        cmd = request.getParameter("cmd");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><title>Servlet FruitsController</title></head><body>");
          
            if(cmd == null){
                cmd = "Fruits";
            }
            out.println("<table border= 1>");
            if(cmd.equals("Fruits")){
            
                for(Fruit f:fruits){
                    String a = "<a href ='C?cmd=OneFruit&id="+f.id +"'>" ;
                    out.println(b + f.id+ m +a +f.fruitName+"</a>" + e);
                }
           
            }
            else if(cmd.equals("OneFruit")){
                String idstr = request.getParameter("id");
                int id = Integer.parseInt(idstr);
                Fruit fruit = fruits.get(id-1);
                String im = "<tr><td colspan = 2><img width= 350px height= 150px src='images/";
                out.println(im+fruit.image+"'/></td></tr>");
                out.println(b + fruit.id+ m + fruit.fruitName + e);
                out.println(b + "Calories"+ m + fruit.Calories + e);
                out.println(b + "CaloriesfromFat"+ m + fruit.CaloriesfromFat + e);
                out.println(b + "TotalFat_g"+ m + fruit.TotalFat_g + e);
                out.println(b + "Sodium_mg"+ m + fruit.Sodium_mg + e);
                out.println(b + "Potassium_mg"+ m + fruit.Potassium_mg + e);
                out.println(b + "TotalCarb_g"+ m + fruit.TotalCarb_g + e);
                out.println(b + "DietaryFiber_g"+ m + fruit.DietaryFiber_g + e);
                out.println(b + "Sugars_g"+ m + fruit.Sugars_g + e);
                out.println(b + "Protein_g"+ m + fruit.Protein_g + e);
                out.println(b + "VitaminA_DV"+ m + fruit.VitaminA_DV + e);
                out.println(b + "VitaminC_DV"+ m + fruit.VitaminC_DV + e);
                out.println(b + "Calcum_DV"+ m + fruit.Calcum_DV + e);
                out.println(b + "Iron_DV"+ m + fruit.Iron_DV + e);
                out.println("<tr><td><a href ='C?cmd=Fruits'> Back </a></td>");   
                out.println("<td><a href ='#'> Add To List </a></td></tr>"); 
            }
            out.println("</table>");
            out.println("</body></html>");
            
        }
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
