package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clc {
    public final String a;
    public final ccq b;
    public final caz c;
    public final long d;
    public final long e;
    public final long f;
    public final caq g;
    public final int h;
    public final cah i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public clc(String str, ccq ccqVar, caz cazVar, long j, long j2, long j3, caq caqVar, int i, cah cahVar, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        ccqVar.getClass();
        cazVar.getClass();
        cahVar.getClass();
        this.a = str;
        this.b = ccqVar;
        this.c = cazVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = caqVar;
        this.h = i;
        this.i = cahVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clc)) {
            return false;
        }
        clc clcVar = (clc) obj;
        return agvy.c(this.a, clcVar.a) && this.b == clcVar.b && agvy.c(this.c, clcVar.c) && this.d == clcVar.d && this.e == clcVar.e && this.f == clcVar.f && agvy.c(this.g, clcVar.g) && this.h == clcVar.h && this.i == clcVar.i && this.j == clcVar.j && this.k == clcVar.k && this.l == clcVar.l && this.m == clcVar.m && this.n == clcVar.n && this.o == clcVar.o && agvy.c(this.p, clcVar.p) && agvy.c(this.q, clcVar.q);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        long j = this.f;
        long j2 = this.e;
        long j3 = this.d;
        long j4 = j2 ^ (j2 >>> 32);
        int iHashCode2 = (((((((((((iHashCode * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) j4)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i.hashCode();
        long j5 = this.n;
        long j6 = this.k;
        long j7 = this.j;
        long j8 = j5 ^ (j5 >>> 32);
        return (((((((((((((((iHashCode2 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.l) * 31) + this.m) * 31) + ((int) j8)) * 31) + this.o) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
