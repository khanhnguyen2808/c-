/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_10;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author This PC
 */
public class SVTC extends SV {

    private double tuition;

    public SVTC(double tuition, String classes, String name) {
        super(classes, name);
        this.tuition = tuition;
    }

    public SVTC(double tuition) {
        this.tuition = tuition;
    }

    public SVTC() {
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public void input() {
        super.input();
        System.out.println("tuition : ");
        tuition = sc.nextDouble();

    }

    public void listSVTC(ArrayList<SVTC> list) {
        System.out.println("input limited number of listSVTC: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("input SVTC " + (i + 1));
            SVTC svtc = new SVTC();
            svtc.input();
            list.add(svtc);
        }
    }

    @Override
    public String toString() {
        return "SVTC{" + super.toString() + "tuition=" + tuition + '}';
    }

    public void sort(ArrayList<SVCN> list) {
        System.out.println("after sorting base on tuition : ");

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getTuition() < list.get(j).getTuition()) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    

}
