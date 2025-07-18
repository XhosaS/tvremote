package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aix extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(10);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public aix(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
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
        int iH = qq.h(parcel);
        qq.m(parcel, 1, i2);
        qq.m(parcel, 2, this.b);
        qq.m(parcel, 3, this.c);
        qq.n(parcel, 4, this.d);
        qq.n(parcel, 5, this.e);
        qq.u(parcel, 6, this.f);
        qq.u(parcel, 7, this.g);
        qq.m(parcel, 8, this.h);
        qq.m(parcel, 9, this.i);
        qq.j(parcel, iH);
    }
}
