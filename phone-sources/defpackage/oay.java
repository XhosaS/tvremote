package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oay extends ocg {
    public static final Parcelable.Creator<oay> CREATOR = new obd(1);
    public final ocb a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public oay(ocb ocbVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = ocbVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ocb ocbVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, ocbVar, i);
        ocv.y(parcel, 2, this.b);
        ocv.y(parcel, 3, this.c);
        ocv.I(parcel, 4, this.d);
        ocv.B(parcel, 5, this.e);
        ocv.I(parcel, 6, this.f);
        ocv.x(parcel, iV);
    }
}
