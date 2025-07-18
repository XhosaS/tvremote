package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogt extends ocg {
    public static final Parcelable.Creator<ogt> CREATOR = new odt(2);
    public final Uri a;

    public ogt(Uri uri) {
        this.a = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, this.a, i);
        ocv.x(parcel, iV);
    }
}
