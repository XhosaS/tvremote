package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhr extends ocg {
    public static final Parcelable.Creator<nhr> CREATOR = new mur(20);
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public nhr(String str, String str2, String str3, String str4, byte[] bArr) {
        this.a = str;
        this.d = str3;
        this.c = str2;
        this.e = str4;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.O(parcel, 3, this.c);
        ocv.O(parcel, 4, this.d);
        ocv.O(parcel, 5, this.e);
        ocv.F(parcel, 6, this.b);
        ocv.x(parcel, iV);
    }
}
