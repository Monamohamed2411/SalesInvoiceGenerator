package com.sig.controller;

import com.sig.modle.invoiceLine;
import com.sig.modle.invoiceHeader;
import com.sig.view.InvoiceFram;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public  class FilesManager1 implements ActionListener ,Serializable{ 

    public static void WriteFileinvoiceLine(ArrayList<invoiceLine> list1,String filepath)
    {   
        try (BufferedWriter getData1 = new BufferedWriter(new FileWriter(filepath))){
//          System.out.println(list1.get(0).getnumber());
          
          for(int i=0 ; i<list1.size() ; i++) {
            getData1.write(list1.get(i).getnumber() + ",");
            getData1.write(list1.get(i).getItem() + ",");
            getData1.write(list1.get(i).getPrice() + ",");
            getData1.write(list1.get(i).getCount()+ System.lineSeparator());
            
           }
          getData1.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesManager1.class.getName()).log(Level.SEVERE, null, ex);
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              InvoiceFram farmline =  new InvoiceFram();
              farmline.settestline(true);
                 
            
              
              
        }  
     
    }
 // Read from invoiceLine file...
    public static ArrayList<invoiceLine> ReadFileinvoiceLine(String filepath) 
    {   
        ArrayList<invoiceLine> list1 =new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> q =new ArrayList<>();
                if(line.contains(",")){
                    String lines[] = line.split(",");
                    for(String l:lines){
                        q.add(l);
                    
                    }
                }
                else if(line.contains(";")){
                    String lines[] = line.split(";");
                    for(String l:lines){
                        q.add(l);
                    
                    }
                }
                invoiceLine v =new invoiceLine();
                v.setnumber(Integer.parseInt(q.get(0)));
                v.setItem(q.get(1));
                v.setPrice(Double.parseDouble(q.get(2)));
                v.setCount(Integer.parseInt(q.get(3)));
                list1.add(v);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
             Component parentComponent = null;
//            JOptionPane.showMessageDialog(parentComponent, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return list1;
    }
    public static void WriteFileinvoiceHeader(ArrayList<invoiceHeader> list1,String filepath)
    {   
        try (BufferedWriter getData1 = new BufferedWriter(new FileWriter(filepath))){
//          System.out.println(list1.get(0).getNumber());
          
          for(int i=0 ; i<list1.size() ; i++) {
            getData1.write(list1.get(i).getNumber() + ",");
            getData1.write(list1.get(i).getInvDate() + ",");
            getData1.write(list1.get(i).getCustomer() + System.lineSeparator());
            
           }
          getData1.close();
        } catch (IOException ex) {
            Logger.getLogger(FilesManager1.class.getName()).log(Level.SEVERE, null, ex);
             Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            InvoiceFram farm =  new InvoiceFram();
              farm.settest(true);
              
             
             
          
          
            
        } 
    }
    // Read from invoiceLine file...
    public static ArrayList<invoiceHeader> ReadFileinvoiceHeader(String filepath)
    {   
        ArrayList<invoiceHeader> list1 =new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> q =new ArrayList<>();
                if(line.contains(",")){
                    String lines[] = line.split(",");
                    for(String l:lines){
                        q.add(l);
                    
                    }
                }
                else if(line.contains(";")){
                    String lines[] = line.split(";");
                    for(String l:lines){
                        q.add(l);
                    
                    }
                }
                
                invoiceHeader v =new invoiceHeader();
        
                v.setNumber(Integer.parseInt(q.get(0)));
                v.setInvDate(q.get(1));
                v.setCustomer(q.get(2));
                list1.add(v);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
           
        }
//        System.out.println(list1.get(0).getNumber());
        return list1;
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  
}
    