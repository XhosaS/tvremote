package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.ltz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ltz();
    final int a;
    public final ConnectionResult b;
    public final ResolveAccountResponse c;

    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.a = i;
        this.b = connectionResult;
        this.c = resolveAccountResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.q(parcel, 2, this.b, i);
        kkx.q(parcel, 3, this.c, i);
        kkx.b(parcel, iA);
    }
}
