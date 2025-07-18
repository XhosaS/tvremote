package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.keo;
import defpackage.kfc;
import defpackage.kff;
import defpackage.kkh;
import defpackage.kki;
import defpackage.kkx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, kfc {
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final ConnectionResult i;
    public static final Status a = new Status(0, null, null, null);
    public static final Status b = new Status(14, null, null, null);
    public static final Status c = new Status(8, null, null, null);
    public static final Status d = new Status(15, null, null, null);
    public static final Status e = new Status(16, null, null, null);
    public static final Parcelable.Creator CREATOR = new kff();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = connectionResult;
    }

    public final String a() {
        String str = this.g;
        return str != null ? str : keo.a(this.f);
    }

    public final boolean c() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && kki.a(this.g, status.g) && kki.a(this.h, status.h) && kki.a(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kkh.b("statusCode", a(), arrayList);
        kkh.b("resolution", this.h, arrayList);
        return kkh.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.r(parcel, 2, this.g);
        kkx.q(parcel, 3, this.h, i);
        kkx.q(parcel, 4, this.i, i);
        kkx.b(parcel, iA);
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this;
    }
}
