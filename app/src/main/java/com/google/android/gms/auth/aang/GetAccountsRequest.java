package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jxb;
import defpackage.jxd;
import defpackage.jxe;
import defpackage.kkx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxe();
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;

    public GetAccountsRequest(String str, List list, List list2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public static jxd a() {
        jxb jxbVar = new jxb();
        jxbVar.c = (byte) 1;
        return jxbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.t(parcel, 2, this.b);
        kkx.t(parcel, 3, this.c);
        kkx.c(parcel, 4, this.d);
        kkx.b(parcel, iA);
    }
}
