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
public class MAIN {

    public static void main(String[] args) {
        ArrayList<SVCN> listSVCN = new ArrayList<>();

        SVCN svcn1 = new SVCN(3.1, 9.5, "have a scholarship1", "class A1", "khanh");
        svcn1.print();
        System.out.println("=================================================");

        SVCN svcn2 = new SVCN(3.2, 9.6, "have a scholarship2", "class A2", "khanh1");
        svcn2.print();

        System.out.println("=================================================");
        SVCN svcn3 = new SVCN(3.3, 9.7, "have a scholarship3", "class A3", "khanh2");
        svcn3.print();
    }
//    public SVCN(double tuition, double averageMark, String scholarship, String className, String name) {
//        super(averageMark, scholarship, className, name);
//        this.tuition = tuition;
//    }
}
