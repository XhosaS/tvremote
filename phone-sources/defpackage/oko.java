package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oko extends ocg {
    public static final Parcelable.Creator<oko> CREATOR = new oee(19);
    public final okl a;
    public final okm b;

    public oko(okl oklVar, okm okmVar) {
        this.a = oklVar;
        this.b = okmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oko) {
            oko okoVar = (oko) obj;
            if (a.Q(this.a, okoVar.a) && a.Q(this.b, okoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        okl oklVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, oklVar, i);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }
}
