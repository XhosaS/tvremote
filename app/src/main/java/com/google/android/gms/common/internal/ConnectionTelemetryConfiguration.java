package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kjg;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kjg();
    public final RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RootTelemetryConfiguration rootTelemetryConfiguration = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, rootTelemetryConfiguration, i);
        kkx.c(parcel, 2, this.b);
        kkx.c(parcel, 3, this.c);
        kkx.m(parcel, 4, this.d);
        kkx.f(parcel, 5, this.e);
        kkx.m(parcel, 6, this.f);
        kkx.b(parcel, iA);
    }
}
