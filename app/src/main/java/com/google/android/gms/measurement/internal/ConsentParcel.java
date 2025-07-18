package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kua;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ConsentParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kua();
    public final Bundle a;

    public ConsentParcel(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kua.a(this, parcel);
    }
}
