package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.kkx;
import defpackage.kqq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kqq();
    public final byte[] a;
    public final SyncOptions b;
    public final long c;
    public final int d;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions, long j) {
        int i2;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
        } else {
            i2 = 1;
        }
        this.d = i2 != 0 ? i2 : 1;
        this.a = bArr;
        this.b = syncOptions;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2 - 1);
        kkx.j(parcel, 2, this.a);
        kkx.q(parcel, 3, this.b, i);
        kkx.g(parcel, 4, this.c);
        kkx.b(parcel, iA);
    }
}
