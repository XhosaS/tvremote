package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oev extends ocg {
    public static final Parcelable.Creator<oev> CREATOR = new obd(15);
    final int a;
    final String b;
    final Intent c;

    public oev(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.N(parcel, 4, this.c, i);
        ocv.x(parcel, iV);
    }
}
