package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ods extends ocg {
    public static final odt CREATOR = new odt(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public ods(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.E(parcel, 7, this.f);
        ocv.x(parcel, iV);
    }
}
