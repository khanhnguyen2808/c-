/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_11;

import java.util.Scanner;

/**
 *
 * @author This PC
 */
public class Myaddress {
    private String province;
    private String district;
    Scanner sc=new Scanner(System.in);

    public Myaddress(String province, String district) {
        this.province = province;
        this.district = district;
    }

    public Myaddress() {
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    public void input(){
        System.out.println("province  : ");
        province=sc.nextLine();
        System.out.println("district : ");
        district=sc.nextLine();
    }

    @Override
    public String toString() {
        return  "province=" + province + ", district=" + district ;
    }

    
    
}
