package com.parcelablepoc;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by aalishan on 12/7/16.
 */
public class Person2 implements Serializable {
    private String firstName;
    private String lastName;
    transient private Thread myThread;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myThread = new Thread();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName
                + "]";
    }




}
