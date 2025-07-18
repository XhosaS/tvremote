package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrh extends ocg {
    public static final Parcelable.Creator<nrh> CREATOR = new nld(17);
    public String a;

    public nrh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nrh) {
            return nrv.i(this.a, ((nrh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.x(parcel, iV);
    }

    public nrh() {
        this(null);
    }
}
