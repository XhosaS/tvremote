package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obv extends ocg {
    public static final Parcelable.Creator<obv> CREATOR = new obd(2);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public obv(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
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
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.B(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.C(parcel, 4, this.d);
        ocv.C(parcel, 5, this.e);
        ocv.O(parcel, 6, this.f);
        ocv.O(parcel, 7, this.g);
        ocv.B(parcel, 8, this.h);
        ocv.B(parcel, 9, this.i);
        ocv.x(parcel, iV);
    }
}
