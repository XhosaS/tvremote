package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jxl;
import defpackage.kkx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Oauth2TokenMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxl();
    public final Long a;
    public final List b;

    public Oauth2TokenMetadata(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.p(parcel, 1, l);
        kkx.t(parcel, 2, this.b);
        kkx.b(parcel, iA);
    }
}
