/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class myDate {

    Scanner sc = new Scanner(System.in);

    public  int day;
    public  int month;
    public  int year;

    public myDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public myDate() {
    }

    public boolean checkDate() {
        int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("year: " + year);
        if (year % 4 == 0) {
            dayMax[2] = 29;
        }
        if (month > 13 || month < 0) {
            return false;
        }
        if (year < 0) {
            return false;
        }
       
        if ((day > dayMax[month])) {
            return false;
        }
        return true;

    }

    

        //System.out.println(day+"/"+month+"/"+year);
   
}
