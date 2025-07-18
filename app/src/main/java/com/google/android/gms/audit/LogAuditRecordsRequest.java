package com.google.android.gms.audit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jwc;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LogAuditRecordsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jwc();
    public final int a;
    public final int b;
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public LogAuditRecordsRequest(int i, int i2, String str, byte[][] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.f(parcel, 2, this.b);
        kkx.r(parcel, 3, this.c);
        kkx.k(parcel, 4, this.d);
        kkx.j(parcel, 5, this.e);
        kkx.j(parcel, 6, this.f);
        kkx.b(parcel, iA);
    }
}
