package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kks;
import defpackage.kkx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kks();
    public final int a;
    public List b;

    public TelemetryData(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.v(parcel, 2, this.b);
        kkx.b(parcel, iA);
    }
}
