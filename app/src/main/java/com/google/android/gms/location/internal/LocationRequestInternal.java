package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.kki;
import defpackage.kkx;
import defpackage.klu;
import defpackage.koy;
import defpackage.kpe;
import defpackage.kpg;
import defpackage.kpz;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kpz();
    LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        WorkSource workSource;
        kpe kpeVar = new kpe(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    klu.a(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            kpeVar.e = workSource;
        }
        if (z) {
            koy.a(1);
            kpeVar.b = 1;
        }
        if (z2) {
            kpg.a(2);
            kpeVar.c = 2;
        }
        if (z3) {
            kpeVar.d = true;
        }
        if (z4) {
            kpeVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            kpeVar.b(j);
        }
        this.a = kpeVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return kki.a(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, this.a, i);
        kkx.b(parcel, iA);
    }
}
