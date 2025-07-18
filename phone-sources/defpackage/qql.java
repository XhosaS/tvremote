package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qql implements qpv {
    public static final qql a = new qql();
    public static final Parcelable.Creator<qql> CREATOR = new ous(2);

    private qql() {
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
        if (!(obj instanceof qql)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436297177;
    }

    public final String toString() {
        return "YouTubeVisitor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
