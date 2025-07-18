package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.nub;
import defpackage.nve;
import defpackage.nxc;
import defpackage.ocg;
import defpackage.ocv;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Status extends ocg implements ReflectedParcelable, nxc {
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final nve i;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new nub(15);

    public Status(int i, String str, PendingIntent pendingIntent, nve nveVar) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = nveVar;
    }

    public final String a() {
        String str = this.g;
        return str != null ? str : ocv.aM(this.f);
    }

    public final boolean b() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && a.Q(this.g, status.g) && a.Q(this.h, status.h) && a.Q(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ocv.aK("statusCode", a(), arrayList);
        ocv.aK("resolution", this.h, arrayList);
        return ocv.aJ(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.O(parcel, 2, this.g);
        ocv.N(parcel, 3, this.h, i);
        ocv.N(parcel, 4, this.i, i);
        ocv.x(parcel, iV);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    @Override // defpackage.nxc
    public final Status e() {
        return this;
    }
}
