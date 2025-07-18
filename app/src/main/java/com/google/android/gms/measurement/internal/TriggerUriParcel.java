package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lhm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TriggerUriParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lhm();
    public final String a;
    public final long b;
    public final int c;

    public TriggerUriParcel(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, this.a);
        kkx.g(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.b(parcel, iA);
    }
}
