package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkk;
import defpackage.kkx;
import defpackage.kth;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kth();
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public AppMetadata(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.r(parcel, 3, this.b);
        kkx.r(parcel, 4, this.c);
        kkx.r(parcel, 5, this.d);
        kkx.g(parcel, 6, this.e);
        kkx.g(parcel, 7, this.f);
        kkx.r(parcel, 8, this.g);
        kkx.c(parcel, 9, this.h);
        kkx.c(parcel, 10, this.i);
        kkx.g(parcel, 11, this.j);
        kkx.r(parcel, 12, this.k);
        kkx.g(parcel, 14, this.l);
        kkx.f(parcel, 15, this.m);
        kkx.c(parcel, 16, this.n);
        kkx.c(parcel, 18, this.o);
        kkx.h(parcel, 21, this.p);
        kkx.g(parcel, 22, this.q);
        kkx.t(parcel, 23, this.r);
        kkx.r(parcel, 25, this.s);
        kkx.r(parcel, 26, this.t);
        kkx.r(parcel, 27, this.u);
        kkx.c(parcel, 28, this.v);
        kkx.g(parcel, 29, this.w);
        kkx.f(parcel, 30, this.x);
        kkx.r(parcel, 31, this.y);
        kkx.f(parcel, 32, this.z);
        kkx.g(parcel, 34, this.A);
        kkx.r(parcel, 35, this.B);
        kkx.r(parcel, 36, this.C);
        kkx.g(parcel, 37, this.D);
        kkx.f(parcel, 38, this.E);
        kkx.b(parcel, iA);
    }

    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        kkk.h(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
    }
}
