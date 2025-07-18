package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class onk extends ocg {
    public static final Parcelable.Creator<onk> CREATOR = new omd(7);
    final int a;
    final oby b;

    public onk(int i, oby obyVar) {
        this.a = i;
        this.b = obyVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }
}
