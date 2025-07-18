package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkm;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kkm();
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.q(parcel, 2, this.b, i);
        kkx.f(parcel, 3, this.c);
        kkx.q(parcel, 4, this.d, i);
        kkx.b(parcel, iA);
    }
}
