package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msu extends msw {
    public static final Parcelable.Creator<msu> CREATOR = new jbu(19);

    public msu(ieg iegVar, ieg iegVar2, ieg iegVar3, ieg iegVar4, ksy ksyVar, Uri uri, Uri uri2, boolean z, boolean z2) {
        super(iegVar, iegVar2, iegVar3, iegVar4, ksyVar, uri, uri2, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ktw.i(parcel, this.a);
        ktw.i(parcel, this.b);
        ktw.i(parcel, this.c);
        krh.n(this.d, parcel);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
