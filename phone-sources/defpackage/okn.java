package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okn extends ocg {
    public static final Parcelable.Creator<okn> CREATOR = new oee(18);
    public final long a;

    public okn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okn) && this.a == ((okn) obj).a;
    }

    public final int hashCode() {
        return a.k(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iV = ocv.v(parcel);
        ocv.C(parcel, 1, j);
        ocv.x(parcel, iV);
    }
}
