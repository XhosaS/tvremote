package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmh extends ocg {
    public static final Parcelable.Creator<nmh> CREATOR = new nld(12);
    public final boolean a;

    public nmh(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iV = ocv.v(parcel);
        ocv.y(parcel, 2, z);
        ocv.x(parcel, iV);
    }
}
