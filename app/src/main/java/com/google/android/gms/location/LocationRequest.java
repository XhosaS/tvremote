package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.kki;
import defpackage.kqb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new LocationRequestCreator();
    public int a;
    public long b;
    public long c;
    public int d;
    public float e;
    public boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    public final WorkSource j;
    public final ClientIdentity k;
    private long l;
    private long m;
    private long n;

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String f(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = kqb.a;
        synchronized (sb) {
            sb.setLength(0);
            kqb.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final long a() {
        if (this.a == 105) {
            return Long.MAX_VALUE;
        }
        return this.l;
    }

    public final long b() {
        long j = this.n;
        return j == -1 ? this.l : j;
    }

    public final long c() {
        long j = this.m;
        return j == -1 ? this.l : j;
    }

    public final boolean d() {
        long j = this.b;
        return j > 0 && (j >> 1) >= a();
    }

    public final boolean e() {
        return this.a == 105;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            boolean zD = d();
            if (this.a == locationRequest.a && ((e() || this.l == locationRequest.l) && c() == locationRequest.c() && zD == locationRequest.d() && ((!zD || this.b == locationRequest.b) && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.i == locationRequest.i && this.j.equals(locationRequest.j) && kki.a(this.k, locationRequest.k)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(a()), Long.valueOf(c()), this.j});
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LocationRequestCreator.writeToParcel(this, parcel, i);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        this.l = j;
        this.m = j2;
        this.b = j3;
        this.c = j4 != Long.MAX_VALUE ? Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5) : j5;
        this.d = i2;
        this.e = f;
        this.f = z;
        this.n = j6;
        this.g = i3;
        this.h = i4;
        this.i = z2;
        this.j = workSource;
        this.k = clientIdentity;
    }
}
