package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kaw;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DataCollectionIdentifierParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kaw();
    public final int a;
    public final int b;
    public final int c;

    public DataCollectionIdentifierParcelable(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.f(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.b(parcel, iA);
    }
}
