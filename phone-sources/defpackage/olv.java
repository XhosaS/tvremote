package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olv extends ocg {
    public static final Parcelable.Creator<olv> CREATOR = new oeg(18);
    public final byte[] a;

    public olv(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.F(parcel, 2, this.a);
        ocv.x(parcel, iV);
    }
}
