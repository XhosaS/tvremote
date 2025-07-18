package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpa;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GetBackupSyncSuggestionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpa();
    public final int a;
    public final String b;
    public final BackupSyncContactInfo c;

    public GetBackupSyncSuggestionResponse(int i, String str, BackupSyncContactInfo backupSyncContactInfo) {
        this.a = i;
        this.b = str;
        this.c = backupSyncContactInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.r(parcel, 2, this.b);
        kkx.q(parcel, 3, this.c, i);
        kkx.b(parcel, iA);
    }
}
