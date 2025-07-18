package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nhv;
import defpackage.ocg;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SignInAccount extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new nhv(10);

    @Deprecated
    final String a;
    public final GoogleSignInAccount b;

    @Deprecated
    final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        ocv.aE(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        ocv.aE(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 4, this.a);
        ocv.N(parcel, 7, this.b, i);
        ocv.O(parcel, 8, this.c);
        ocv.x(parcel, iV);
    }
}
