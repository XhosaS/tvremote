package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nhv;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.ydk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SignInConfiguration extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new nhv(12);
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        ocv.aD(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = this.b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ydk ydkVar = new ydk((char[]) null, (byte[]) null);
        ydkVar.c(this.a);
        ydkVar.c(this.b);
        return ydkVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.N(parcel, 5, this.b, i);
        ocv.x(parcel, iV);
    }
}
