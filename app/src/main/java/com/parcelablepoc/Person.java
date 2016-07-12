package com.parcelablepoc;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aalishan on 12/7/16.
 */
public class Person implements Parcelable {
    String name;
    String cellNumber;

    public Person() {
    }

    protected Person(Parcel in) {
        name = in.readString();
        cellNumber = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(cellNumber);
    }
}
