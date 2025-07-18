package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohf extends ocg {
    public static final Parcelable.Creator<ohf> CREATOR = new odt(3);
    public final Uri a;
    public final int b;

    public ohf(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, this.a, i);
        ocv.B(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
