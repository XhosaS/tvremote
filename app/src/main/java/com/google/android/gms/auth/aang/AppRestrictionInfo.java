package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jxa;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppRestrictionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxa();
    public final String a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public AppRestrictionInfo(String str, String str2, String str3, String str4, byte[] bArr) {
        this.a = str;
        this.d = str3;
        this.c = str2;
        this.e = str4;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.r(parcel, 3, this.c);
        kkx.r(parcel, 4, this.d);
        kkx.r(parcel, 5, this.e);
        kkx.j(parcel, 6, this.b);
        kkx.b(parcel, iA);
    }
}
