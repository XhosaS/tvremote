package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kpc;
import defpackage.kpy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kpy();
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public LocationReceiver(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    public static LocationReceiver a(IInterface iInterface, kpc kpcVar, String str) {
        return new LocationReceiver(1, iInterface != null ? iInterface.asBinder() : null, kpcVar.asBinder(), null, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.l(parcel, 2, this.b);
        kkx.l(parcel, 3, this.c);
        kkx.q(parcel, 4, this.d, i);
        kkx.r(parcel, 6, this.e);
        kkx.b(parcel, iA);
    }
}
