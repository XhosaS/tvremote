package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kty extends kxg {
    public static final Parcelable.Creator<kty> CREATOR = new jbu(10);

    public kty(vsz vszVar, kuf kufVar, ksr ksrVar, Uri uri, int i, long j, boolean z) {
        super(vszVar, kufVar, ksrVar, uri, i, j, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
