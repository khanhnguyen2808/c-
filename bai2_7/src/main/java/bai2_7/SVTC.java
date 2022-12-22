/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_7;

/**
 *
 * @author This PC
 */
public class SVTC extends SV{
    private double fee;

    public SVTC(String name, String className, double fee) {
        super(name, className);
        this.fee=fee;
    }

    public SVTC() {
    }
    public void input(){
        super.input();
        System.out.println("the fee : ");
        fee=sc.nextDouble();
        
    }
    public void print(){
        super.print();
        System.out.println("the fee : "+fee);
    }

    @Override
    public String toString() {
        return super.toString()+ "fee=" + fee +" ";
    }
    
}
