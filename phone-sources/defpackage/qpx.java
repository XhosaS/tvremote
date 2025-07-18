package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpx implements qpv {
    public static final Parcelable.Creator<qpx> CREATOR = new omd(20);
    public final String a;
    public final long b;

    public qpx(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.qpv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.qpv
    public final /* synthetic */ boolean b() {
        return qtl.u(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpx)) {
            return false;
        }
        qpx qpxVar = (qpx) obj;
        return yks.e(this.a, qpxVar.a) && this.b == qpxVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.k(this.b);
    }

    public final String toString() {
        return "Fitbit(fitbitEncodedId=" + this.a + ", fitbitDecodedId=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
