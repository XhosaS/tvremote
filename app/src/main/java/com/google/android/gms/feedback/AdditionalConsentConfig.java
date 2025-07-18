package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kmy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AdditionalConsentConfig extends AbstractSafeParcelable {
    public static final kmy CREATOR = new kmy();
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public AdditionalConsentConfig(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.r(parcel, 3, this.b);
        kkx.r(parcel, 4, this.c);
        kkx.r(parcel, 5, this.d);
        kkx.r(parcel, 6, this.e);
        kkx.i(parcel, 7, this.f);
        kkx.b(parcel, iA);
    }
}
