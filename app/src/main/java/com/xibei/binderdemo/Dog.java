package com.xibei.binderdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Xibei on 2019/5/7.
 * Github: https://github.com/jiezongnewstar
 * Email: ibossjia@gmail.com
 * Deeclaration:
 */
public class Dog implements Parcelable {

    public String name;

    public int legs;

    protected Dog(Parcel in) {
        name = in.readString();
        legs = in.readInt();
    }

    public static final Creator<Dog> CREATOR = new Creator<Dog>() {
        @Override
        public Dog createFromParcel(Parcel in) {
            return new Dog(in);
        }

        @Override
        public Dog[] newArray(int size) {
            return new Dog[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(legs);
    }
}
