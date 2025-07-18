package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guv {
    public final String a;
    public final gpx b;
    public final gox c;
    public final long d;
    public final long e;
    public final long f;
    public final gou g;
    public final int h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final long m;
    public final int n;
    public final List o;
    public final List p;
    public final int q;

    public guv(String str, gpx gpxVar, gox goxVar, long j, long j2, long j3, gou gouVar, int i, int i2, long j4, long j5, int i3, int i4, long j6, int i5, List list, List list2) {
        gpxVar.getClass();
        goxVar.getClass();
        this.a = str;
        this.b = gpxVar;
        this.c = goxVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = gouVar;
        this.h = i;
        this.q = i2;
        this.i = j4;
        this.j = j5;
        this.k = i3;
        this.l = i4;
        this.m = j6;
        this.n = i5;
        this.o = list;
        this.p = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guv)) {
            return false;
        }
        guv guvVar = (guv) obj;
        return yks.e(this.a, guvVar.a) && this.b == guvVar.b && yks.e(this.c, guvVar.c) && this.d == guvVar.d && this.e == guvVar.e && this.f == guvVar.f && yks.e(this.g, guvVar.g) && this.h == guvVar.h && this.q == guvVar.q && this.i == guvVar.i && this.j == guvVar.j && this.k == guvVar.k && this.l == guvVar.l && this.m == guvVar.m && this.n == guvVar.n && yks.e(this.o, guvVar.o) && yks.e(this.p, guvVar.p);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.k(this.d)) * 31) + a.k(this.e)) * 31) + a.k(this.f)) * 31) + this.g.hashCode();
        int i = this.q;
        a.bw(i);
        return (((((((((((((((((((iHashCode * 31) + this.h) * 31) + i) * 31) + a.k(this.i)) * 31) + a.k(this.j)) * 31) + this.k) * 31) + this.l) * 31) + a.k(this.m)) * 31) + this.n) * 31) + this.o.hashCode()) * 31) + this.p.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", output=");
        sb.append(this.c);
        sb.append(", initialDelay=");
        sb.append(this.d);
        sb.append(", intervalDuration=");
        sb.append(this.e);
        sb.append(", flexDuration=");
        sb.append(this.f);
        sb.append(", constraints=");
        sb.append(this.g);
        sb.append(", runAttemptCount=");
        sb.append(this.h);
        sb.append(", backoffPolicy=");
        sb.append((Object) (this.q != 1 ? "LINEAR" : "EXPONENTIAL"));
        sb.append(", backoffDelayDuration=");
        sb.append(this.i);
        sb.append(", lastEnqueueTime=");
        sb.append(this.j);
        sb.append(", periodCount=");
        sb.append(this.k);
        sb.append(", generation=");
        sb.append(this.l);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.m);
        sb.append(", stopReason=");
        sb.append(this.n);
        sb.append(", tags=");
        sb.append(this.o);
        sb.append(", progress=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }
}
