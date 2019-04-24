package com.xibei.binderdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Xibei on 2019/4/24.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class Animal implements Parcelable {

    private String name;

    private int legsNumber;


    protected Animal(Parcel in) {
        name = in.readString();
        legsNumber = in.readInt();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(legsNumber);
    }
}
