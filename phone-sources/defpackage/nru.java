package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nru extends ocg {
    public static final Parcelable.Creator<nru> CREATOR = new nld(18);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public nru(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nru)) {
            return false;
        }
        nru nruVar = (nru) obj;
        return this.a == nruVar.a && this.b == nruVar.b && this.c == nruVar.c && TextUtils.equals(this.d, nruVar.d) && TextUtils.equals(this.e, nruVar.e) && TextUtils.equals(this.f, nruVar.f) && TextUtils.equals(this.g, nruVar.g) && TextUtils.equals(this.h, nruVar.h) && this.i == nruVar.i && this.j == nruVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, i2);
        ocv.y(parcel, 3, this.b);
        ocv.y(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.O(parcel, 7, this.f);
        ocv.O(parcel, 8, this.g);
        ocv.O(parcel, 9, this.h);
        ocv.y(parcel, 10, this.i);
        ocv.y(parcel, 11, this.j);
        ocv.x(parcel, iV);
    }
}
