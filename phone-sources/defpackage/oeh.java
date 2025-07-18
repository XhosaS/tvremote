package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oeh extends ocg {
    public static final Parcelable.Creator<oeh> CREATOR = new obd(10);
    public int a;
    public int b;

    public oeh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }

    public oeh() {
        this(3, 0);
    }
}
