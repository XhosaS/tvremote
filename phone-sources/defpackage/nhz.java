package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhz extends ocg {
    public static final Parcelable.Creator<nhz> CREATOR = new nhv(4);
    public final String a;
    public final nic b;

    public nhz(String str, nic nicVar) {
        this.a = str;
        this.b = nicVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }
}
