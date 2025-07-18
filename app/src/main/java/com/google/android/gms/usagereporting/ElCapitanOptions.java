package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lvt;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lvt();
    public final boolean a;
    public final int b;

    public ElCapitanOptions(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.c(parcel, 2, this.a);
        kkx.f(parcel, 3, this.b);
        kkx.b(parcel, iA);
    }
}
