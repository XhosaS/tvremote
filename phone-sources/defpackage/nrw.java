package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrw extends ocg {
    public static final Parcelable.Creator<nrw> CREATOR = new nld(19);
    public double a;
    public boolean b;
    public int c;
    public njz d;
    public int e;
    public nkr f;
    public double g;

    public nrw(double d, boolean z, int i, njz njzVar, int i2, nkr nkrVar, double d2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = njzVar;
        this.e = i2;
        this.f = nkrVar;
        this.g = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nrw)) {
            return false;
        }
        nrw nrwVar = (nrw) obj;
        if (this.a == nrwVar.a && this.b == nrwVar.b && this.c == nrwVar.c && nrv.i(this.d, nrwVar.d) && this.e == nrwVar.e) {
            nkr nkrVar = this.f;
            if (nrv.i(nkrVar, nkrVar) && this.g == nrwVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.z(parcel, 2, this.a);
        ocv.y(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.N(parcel, 5, this.d, i);
        ocv.B(parcel, 6, this.e);
        ocv.N(parcel, 7, this.f, i);
        ocv.z(parcel, 8, this.g);
        ocv.x(parcel, iV);
    }

    public nrw() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }
}
