package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecordBackupSyncUserActionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpb();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kkx.b(parcel, kkx.a(parcel, 20293));
    }
}
