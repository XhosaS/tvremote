package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kfc;
import defpackage.kkx;
import defpackage.kph;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements kfc {
    public static final Parcelable.Creator CREATOR = new kph();
    public final Status a;

    public FusedLocationProviderResult(Status status) {
        this.a = status;
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, status, i);
        kkx.b(parcel, iA);
    }
}
