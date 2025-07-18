package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocb extends ocg {
    public static final Parcelable.Creator<ocb> CREATOR = new obd(5);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public ocb(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.y(parcel, 2, this.b);
        ocv.y(parcel, 3, this.c);
        ocv.B(parcel, 4, this.d);
        ocv.B(parcel, 5, this.e);
        ocv.x(parcel, iV);
    }
}
