package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npi extends ocg {
    public static final Parcelable.Creator<npi> CREATOR = new nld(16);
    public final String a;
    public final int b;
    public final String c;

    public npi(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.B(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
