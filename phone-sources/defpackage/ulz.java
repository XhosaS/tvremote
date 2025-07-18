package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulz extends ocg {
    public static final Parcelable.Creator<ulz> CREATOR = new sct(13);
    public final Uri a;
    public final Uri b;
    public final List c;

    public ulz(Uri uri, Uri uri2, List list) {
        this.a = uri;
        this.b = uri2;
        this.c = list == null ? new ArrayList() : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, uri, i);
        ocv.N(parcel, 2, this.b, i);
        ocv.S(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
