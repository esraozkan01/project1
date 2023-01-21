/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpanedeneme;

/**
 *
 * @author esra
 */
import javax.swing.JOptionPane;
public class JOptionpanedeneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ESRA ÖZKAN
        //s26241
        String satir;
        int hiz; // toplamCeza yı yazarken java ilk değer atamayınca hata veriyor.
        int tekrar;
        int bazCeza;
        int toplamCeza;
        satir= JOptionPane.showInputDialog("Hız miktarını giriniz.");
        hiz=Integer.parseInt(satir);
        satir= JOptionPane.showInputDialog("Tekrar sayısını giriniz.");
        tekrar=Integer.parseInt(satir);
        
        if ((hiz>=111) && (hiz<=140)) {
                if ( tekrar>=1 && tekrar<=3 ) {
                    bazCeza=150;
                    JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
                }
                else if (tekrar==4 || tekrar ==5 ){
                    bazCeza=350;
                    JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
                }
                 else if ( tekrar >= 6 && tekrar<=8){
                    bazCeza=800;
                    JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
                }
                    else{ 
                            bazCeza=5000;
                            JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
                 }
        toplamCeza = bazCeza + hiz*2;
        JOptionPane.showMessageDialog(null,toplamCeza,"Toplam Ceza",JOptionPane.OK_OPTION);
        }     
   
       if ((hiz>=141) && (hiz<=160) ) {
           if (tekrar>=1 && tekrar <=3){
               bazCeza=375;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
            }
         else  if (tekrar==4 || tekrar ==5){
            bazCeza=875;
            JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
         }
         else if (tekrar >=6 && tekrar <= 8){
            bazCeza=2000;
            JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
           }
           else  {
            bazCeza=11000;
            JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
             }
        toplamCeza = bazCeza + hiz*2;
        JOptionPane.showMessageDialog(null,toplamCeza,"Toplam Ceza",JOptionPane.OK_OPTION); 
       }
        
       if ((hiz>=161) && (hiz<=180) ){
            if (tekrar>=1 && tekrar <=3){
               bazCeza=720;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
            }
            else  if (tekrar==4 || tekrar ==5){
               bazCeza=1650;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
           }
            else if (tekrar >=6 && tekrar <= 8){
               bazCeza=3800;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
           }
            else  {
               bazCeza=18000;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
             }
        toplamCeza = bazCeza + hiz*2;
        JOptionPane.showMessageDialog(null,toplamCeza,"Toplam Ceza",JOptionPane.OK_OPTION);
       }
        
       if (hiz>=181){
            if (tekrar>=1 && tekrar <=3){
               bazCeza=1200;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
            }
            else  if (tekrar==4 || tekrar ==5){
               bazCeza=2800;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
           }
            else if (tekrar >=6 && tekrar <= 8){
               bazCeza=6500;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
           }
            else  {
               bazCeza=42000;
               JOptionPane.showMessageDialog(null,bazCeza,"Baz Ceza",JOptionPane.OK_OPTION);
             }
        toplamCeza = bazCeza + hiz*2;
        JOptionPane.showMessageDialog(null,toplamCeza,"Toplam Ceza",JOptionPane.OK_OPTION);
       }
  
    
    }
    
}
