package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ooi extends ocg {
    public static final Parcelable.Creator<ooi> CREATOR = new omd(11);
    public final boolean a;
    public final int b;

    public ooi(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.y(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
