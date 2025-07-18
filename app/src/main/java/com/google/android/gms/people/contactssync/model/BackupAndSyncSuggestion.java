package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.low;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackupAndSyncSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new low();
    public final int a;
    public final int b;

    public BackupAndSyncSuggestion(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 2, i2);
        kkx.f(parcel, 3, this.b);
        kkx.b(parcel, iA);
    }
}
