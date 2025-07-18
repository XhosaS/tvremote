package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.ktt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BatchUploadStatusParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ktt();
    public final long a;
    public final int b;
    public final long c;

    public BatchUploadStatusParcel(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.g(parcel, 1, this.a);
        kkx.f(parcel, 2, this.b);
        kkx.g(parcel, 3, this.c);
        kkx.b(parcel, iA);
    }
}
