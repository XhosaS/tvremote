package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kuo;
import defpackage.kup;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EventParams extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new kup();
    public final Bundle a;

    public EventParams(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kuo(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.i(parcel, 2, a());
        kkx.b(parcel, iA);
    }
}
