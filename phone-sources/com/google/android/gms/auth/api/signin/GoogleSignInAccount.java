package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nhv;
import defpackage.ocg;
import defpackage.ocv;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new nhv(8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    public final List i;
    public final String j;
    public final String k;
    private final Set l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = list;
        this.j = str7;
        this.k = str8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.h.equals(this.h) && googleSignInAccount.a().equals(a());
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.N(parcel, 6, this.e, i);
        ocv.O(parcel, 7, this.f);
        ocv.C(parcel, 8, this.g);
        ocv.O(parcel, 9, this.h);
        ocv.S(parcel, 10, this.i);
        ocv.O(parcel, 11, this.j);
        ocv.O(parcel, 12, this.k);
        ocv.x(parcel, iV);
    }
}
