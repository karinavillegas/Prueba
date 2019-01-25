package pryproducto;

import java.util.ArrayList;
import java.util.Iterator;

public class producto {
    private String fruta,precio,tipo,codigo;

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<producto> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<producto> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

   
    
    private ArrayList<producto>listaEmpleado=new ArrayList<producto>();//arraylist de tipo objeto
public void insertarEmpleado(producto metodoempleado){    
listaEmpleado.add(metodoempleado);
        }
//recorrer array list
public void imprimirEmpleado(){
    //System.out.println("Metodo Iterator: ");
    //descompone el listado la lista empleados para pasar uno a uno es decir si tiene algunos se va 
    //a descomponer
    Iterator<producto>miIterator=listaEmpleado.iterator();//metodo iterator
    //while mientras
    while(miIterator.hasNext()){//hacer esto recorre busca los elementos y nos muestra
       producto elemento=(producto)miIterator.next();
       System.out.println("El recorrido es : "+elemento.toString());
    }    
}
public void eliminarEmpleado(producto em){
    listaEmpleado.remove(em);
}   
public void buscarEmpleado(String cedula ){
    boolean op=false;
    Iterator<producto>miIterator=listaEmpleado.iterator();//metodo iterator
    //while mientras
    while(miIterator.hasNext()){//hacer esto recorre busca los elementos y nos muestra
       producto elemento=(producto)miIterator.next();
       if(elemento.equals(cedula)){
           
           System.out.println("1. Nombre: "+elemento.getFruta());
           System.out.println("2. Precio: "+elemento.getPrecio());  
           System.out.println("3. Tipo: "+elemento.getTipo());  
              System.out.println("4. Codigo: "+elemento.getCodigo());  
           op=true;
    
}
}
 if(op==false){
       System.out.println("No se encontro producto");
 }   
}
public void modificarEmpleado(int opDato,String dato,String codigo){
     boolean op=false;
    Iterator<producto>miIterator=listaEmpleado.iterator();//metodo iterator
    //while mientras
    while(miIterator.hasNext()){//hacer esto recorre busca los elementos y nos muestra
       producto elemento=(producto)miIterator.next();
       if(elemento.equals(codigo)){
           switch(opDato){
               case 1:{
                   elemento.setFruta(dato);
               }break;
               case 2:{
                   elemento.setPrecio(null);
               }
               case 3:{
                   elemento.setTipo(tipo);
               }
               case 4: {
                   
               }
           }
           
       }
    }
    
    
    
}
    
}
