/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator1;

/**
 *
 * @author aashgar
 */
public class PartTime extends Clerk {

    public PartTime(Employee employee) {
        super(employee);

    }

    @Override
    public void view() {
        super.view();
        System.out.println("Clerk PartTime.");
    }
}
