package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaqb;
import defpackage.kkx;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaqb();
    public final Bundle a;
    public Map b;

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.i(parcel, 2, this.a);
        kkx.b(parcel, iA);
    }
}
