/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2_2;


import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class myDate {
Scanner sc=new Scanner(System.in);
    
    public int day;
    public  int month;
    public int year;

    

    public myDate() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    

    public boolean checkDate(){
        int[] dayMax={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        if(year%4==0){
            dayMax[2]=29;
        }
        if(year<0){
            return false;
        }
        if(month<0||month>13){
            return false;
        }
        
        if((day>dayMax[month])){
            return false;
        }
        return true;
    }
    public void input(){
        
        do{
            System.out.println("input day : ");
            day=sc.nextInt();
            System.out.println("input month : ");
            month=sc.nextInt();
            System.out.println("input year : ");
            year=sc.nextInt();
        }while(!checkDate());
        
    }
    public void output(){
        System.out.println(day+"-"+month+"-"+year);
    }
    

    @Override
    public String toString() {
        return  "day=" + day + ", month=" + month + ", year=" + year ;
    }
    

}
