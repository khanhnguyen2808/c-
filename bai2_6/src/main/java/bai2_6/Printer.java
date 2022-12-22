/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_6;

/**
 *
 * @author This PC
 */
public class Printer {

    private String printerName;
    private int stockNumber;
    

    public Printer(String printerName, int stockNumber) {
        this.printerName = printerName;
        this.stockNumber = stockNumber;
       
    }

    public Printer() {
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }
    
    public int importGood(int p){
        System.out.println("quantity of goods in stock");
        return p;
    }
    public int exportGood(int p){
        System.out.println("quantity of goods exported");
        return p;
    }
    
    
    
    
}
