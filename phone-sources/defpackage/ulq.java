package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulq extends ocg {
    public static final Parcelable.Creator<ulq> CREATOR = new sct(12);
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public final Uri e;
    private final Bundle f;

    public ulq(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.f = bundle;
        this.e = uri;
    }

    public final Bundle a() {
        Bundle bundle = this.f;
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.O(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.C(parcel, 4, this.d);
        ocv.E(parcel, 5, a());
        ocv.N(parcel, 6, this.e, i);
        ocv.x(parcel, iV);
    }
}
