package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kcu;
import defpackage.kdm;
import defpackage.kdq;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kdm();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = kdq.a(i) - 1;
        this.d = kcu.a(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.c(parcel, 1, z);
        kkx.r(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.f(parcel, 4, this.d);
        kkx.g(parcel, 5, this.e);
        kkx.b(parcel, iA);
    }
}
