package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocd extends ocg {
    public static final Parcelable.Creator<ocd> CREATOR = new obd(6);
    public final int a;
    public List b;

    public ocd(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.S(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
