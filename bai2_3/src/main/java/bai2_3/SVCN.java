/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_3;

import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class SVCN extends SVNH{
    private double tuition;

    public SVCN(double tuition, double averageMark, String scholarship, String className, String name) {
        super(averageMark, scholarship, className, name);
        this.tuition = tuition;
    }

    public SVCN(double tuition, double averageMark, String scholarship) {
        super(averageMark, scholarship);
        this.tuition = tuition;
    }

    public SVCN(double tuition) {
        this.tuition = tuition;
    }

    public SVCN() {
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }
    public void print (){
        super.print();
        System.out.println("the tution is  : "+tuition);
    }

    void add(ArrayList<SVCN> listSVCN) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "SVCN{"+super.toString() + "tuition=" + tuition + '}';
    }
    
}
