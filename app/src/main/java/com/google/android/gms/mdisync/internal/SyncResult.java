package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kqr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kqr();
    public final byte[] a;

    public SyncResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.j(parcel, 1, bArr);
        kkx.b(parcel, iA);
    }
}
