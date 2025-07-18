package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oax extends ocg {
    public static final Parcelable.Creator<oax> CREATOR = new nub(20);
    Bundle a;
    nvg[] b;
    int c;
    public oay d;

    public oax() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.E(parcel, 1, this.a);
        ocv.R(parcel, 2, this.b, i);
        ocv.B(parcel, 3, this.c);
        ocv.N(parcel, 4, this.d, i);
        ocv.x(parcel, iV);
    }

    public oax(Bundle bundle, nvg[] nvgVarArr, int i, oay oayVar) {
        this.a = bundle;
        this.b = nvgVarArr;
        this.c = i;
        this.d = oayVar;
    }
}
