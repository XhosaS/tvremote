package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onf extends ocg implements nxc {
    public static final Parcelable.Creator<onf> CREATOR = new omd(5);
    final int a;
    public int b;
    public Intent c;

    public onf(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.x(parcel, iV);
    }

    public onf() {
        this(2, 0, null);
    }
}
