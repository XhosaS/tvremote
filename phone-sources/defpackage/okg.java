package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okg extends ocg {
    public static final Parcelable.Creator<okg> CREATOR = new oee(11);
    public final int a;
    public final String b;
    public final oke c;

    public okg(int i, String str, oke okeVar) {
        this.a = i;
        this.b = str;
        this.c = okeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.O(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.x(parcel, iV);
    }
}
