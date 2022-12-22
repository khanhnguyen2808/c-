/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_6;

/**
 *
 * @author This PC
 */
public class colorPrinter extends Printer{
    private String color;

    public colorPrinter(String color, String printerName, int stockNumber) {
        super(printerName, stockNumber);
        this.color = color;
    }

    public colorPrinter(String color) {
        this.color = color;
    }

    public colorPrinter() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
