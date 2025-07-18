package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktx extends kxb {
    public static final Parcelable.Creator<ktx> CREATOR = new jbu(9);

    public ktx(String str, ksy ksyVar, Uri uri, Uri uri2) {
        super(str, ksyVar, uri, uri2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
