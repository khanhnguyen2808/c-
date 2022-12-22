/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_10;

import java.util.ArrayList;

/**
 *
 * @author This PC
 */
public class SVCN extends SVTC {

    private double GPA;
    private String scholarship;    
    
    public SVCN(double GPA, String scholarship, double tuition, String classes, String name) {
        super(tuition, classes, name);
        this.GPA = GPA;
        this.scholarship = scholarship;
    }
    
    public SVCN(double GPA, String scholarship, double tuition) {
        super(tuition);
        this.GPA = GPA;
        this.scholarship = scholarship;
    }
    
    public SVCN(double GPA, String scholarship) {
        this.GPA = GPA;
        this.scholarship = scholarship;
    }
    
    public SVCN() {
    }
    
    public double getGPA() {
        return GPA;
    }
    
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    public String getScholarship() {
        return scholarship;
    }
    
    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }
    
    @Override
    public String toString() {
        return "SVCN{" + super.toString() + "GPA=" + GPA + ", scholarship=" + scholarship + '}';
    }

    public void input() {
        super.input();
        System.out.println("GPA : ");
        GPA = sc.nextDouble();
        sc.nextLine();
        System.out.println("scholarship : ");
        scholarship = sc.nextLine();
        
    }

    public void listSVCN(ArrayList<SVCN> list) {
        System.out.println("input limited number of SVCN : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("SVCN " + (i + 1));
            SVCN svcn = new SVCN();
            svcn.input();
            list.add(svcn);
        }
    }
    public void outputListSVCN(ArrayList<SVCN> list){
        System.out.println("==================output==============");
        for(int i=0;i<list.size();i++){
            System.out.println("svcn "+(i+1));
            System.out.println(list.get(i));
        }
    } 

    
    
    
}
