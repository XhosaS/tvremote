package com.google.android.katniss.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lxq;
import defpackage.lxr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PermissionsText implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lxq();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final List h;

    public PermissionsText(int i, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        for (lxr lxrVar : this.h) {
            parcel.writeString(lxrVar.a);
            parcel.writeString(lxrVar.b);
            parcel.writeString(lxrVar.c);
            parcel.writeString(lxrVar.d);
        }
    }
}
