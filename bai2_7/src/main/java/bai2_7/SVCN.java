/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author This PC
 */
public class SVCN extends SVTC {

    private double GPA;
    private String scholarship;

    public SVCN(double GPA, String scholarship, String name, String className, double fee) {
        super(name, className, fee);
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

    public void input() {
        super.input();
        System.out.println("input GPA : ");
        GPA = sc.nextDouble();
        sc.nextLine();
        System.out.println("input scholarship : ");
        scholarship = sc.nextLine();
    }

    public void print() {
        super.print();
        System.out.println(" GPA : " + GPA);
        System.out.println("scholarship : " + scholarship);
    }

    public void listSVCN(ArrayList<SVCN> list) {
        System.out.println("input limited number of listArray : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            SVCN o = new SVCN();
            System.out.println("svcn " + (i + 1));
            o.input();
            list.add(o);

        }
    }

    public void outList(ArrayList<SVCN> list) {
        System.out.println("=========================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("svcn " + (i + 1));
            System.out.println(list.get(i));
        }
    }

    public void compareInfor(ArrayList<SVCN> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getGPA() < list.get(j).getGPA()) {
                    Collections.swap(list, i, j);
                }
            }
        }
        outList(list);
    }

    @Override
    public String toString() {
        return "SVCN{" + super.toString() + "GPA=" + GPA + ", scholarship=" + scholarship + '}';
    }

    public void Cancel(ArrayList<SVCN> list) {

        sc.nextLine();
        int user = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {

            if (user == 1) {

                System.out.println("SVCN  " + (i + 1) + " {" + list.get(i) + " ");
            }
            if (user == 0) {

                System.out.print("Cancel !!!");
            }
        }
    }

}
