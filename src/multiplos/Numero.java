/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

/**
 *
 * @author Sandro
 */
public class Numero {
 int a;
 int b;
    public Numero() {
        
    }

     public Numero(int a, int b){
        this.a=a;
        this.b=b;
    

    }
    public void setnumeroa(int a){
        this.a=a;
    }
    public int getnumeroa(){
        return  a;
    }
     public void setnumerob(int b){
        this.b=b;
    }
    public int getnumerob(){
        return  b;
    }
        public String MostrarResulados2 (){
           if(a % b == 0){
               return  " son multiplo entre ellos ";
           }
           else {
               return " No son multiplos entre ellos";
           }
        }
    
}
