package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njb extends ocg {
    public static final Parcelable.Creator<njb> CREATOR = new nhv(7);
    final int a;
    public final int b;
    public final PendingIntent c;
    public final int d;
    final Bundle e;
    public final byte[] f;

    public njb(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = bundle;
        this.f = bArr;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.b);
        ocv.N(parcel, 2, this.c, i);
        ocv.B(parcel, 3, this.d);
        ocv.E(parcel, 4, this.e);
        ocv.F(parcel, 5, this.f);
        ocv.B(parcel, 1000, this.a);
        ocv.x(parcel, iV);
    }
}
