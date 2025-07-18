package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpz();
    public final int a;
    public final String b;
    public final long c;

    public SyncStatus(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 2, i2);
        kkx.r(parcel, 3, this.b);
        kkx.g(parcel, 4, this.c);
        kkx.b(parcel, iA);
    }
}
