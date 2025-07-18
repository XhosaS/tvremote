package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvw extends ocg {
    public static final Parcelable.Creator<nvw> CREATOR = new nub(10);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public nvw(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = npj.s(i) - 1;
        this.d = npj.t(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return npj.s(this.c);
    }

    public final void b() {
        npj.t(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, z);
        ocv.O(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.B(parcel, 4, this.d);
        ocv.C(parcel, 5, this.e);
        ocv.x(parcel, iV);
    }
}
