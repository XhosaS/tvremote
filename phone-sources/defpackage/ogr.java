package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogr extends ocg {
    public static final Parcelable.Creator<ogr> CREATOR = new obd(20);
    public final byte[] a;
    public final ogm b;
    public final long c;
    public final int d;

    public ogr(int i, byte[] bArr, ogm ogmVar, long j) {
        int iAL = a.aL(i);
        this.d = iAL == 0 ? 1 : iAL;
        this.a = bArr;
        this.b = ogmVar;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d - 1;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.F(parcel, 2, this.a);
        ocv.N(parcel, 3, this.b, i);
        ocv.C(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
