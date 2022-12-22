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
public class MAIN {

    public static void main(String[] args) {
        ArrayList<SVCN> listSVCN = new ArrayList<>();
        SVCN svcn = new SVCN();

        svcn.listSVCN(listSVCN);
        svcn.outputListSVCN(listSVCN);
        svcn.sort(listSVCN);
        svcn.outputListSVCN(listSVCN);

    }
}
