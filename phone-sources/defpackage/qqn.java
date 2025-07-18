package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqn implements qpv {
    public static final qqn a = new qqn();
    public static final Parcelable.Creator<qqn> CREATOR = new ous(3);

    private qqn() {
    }

    @Override // defpackage.qpv
    public final String a() {
        return "signed_out";
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
        if (!(obj instanceof qqn)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1004849924;
    }

    public final String toString() {
        return "Zwieback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
