package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nub;
import defpackage.ocg;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BitmapTeleporter extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new nub(16);
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
            ocv.aF(null);
            throw null;
        }
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i | 1);
        ocv.B(parcel, 3, this.c);
        ocv.x(parcel, iV);
        this.b = null;
    }
}
