package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.loz;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedSyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new loz();
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public ExtendedSyncStatus(int i, String str, long j, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final String toString() {
        return String.format(Locale.US, "ExtendedSyncStatus{code=%d, message=%s, lastSyncTimeMillis=%d, numOfItems=%d, syncStage=%d, dataType=%d, cycleStatus=%d, numOfSyncedItems=%d, numOfTotalItems=%d}", Integer.valueOf(this.a), this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 2, i2);
        kkx.r(parcel, 3, this.b);
        kkx.g(parcel, 4, this.c);
        kkx.f(parcel, 5, this.d);
        kkx.f(parcel, 6, this.e);
        kkx.f(parcel, 7, this.f);
        kkx.f(parcel, 8, this.g);
        kkx.f(parcel, 9, this.h);
        kkx.f(parcel, 10, this.i);
        kkx.b(parcel, iA);
    }
}
