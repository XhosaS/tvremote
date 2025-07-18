package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lhq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UploadBatchParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lhq();
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public UploadBatchParcel(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.g(parcel, 1, this.a);
        kkx.j(parcel, 2, this.b);
        kkx.r(parcel, 3, this.c);
        kkx.i(parcel, 4, this.d);
        kkx.f(parcel, 5, this.e);
        kkx.g(parcel, 6, this.f);
        kkx.r(parcel, 7, this.g);
        kkx.b(parcel, iA);
    }
}
