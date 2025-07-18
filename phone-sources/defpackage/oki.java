package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oki extends ocg {
    public static final Parcelable.Creator<oki> CREATOR = new oee(13);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public oki(String str, int i, int i2, String str2, String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oki)) {
            return false;
        }
        oki okiVar = (oki) obj;
        return this.b == okiVar.b && this.c == okiVar.c && a.Q(this.d, okiVar.d) && a.Q(this.a, okiVar.a) && a.Q(this.e, okiVar.e) && this.f == okiVar.f && this.g == okiVar.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.B(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.O(parcel, 4, this.d);
        ocv.O(parcel, 5, this.e);
        ocv.B(parcel, 6, this.f);
        ocv.C(parcel, 7, this.g);
        ocv.x(parcel, iV);
    }
}
