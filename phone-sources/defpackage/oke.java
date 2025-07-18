package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oke extends ocg {
    public static final Parcelable.Creator<oke> CREATOR = new oee(8);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public oke(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.B(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.B(parcel, 4, this.d);
        ocv.x(parcel, iV);
    }
}
