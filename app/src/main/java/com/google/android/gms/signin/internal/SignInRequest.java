package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lty;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lty();
    final int a;
    final ResolveAccountRequest b;

    public SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.a = i;
        this.b = resolveAccountRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.q(parcel, 2, this.b, i);
        kkx.b(parcel, iA);
    }
}
