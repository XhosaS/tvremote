package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujx extends ocg {
    public static final Parcelable.Creator<ujx> CREATOR = new sct(7);
    public final int a;

    public ujx(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.x(parcel, iV);
    }
}
