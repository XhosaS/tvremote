package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lov;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackupAndSyncOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lov();
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public BackupAndSyncOptInState(String str, int[] iArr, int i, String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.m(parcel, 2, this.b);
        kkx.f(parcel, 4, this.c);
        kkx.s(parcel, 5, this.d);
        kkx.b(parcel, iA);
    }
}
