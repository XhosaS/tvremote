package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.krk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class InitializationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new krk();
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public InitializationParams(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.g(parcel, 1, this.a);
        kkx.g(parcel, 2, this.b);
        kkx.c(parcel, 3, this.c);
        kkx.i(parcel, 7, this.d);
        kkx.r(parcel, 8, this.e);
        kkx.b(parcel, iA);
    }
}
