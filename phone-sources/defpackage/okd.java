package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okd extends ocg {
    public static final Parcelable.Creator<okd> CREATOR = new oee(7);
    public final int a;
    public final int b;

    public okd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, i2);
        ocv.B(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
