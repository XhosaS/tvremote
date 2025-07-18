package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkr extends ocg {
    public static final Parcelable.Creator<nkr> CREATOR = new nhv(19);
    public final nkq a;
    public final nkq b;

    public nkr(nkq nkqVar, nkq nkqVar2) {
        this.a = nkqVar;
        this.b = nkqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkr)) {
            return false;
        }
        nkr nkrVar = (nkr) obj;
        return nrv.i(this.a, nkrVar.a) && nrv.i(this.b, nkrVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nkq nkqVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, nkqVar, i);
        ocv.N(parcel, 3, this.b, i);
        ocv.x(parcel, iV);
    }
}
