package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lwd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lwd();
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.c(parcel, 2, this.a);
        kkx.c(parcel, 3, this.b);
        kkx.f(parcel, 4, this.c);
        kkx.b(parcel, iA);
    }
}
