
package com.sig.modle;

import com.sig.controller.FilesManager1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;


public class invoiceLine implements ActionListener ,Serializable{
     private String item;
     private double price;
     private int count;
     private int number;
     private String filepath;
     private invoiceHeader header;
     private ArrayList<invoiceLine> lines;
     FilesManager1 n = new FilesManager1();
    
    public ArrayList<invoiceLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<invoiceLine> lines) {
        this.lines = lines;
    }

    public invoiceLine() {
    }

    public invoiceLine(String item, double price, int count, invoiceHeader header) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.header = header;
    }

    public invoiceHeader getHeader() {
        return header;
    }

    public void setHeader(invoiceHeader header) {
        this.header = header;
    }
    
    public String getfilepath() {
        return filepath;
    }

    public void setfilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
    public int getnumber() {
        return number;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
     
     public double getlineTotal(){
     return price*count;
     }
    public void WriteFileinvoiceLines() {
        n.WriteFileinvoiceLine(lines,filepath);
    }
    public void ReadFileinvoiceLines() {
        lines = n.ReadFileinvoiceLine(filepath);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
