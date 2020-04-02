package com.cick;

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

    void motorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        String temp = super.define_me(); // Fix this line

        System.out.println("My ancestor is a cycle who is " + temp);
    }

}

public class OOPOverriding2 {
    public static void main(String[] args) {
        MotorCycle mc = new MotorCycle();
        mc.motorCycle();
    }
}