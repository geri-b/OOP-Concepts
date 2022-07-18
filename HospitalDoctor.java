package com.company;

public class HospitalDoctor extends Doctor {

    public int staff_number;
    public int pager_number;
    public String practice;
    public String address;

    // Getter
    public int getStaff_number() {
        return staff_number;
    }
    // Setter
    public void setStaff_number(Integer newStaff_number) {
        this.staff_number = newStaff_number;
    }

    // Getter
    public int getPager_number() {
        return pager_number;
    }
    // Setter
    public void setPager_number(Integer newPager_number) {
        this.pager_number = newPager_number;
    }

    public String getPractice() {
        return practice;
    }
    // Setter
    public void setPractice(String newPractice) {
        this.practice = newPractice;
    }

    // Getter
    public String getAddress() {
        return address;
    }
    // Setter
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

}
