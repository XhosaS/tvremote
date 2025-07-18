package com.google.android.gms.googlehelp.trails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.obd;
import defpackage.ocg;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailsInteraction extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<TrailsInteraction> CREATOR = new obd(17);
    public final String a;
    public final long b;
    public final String c;

    public TrailsInteraction(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.C(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
