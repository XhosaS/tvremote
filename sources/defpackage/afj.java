package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afj extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(2);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public afj(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = qn.h(i) - 1;
        this.d = qm.v(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return qn.h(this.c);
    }

    public final void b() {
        qm.v(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iH = qq.h(parcel);
        qq.k(parcel, 1, z);
        qq.u(parcel, 2, this.b);
        qq.m(parcel, 3, this.c);
        qq.m(parcel, 4, this.d);
        qq.n(parcel, 5, this.e);
        qq.j(parcel, iH);
    }
}
