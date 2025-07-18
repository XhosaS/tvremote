package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.obd;
import defpackage.ocg;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ND4CSettings extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<ND4CSettings> CREATOR = new obd(13);
    boolean a;
    String b;

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.y(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
