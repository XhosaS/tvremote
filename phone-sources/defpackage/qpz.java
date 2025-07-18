package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpz implements qpv {
    public static final Parcelable.Creator<qpz> CREATOR = new ous(1);
    public final String a;

    public qpz(String str) {
        str.getClass();
        this.a = str;
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
        return (obj instanceof qpz) && yks.e(this.a, ((qpz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gaia(accountName=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
