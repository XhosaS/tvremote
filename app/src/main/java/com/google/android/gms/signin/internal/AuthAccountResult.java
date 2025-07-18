package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kfc;
import defpackage.kkx;
import defpackage.ltr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements kfc {
    public static final Parcelable.Creator CREATOR = new ltr();
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.f(parcel, 2, this.b);
        kkx.q(parcel, 3, this.c, i);
        kkx.b(parcel, iA);
    }

    public AuthAccountResult() {
        this(2, 0, null);
    }
}
