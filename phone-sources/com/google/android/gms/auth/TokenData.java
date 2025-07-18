package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.mur;
import defpackage.ocg;
import defpackage.ocv;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenData extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new mur(16);
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        ocv.aD(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && a.Q(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && a.Q(this.f, tokenData.f) && a.Q(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.O(parcel, 2, this.b);
        ocv.M(parcel, 3, this.c);
        ocv.y(parcel, 4, this.d);
        ocv.y(parcel, 5, this.e);
        ocv.Q(parcel, 6, this.f);
        ocv.O(parcel, 7, this.g);
        ocv.x(parcel, iV);
    }
}
