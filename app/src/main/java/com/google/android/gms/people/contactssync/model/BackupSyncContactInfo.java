package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lox;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackupSyncContactInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lox();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public BackupSyncContactInfo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.f(parcel, 2, this.b);
        kkx.f(parcel, 3, this.c);
        kkx.f(parcel, 4, this.d);
        kkx.b(parcel, iA);
    }
}
