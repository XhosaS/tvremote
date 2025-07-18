package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.kne;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kne();
    int a;
    int b;

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 2, this.a);
        kkx.f(parcel, 3, this.b);
        kkx.b(parcel, iA);
    }

    public ThemeSettings() {
        this(3, 0);
    }
}
