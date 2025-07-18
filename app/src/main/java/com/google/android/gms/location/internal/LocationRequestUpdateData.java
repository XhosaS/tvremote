package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.koz;
import defpackage.kpa;
import defpackage.kpc;
import defpackage.kpi;
import defpackage.kpk;
import defpackage.kqa;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kqa();
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final kpc e;
    private final kpk f;
    private final koz g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        kpc kpaVar;
        koz kozVar;
        this.a = i;
        this.b = locationRequestInternal;
        kpk kpiVar = null;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            kpaVar = iInterfaceQueryLocalInterface instanceof kpc ? (kpc) iInterfaceQueryLocalInterface : new kpa(iBinder);
        } else {
            kpaVar = null;
        }
        this.e = kpaVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            kozVar = iInterfaceQueryLocalInterface2 instanceof koz ? (koz) iInterfaceQueryLocalInterface2 : new koz(iBinder2);
        } else {
            kozVar = null;
        }
        this.g = kozVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            kpiVar = iInterfaceQueryLocalInterface3 instanceof kpk ? (kpk) iInterfaceQueryLocalInterface3 : new kpi(iBinder3);
        }
        this.f = kpiVar;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.q(parcel, 2, this.b, i);
        kpc kpcVar = this.e;
        kkx.l(parcel, 3, kpcVar == null ? null : kpcVar.asBinder());
        kkx.q(parcel, 4, this.c, i);
        koz kozVar = this.g;
        kkx.l(parcel, 5, kozVar == null ? null : kozVar.mRemote);
        kpk kpkVar = this.f;
        kkx.l(parcel, 6, kpkVar != null ? kpkVar.asBinder() : null);
        kkx.r(parcel, 8, this.d);
        kkx.b(parcel, iA);
    }
}
