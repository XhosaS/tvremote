package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkg;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kkg();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.f(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.g(parcel, 4, this.d);
        kkx.g(parcel, 5, this.e);
        kkx.r(parcel, 6, this.f);
        kkx.r(parcel, 7, this.g);
        kkx.f(parcel, 8, this.h);
        kkx.f(parcel, 9, this.i);
        kkx.b(parcel, iA);
    }
}
