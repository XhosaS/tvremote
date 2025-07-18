package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jwz;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppRestriction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jwz();
    public final AppRestrictionState a;
    public final AppRestrictionInfo b;

    public AppRestriction(AppRestrictionState appRestrictionState, AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppRestrictionState appRestrictionState = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, appRestrictionState, i);
        kkx.q(parcel, 2, this.b, i);
        kkx.b(parcel, iA);
    }
}
