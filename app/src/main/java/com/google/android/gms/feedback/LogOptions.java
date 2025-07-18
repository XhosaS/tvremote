package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.knc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new knc();
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final ServiceDumpRequest[] f;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, ServiceDumpRequest[] serviceDumpRequestArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.c(parcel, 3, this.b);
        kkx.c(parcel, 4, this.c);
        kkx.c(parcel, 5, this.d);
        kkx.c(parcel, 6, this.e);
        kkx.u(parcel, 7, this.f, i);
        kkx.b(parcel, iA);
    }
}
