package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmi extends ocg {
    public static final Parcelable.Creator<nmi> CREATOR = new nld(13);
    public final int a;

    public nmi(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, i2);
        ocv.x(parcel, iV);
    }
}
