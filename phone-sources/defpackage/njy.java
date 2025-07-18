package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njy extends ocg {
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public static final nsf a = new nsf("AdBreakStatus");
    public static final Parcelable.Creator<njy> CREATOR = new nhv(15);

    public njy(long j, long j2, String str, String str2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njy)) {
            return false;
        }
        njy njyVar = (njy) obj;
        return this.b == njyVar.b && this.c == njyVar.c && nrv.i(this.d, njyVar.d) && nrv.i(this.e, njyVar.e) && this.f == njyVar.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int iV = ocv.v(parcel);
        ocv.C(parcel, 2, j);
        ocv.C(parcel, 3, this.c);
        ocv.O(parcel, 4, this.d);
        ocv.O(parcel, 5, this.e);
        ocv.C(parcel, 6, this.f);
        ocv.x(parcel, iV);
    }
}
