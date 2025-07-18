package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.obd;
import defpackage.ocg;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TogglingData extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<TogglingData> CREATOR = new obd(16);
    String a;
    String b;
    public String c;

    private TogglingData() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
