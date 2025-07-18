package com.google.android.apps.tvsearch.common.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fek;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ParcelableByteArray implements Parcelable {
    public static final Parcelable.Creator CREATOR = new fek();
    final byte[] a;

    public ParcelableByteArray(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }
}
