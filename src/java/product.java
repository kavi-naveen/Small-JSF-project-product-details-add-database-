
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
@ManagedBean (name="obj")
@SessionScoped
public class product {
     private String name;
     private int qty;
     private double price;
     
     public product(){
     }
     
     public String getName(){
         return name;
     }
     
     public void setName(String name){
          this.name=name;
     }
     
      public int getQty(){
         return qty;
     }
      
       public void setQty(int qty){
          this.qty=qty;
     }
       public double getPrice(){
         return price;
     }
       
        public void setPrice(double price){
          this.price=price;
     }
       public String add()
       {
       System.out.println("product insert");
       System.out.println(name +" " +qty+ " " + price);
       return "sucess";
       
       }
    
}
