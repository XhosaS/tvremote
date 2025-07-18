package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njo extends ocg {
    public static final Parcelable.Creator<njo> CREATOR = new nhv(11);
    final int a;
    public final int b;
    public final Bundle c;

    public njo(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.E(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
