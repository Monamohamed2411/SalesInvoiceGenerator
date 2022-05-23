
package com.sig.modle;

import com.sig.controller.FilesManager1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class invoiceHeader implements ActionListener ,Serializable{
    private int number;
    private String customer;
    private String invDate;
    private String filepath;
    private ArrayList<invoiceLine> lines;
    private ArrayList<invoiceHeader> Header;
    FilesManager1 n = new FilesManager1();
    
    public ArrayList<invoiceLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<invoiceLine> lines) {
        this.lines = lines;
    }
    
    public ArrayList<invoiceHeader> getHeader() {
        return Header;
    }

    public void setHeader(ArrayList<invoiceHeader> Header) {
        this.Header = Header;
    }

    public invoiceHeader() {
    }

    public invoiceHeader(int number, String customer, String invDate) {
        this.number = number;
        this.customer = customer;
        this.invDate = invDate;
    }

    public String getInvDate() {
        return invDate;
    }

    public void setInvDate(String invDate) {
        this.invDate = invDate;
    }
    
    public String getfilepath() {
        return filepath;
    }

    public void setfilepath(String filepath) {
        this.filepath = filepath;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
            
    public double getInvoiceTotal(){
        double total=0;
        for(int i=0; i<lines.size(); i++){
            total+= lines.get(i).getlineTotal();
        }
        return total;
    }
    public void WriteFileinvoiceHeader() {
        n.WriteFileinvoiceHeader(Header,filepath);
    }
  
    public void ReadFileinvoiceHeader() {
        
        Header = n.ReadFileinvoiceHeader(filepath);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String WriteFileinvoiceHeader(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
