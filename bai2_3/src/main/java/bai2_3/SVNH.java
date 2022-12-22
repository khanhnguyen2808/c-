/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_3;

/**
 *
 * @author This PC
 */
public class SVNH extends SV {

    private double averageMark;
    private String scholarship;

    public SVNH(double averageMark, String scholarship, String className, String name) {
        super(className, name);
        this.averageMark = averageMark;
        this.scholarship = scholarship;
    }

    public SVNH(double averageMark, String scholarship) {
        this.averageMark = averageMark;
        this.scholarship = scholarship;
    }

    public SVNH() {
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public void print() {
        super.print();
        System.out.println("averageMark : " + averageMark);
        System.out.println("scholarship : " + scholarship);
    }

    @Override
    public String toString() {
        return "SVNH{"+super.toString() + "averageMark=" + averageMark + ", scholarship=" + scholarship + '}';
    }

}
