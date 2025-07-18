package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okc extends ocg {
    public static final Parcelable.Creator<okc> CREATOR = new oee(6);
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public okc(String str, int[] iArr, int i, String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.I(parcel, 2, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.P(parcel, 5, this.d);
        ocv.x(parcel, iV);
    }
}
