package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oec extends ocg {
    public static final Parcelable.Creator<oec> CREATOR = new obd(9);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final oef[] f;

    public oec(String str, boolean z, boolean z2, boolean z3, boolean z4, oef[] oefVarArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = oefVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.y(parcel, 3, this.b);
        ocv.y(parcel, 4, this.c);
        ocv.y(parcel, 5, this.d);
        ocv.y(parcel, 6, this.e);
        ocv.R(parcel, 7, this.f, i);
        ocv.x(parcel, iV);
    }
}
