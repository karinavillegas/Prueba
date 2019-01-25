package pryproducto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class PryProducto {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
        int op,b = 0,a,c=1; 
          ArrayList<String>productos=new ArrayList<>();
          System.out.println("PRODUCTOS");
       do{
          System.out.println("\n\n\n1.Metodo Añadir");
          System.out.println("2.Metodo Remove");
          System.out.println("3.Metodo Size");
          System.out.println("4.Metodo Get");
          System.out.println("5.Metodo Iterator");
          System.out.println("6.Metodo Index Of");
          System.out.println("7.Metodo Clear");
          System.out.println("8.Imprimir");
           System.out.println("Elija una opcion : ");
          op=sc.nextInt();
          switch(op){
              case 1:{
                   System.out.println("ingrese el numero de frutas  ");
          a=sc.nextInt();
           String fruta;
           String tipo;
           String precio;
           String codigo;
                   
          for(int i=0; i<a;i++){
             // System.out.println("Ingrese el tipo de producto: ");
              //tipo=sc.next();
               int opc = 0;
                 System.out.println("1. LACTEOS");
                 System.out.println("2. Cereal");
                 System.out.println("3. Verduras");
                 System.out.println("Elija una opcion : ");
                 opc=sc.nextInt();
              switch(opc){
                  
                  case 1: {
              System.out.println("ingrese  el codigo: "+c++);
              codigo=sc.next();
              System.out.println("ingrese  el nombre: "+c++);
              fruta=sc.next();
              System.out.println("Ingrese el precio del producto: ");
              precio=sc.next();            
              
          productos.add(fruta);
       //   productos.add(tipo);
          productos.add(precio);
                  }
                  case 2:{
                             System.out.println("ingrese  el codigo: "+c++);
              codigo=sc.next();
    System.out.println("ingrese  el nombre: "+c++);
              fruta=sc.next();
              System.out.println("Ingrese el precio del producto: ");
              precio=sc.next();            
              
          productos.add(fruta);
       //   productos.add(tipo);
          productos.add(precio);                    
                  }
                  case 3:{
                             System.out.println("ingrese  el codigo: "+c++);
              codigo=sc.next();
    System.out.println("ingrese  la fruta: "+c++);
              fruta=sc.next();
              System.out.println("Ingrese el precio del producto: ");
              precio=sc.next();            
              
          productos.add(fruta);
       //   productos.add(tipo);
          productos.add(precio);                    
                  }
                  
              }while(opc!=4);
              
    
          
          
          }
          System.out.println("las frutas son "+productos.toString());
          
              }break;
              case 2:{
                  String fruta1;
                    System.out.println("ingrese la fruta a eliminar : ");
              fruta1=sc.next();
                  System.out.println("  "+productos.remove(fruta1));
                  
                  System.out.println("la lista de fruta es : \n"+productos.toString());
                  
              }break;
              case 3:{
                  System.out.println("la cantidad de lista de Futas es    : \n" +productos.size());
                  System.out.println("las frutas son "+productos.toString());
                  
              }break;
              case 4:{
                   int fruta1;
                    System.out.println("ingrese el indice en numeros: ");
             fruta1=sc.nextInt();
                   System.out.println(" el indice de fruta a buscar es "+productos.get(fruta1));
                   
                   System.out.println("las frutas son "+productos.toString());
              }break;
              case 5:{
                      System.out.println("Metodo Iterator ");
        Iterator<String> it=productos.iterator();
        // para recorer nuemeros
        String pai = null ;
        
        while(it.hasNext())// el hasnext devueleve verdadero 
        {
            pai=it.next();// debuelve el siguiente elemento de la interacion
            System.out.println("  :"+pai);
        }
        
              }break;
              case 6:{
                    String paisess1;
                    System.out.println("ingrese el nombre de la fruta para ver la posicion : ");
              paisess1=sc.next();
                 System.out.println(" la pocicion  del elemento es : "+productos.indexOf(paisess1)); 
                 System.out.println("las frutas son "+productos.toString());
                  
              }break;
              case 7:{
                  
                   b=2;
                 productos.clear();
        
        System.out.println(" eliminar elementos "+productos.toString());
        //// para decirsi la lista esta bacia
        
              }break;
              case 8:{
               
                 /* if(b==2){
                      System.out.println(" la lista es : \n "+productos.toString() );
                    System.out.println(" \n "+productos.isEmpty());
                  }else{
                        System.out.println(" la lista es : \n "+productos.toString() ); 
                  }*/
                 producto bdd=new producto();
producto q=new producto();
bdd.insertarEmpleado(q);
bdd.imprimirEmpleado();
 int op = 0;
 switch(op){
     case 1: 
     {
       System.out.println("Ingrese el nombre");
       String nombre=sc.next();
       bdd.modificarEmpleado(1, "pepito","0202");
     }
     case 3:{
         System.out.println("Ingrese el salario");
         float salario=sc.nextFloat();
       //  bdd.modificarEmpleado(op, dato, cedula);
                 
                 
              }break;      
          }
        }while(op!=9);
         
    
}}}}