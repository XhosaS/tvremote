package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jxf;
import defpackage.kkx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetAccountsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxf();
    public final List a;
    public final List b;

    public GetAccountsResponse(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.v(parcel, 1, list);
        kkx.v(parcel, 2, this.b);
        kkx.b(parcel, iA);
    }
}
