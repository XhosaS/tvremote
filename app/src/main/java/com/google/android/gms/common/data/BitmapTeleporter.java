package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kii;
import defpackage.kkk;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kii();
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            kkk.k(null);
            throw null;
        }
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.q(parcel, 2, this.b, i | 1);
        kkx.f(parcel, 3, this.c);
        kkx.b(parcel, iA);
        this.b = null;
    }
}
