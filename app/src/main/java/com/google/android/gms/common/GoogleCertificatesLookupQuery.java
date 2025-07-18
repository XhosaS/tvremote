package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kdl;
import defpackage.kkx;
import defpackage.kmc;
import defpackage.kme;
import defpackage.kmf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kdl();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        kme kmcVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            kmcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            kmcVar = iInterfaceQueryLocalInterface instanceof kme ? (kme) iInterfaceQueryLocalInterface : new kmc(iBinder);
        }
        this.d = (Context) kmf.c(kmcVar);
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        kkx.c(parcel, 2, this.b);
        kkx.c(parcel, 3, this.c);
        kkx.l(parcel, 4, new kmf(this.d));
        kkx.c(parcel, 5, this.e);
        kkx.c(parcel, 6, this.f);
        kkx.c(parcel, 8, this.g);
        kkx.b(parcel, iA);
    }
}
