package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njx extends ocg {
    public static final Parcelable.Creator<njx> CREATOR = new nhv(14);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public njx(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njx)) {
            return false;
        }
        njx njxVar = (njx) obj;
        return nrv.i(this.b, njxVar.b) && this.a == njxVar.a && this.c == njxVar.c && this.d == njxVar.d && Arrays.equals(this.e, njxVar.e) && this.f == njxVar.f && this.g == njxVar.g;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iV = ocv.v(parcel);
        ocv.C(parcel, 2, j);
        ocv.O(parcel, 3, this.b);
        ocv.C(parcel, 4, this.c);
        ocv.y(parcel, 5, this.d);
        ocv.P(parcel, 6, this.e);
        ocv.y(parcel, 7, this.f);
        ocv.y(parcel, 8, this.g);
        ocv.x(parcel, iV);
    }
}
