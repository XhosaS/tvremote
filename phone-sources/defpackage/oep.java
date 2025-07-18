package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oep extends ocg {
    public static final Parcelable.Creator<oep> CREATOR = new obd(14);
    final String a;
    final String b;
    final String c;
    final String d;

    public oep(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.x(parcel, iV);
    }
}
