package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olc extends ocg {
    public static final Parcelable.Creator<olc> CREATOR = new oeg(4);
    public final int a;
    public final String b;
    public final long c;

    public olc(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, i2);
        ocv.O(parcel, 3, this.b);
        ocv.C(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
