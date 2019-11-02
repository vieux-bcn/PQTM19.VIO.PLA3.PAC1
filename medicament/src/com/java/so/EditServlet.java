package com.java.so;
import java.io.IOException;  
import java.io.PrintWriter;   
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
 
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("Update Medicament");
        
        String sid = request.getParameter("id");  
         
          
        Medicament e = MedicamentDao.getMedicamentById(sid);  
        
        out.print(sid);
        
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td>MedicamentId</td><td><input type='text' name='medicamentId' value='"+e.getMedicamentId()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
        out.print("<tr><td>Price:</td><td><input type='text' name='price' value='"+e.getPrice()+"'/></td></tr>");     
        out.print("<tr><td>Description:</td><td><input type='text' name='description' value='"+e.getDescription()+"'/></td></tr>");  
        out.print("<tr><td>Category:</td><td>");  
        out.print("<select name='category' style='width:150px'>");  
        out.print("<option>CATEGORY1</option>");  
        out.print("<option>CATEGORY2</option>");  
        out.print("<option>CATEGORY3</option>");   
        out.print("</select>");  
        out.print("</td></tr>");
        out.print("<tr><td>Producer:</td><td><input type='text' name='producer' value='"+e.getProducer()+"'/></td></tr>");
        out.print("<tr><td>StockQuantity:</td><td><input type='text' name='stockQuantity' value='"+e.getStockQuantity()+"'/></td></tr>");
        out.print("<tr><td>StockInOrder:</td><td><input type='text' name='stockInOrder' value='"+e.getStockInOrder()+"'/></td></tr>");
        out.print("<tr><td>Active:</td><td>");  
        out.print("<select name='active' style='width:150px'>");  
        out.print("<option>true</option>");  
        out.print("<option>false</option>");  
        out.print("</select>");  
        out.print("</td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
} 