package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbv implements Parcelable {
    public static final jbu CREATOR = new jbu(0);
    public static final jbv a = new jbv("", true, false, true, false, "", false);
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public jbv(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str2;
        this.h = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbv)) {
            return false;
        }
        jbv jbvVar = (jbv) obj;
        return yks.e(this.b, jbvVar.b) && this.c == jbvVar.c && this.d == jbvVar.d && this.e == jbvVar.e && this.f == jbvVar.f && yks.e(this.g, jbvVar.g) && this.h == jbvVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.g;
        boolean z = this.f;
        boolean z2 = this.e;
        return ((((((((((iHashCode + a.q(this.c)) * 31) + a.q(this.d)) * 31) + a.q(z2)) * 31) + a.q(z)) * 31) + str.hashCode()) * 31) + a.q(this.h);
    }

    public final String toString() {
        return "PlayerErrorData(errorMessage=" + this.b + ", showText=" + this.c + ", showRetry=" + this.d + ", showGoBack=" + this.e + ", showTroubleShoot=" + this.f + ", errorTitle=" + this.g + ", isTrailer=" + this.h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
