package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jxi;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jxi();
    public final String a;
    public final Oauth2TokenMetadata b;

    public GetTokenResponse(String str, Oauth2TokenMetadata oauth2TokenMetadata) {
        this.a = str;
        this.b = oauth2TokenMetadata;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.q(parcel, 2, this.b, i);
        kkx.b(parcel, iA);
    }
}
