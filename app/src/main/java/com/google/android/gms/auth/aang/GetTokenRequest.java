package com.google.android.gms.auth.aang;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jxh;
import defpackage.kkx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxh();
    public final GoogleAccount a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;
    public final Network m;

    public GetTokenRequest(GoogleAccount googleAccount, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2, Network network) {
        this.a = googleAccount;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
        this.m = network;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, googleAccount, i);
        kkx.r(parcel, 2, this.b);
        kkx.t(parcel, 3, this.c);
        kkx.t(parcel, 4, this.d);
        kkx.t(parcel, 5, this.e);
        kkx.t(parcel, 6, this.f);
        kkx.f(parcel, 7, this.g);
        kkx.r(parcel, 8, this.h);
        kkx.c(parcel, 9, this.i);
        kkx.j(parcel, 10, this.j);
        kkx.r(parcel, 11, this.k);
        kkx.c(parcel, 12, this.l);
        kkx.q(parcel, 13, this.m, i);
        kkx.b(parcel, iA);
    }
}
