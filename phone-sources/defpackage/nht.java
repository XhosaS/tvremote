package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nht extends ocg {
    public static final Parcelable.Creator<nht> CREATOR = new nhv(1);
    public final nia a;
    public final String b;

    public nht(nia niaVar, String str) {
        this.a = niaVar;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nia niaVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, niaVar, i);
        ocv.O(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
