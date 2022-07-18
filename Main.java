package com.company;

public class Main {

    public static void main(String[] args) {

        HospitalDoctor myHospitalDoc = new HospitalDoctor();
        myHospitalDoc.setName("John Doe");
        myHospitalDoc.setPhone_number(216010102);
        myHospitalDoc.setEmail("johndoe@gmail.com");
        myHospitalDoc.Register();
        myHospitalDoc.setPager_number(24);
        myHospitalDoc.setStaff_number(77);
        myHospitalDoc.setPractice("Cleveland Clinic, OH");
        myHospitalDoc.setAddress("Euclid Ave, Cleveland, OH");


        System.out.println("Name of the doctor is " + myHospitalDoc.getName());
        System.out.println("You can reach him out at his/her phone number -> " + myHospitalDoc.getPhone_number());
        System.out.println("You can reach him/her out at the email address ->" + myHospitalDoc.getEmail());
        System.out.println("Doctor's pager number is " + myHospitalDoc.getPager_number());
        System.out.println("Doctors staff number is " + myHospitalDoc.getStaff_number());
        System.out.println("Doctor completed his practice at " + myHospitalDoc.getPractice());
        System.out.println("The practice was held at " + myHospitalDoc.getAddress() );

    }


}

