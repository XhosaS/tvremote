package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kjf;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kjf();
    public Bundle a;
    public Feature[] b;
    int c;
    public ConnectionTelemetryConfiguration d;

    public ConnectionInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.i(parcel, 1, this.a);
        kkx.u(parcel, 2, this.b, i);
        kkx.f(parcel, 3, this.c);
        kkx.q(parcel, 4, this.d, i);
        kkx.b(parcel, iA);
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
        this.d = connectionTelemetryConfiguration;
    }
}
