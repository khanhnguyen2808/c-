/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_6;

/**
 *
 * @author This PC
 */
public class Laser extends Printer{
    private String DPI;

    public Laser(String DPI, String printerName, int stockNumber) {
        super(printerName, stockNumber);
        this.DPI = DPI;
    }

    public Laser(String DPI) {
        this.DPI = DPI;
    }

    public Laser() {
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }
    
}
