package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ajh;
import defpackage.e;
import defpackage.qq;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends ajh implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new e(13);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    final List i;
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
        int iH = qq.h(parcel);
        qq.u(parcel, 2, str);
        qq.u(parcel, 3, this.b);
        qq.u(parcel, 4, this.c);
        qq.u(parcel, 5, this.d);
        qq.t(parcel, 6, this.e, i);
        qq.u(parcel, 7, this.f);
        qq.n(parcel, 8, this.g);
        qq.u(parcel, 9, this.h);
        qq.y(parcel, 10, this.i);
        qq.u(parcel, 11, this.j);
        qq.u(parcel, 12, this.k);
        qq.j(parcel, iH);
    }
}
