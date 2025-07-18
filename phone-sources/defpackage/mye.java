package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mye extends myj {
    public static final Parcelable.Creator<mye> CREATOR = new mur(7);

    public mye(ksn ksnVar, ksy ksyVar, String str, boolean z) {
        super(ksnVar, ksyVar, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
