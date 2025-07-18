package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogs extends ocg {
    public static final Parcelable.Creator<ogs> CREATOR = new odt(1);
    public final byte[] a;

    public ogs(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iV = ocv.v(parcel);
        ocv.F(parcel, 1, bArr);
        ocv.x(parcel, iV);
    }
}
