package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohh extends ocg {
    public static final Parcelable.Creator<ohh> CREATOR = new odt(5);
    public final Uri a;
    public final Uri b;

    public ohh(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, this.a, i);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }
}
