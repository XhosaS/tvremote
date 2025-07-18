package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kqh;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kqh();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kkx.b(parcel, kkx.a(parcel, 20293));
    }
}
