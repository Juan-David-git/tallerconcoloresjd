/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reloj;


public class Reloj {
 int hora=12;
 int minuto =20;
 int segundos =15;
 String formato = "24 horas";
 boolean alarmaActivada = true;
 
 public Reloj(){  
     
 }
 // Getters
 public int getHora(){
     return hora;  
 }
 
 public int getMinuto(){
     return minuto;
   }
 
  public int getSegundos(){
     return segundos;
   }
  
   public String getFormato(){
     return formato;  
 }
   
     public boolean getalarmaActivada(){
     return alarmaActivada;
   }
 // Setters
 public void setHora(int hora){
     this.hora=hora;
     
 }
 
  public void setMinuto(int minuto){
     this.minuto=minuto;
 }
  
    public void setSegundos(int segundos){
     this.segundos=segundos;
 }
    
  public String setFormato(){
     return formato;  
 }
    public boolean setalarmaActivada(){
     return alarmaActivada;
   }
 
 
 
 public void establecerhora(int hora, int minuto, int segundos){
     System.out.println("Calculando...");
 }
 
  public void actualizarReloj(){
     System.out.println("Estoy actualizando...");
 }
  
  public void activarAlarma(boolean estado){
      System.out.println("Alarma actualizando...");
  }
  
  public void verificarAlarma(){
      System.out.println("Verificando...");
  }
  
  public void mostrarhora(){
      System.out.println();
  }
 
 
         
    
}
