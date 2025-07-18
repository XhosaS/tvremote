package com.google.android.libraries.social.licenses;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tpx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class License implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new tpx();
    public final String a;
    public final long b;
    public final int c;

    public License(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((License) obj).a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof License) {
            return this.a.equals(((License) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }

    public License(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
    }
}
