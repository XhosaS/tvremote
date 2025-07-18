package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import androidx.work.OverwritingInputMerger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guw {
    public static final String a = gpn.a("WorkSpec");
    public final String b;
    public gpx c;
    public String d;
    public String e;
    public gox f;
    public gox g;
    public long h;
    public long i;
    public long j;
    public gou k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;
    public final int s;
    public long t;
    public int u;
    public final int v;
    public String w;
    public Boolean x;
    public int y;
    public int z;

    public guw(String str, gpx gpxVar, String str2, String str3, gox goxVar, gox goxVar2, long j, long j2, long j3, gou gouVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, int i5, long j8, int i6, int i7, String str4, Boolean bool) {
        gpxVar.getClass();
        str2.getClass();
        str3.getClass();
        goxVar.getClass();
        goxVar2.getClass();
        gouVar.getClass();
        if (i2 == 0 || i3 == 0) {
            throw null;
        }
        this.b = str;
        this.c = gpxVar;
        this.d = str2;
        this.e = str3;
        this.f = goxVar;
        this.g = goxVar2;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = gouVar;
        this.l = i;
        this.y = i2;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.z = i3;
        this.r = i4;
        this.s = i5;
        this.t = j8;
        this.u = i6;
        this.v = i7;
        this.w = str4;
        this.x = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ guw f(guw guwVar, String str, gpx gpxVar, String str2, gox goxVar, int i, long j, int i2, int i3, long j2, int i4, int i5) throws Throwable {
        String str3;
        Throwable th;
        long j3;
        String str4 = (i5 & 1) != 0 ? guwVar.b : str;
        gpx gpxVar2 = (i5 & 2) != 0 ? guwVar.c : gpxVar;
        String str5 = (i5 & 4) != 0 ? guwVar.d : str2;
        String str6 = (i5 & 8) != 0 ? guwVar.e : null;
        gox goxVar2 = (i5 & 16) != 0 ? guwVar.f : goxVar;
        gox goxVar3 = (i5 & 32) != 0 ? guwVar.g : null;
        long j4 = (i5 & 64) != 0 ? guwVar.h : 0L;
        long j5 = (i5 & 128) != 0 ? guwVar.i : 0L;
        if ((i5 & 256) != 0) {
            str3 = str4;
            th = null;
            j3 = guwVar.j;
        } else {
            str3 = str4;
            th = null;
            j3 = 0;
        }
        gou gouVar = (i5 & 512) != 0 ? guwVar.k : th;
        int i6 = (i5 & 1024) != 0 ? guwVar.l : i;
        int i7 = (i5 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? guwVar.y : 0;
        long j6 = (i5 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? guwVar.m : 0L;
        long j7 = (i5 & 8192) != 0 ? guwVar.n : j;
        long j8 = (i5 & 16384) != 0 ? guwVar.o : 0L;
        long j9 = (32768 & i5) != 0 ? guwVar.p : 0L;
        boolean z = (65536 & i5) != 0 ? guwVar.q : false;
        int i8 = (131072 & i5) != 0 ? guwVar.z : 0;
        int i9 = (262144 & i5) != 0 ? guwVar.r : i2;
        int i10 = (524288 & i5) != 0 ? guwVar.s : i3;
        long j10 = (1048576 & i5) != 0 ? guwVar.t : j2;
        int i11 = (i5 & 2097152) != 0 ? guwVar.u : i4;
        int i12 = guwVar.v;
        String str7 = guwVar.w;
        Boolean bool = guwVar.x;
        str3.getClass();
        gpxVar2.getClass();
        str5.getClass();
        str6.getClass();
        goxVar2.getClass();
        goxVar3.getClass();
        gouVar.getClass();
        if (i7 == 0 || i8 == 0) {
            throw th;
        }
        return new guw(str3, gpxVar2, str5, str6, goxVar2, goxVar3, j4, j5, j3, gouVar, i6, i7, j6, j7, j8, j9, z, i8, i9, i10, j10, i11, i12, str7, bool);
    }

    public final long a() {
        return fki.aN(d(), this.l, this.y, this.m, this.n, this.r, e(), this.h, this.j, this.i, this.t);
    }

    public final void b(long j, long j2) {
        if (j < 900000) {
            gpn.b();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.i = ykn.m(j, 900000L);
        if (j2 < 300000) {
            gpn.b();
            Log.w(a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.i) {
            gpn.b();
            Log.w(a, a.cs(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.j = ykn.p(j2, 300000L, this.i);
    }

    public final boolean c() {
        return !yks.e(gou.a, this.k);
    }

    public final boolean d() {
        return this.c == gpx.a && this.l > 0;
    }

    public final boolean e() {
        return this.i != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guw)) {
            return false;
        }
        guw guwVar = (guw) obj;
        return yks.e(this.b, guwVar.b) && this.c == guwVar.c && yks.e(this.d, guwVar.d) && yks.e(this.e, guwVar.e) && yks.e(this.f, guwVar.f) && yks.e(this.g, guwVar.g) && this.h == guwVar.h && this.i == guwVar.i && this.j == guwVar.j && yks.e(this.k, guwVar.k) && this.l == guwVar.l && this.y == guwVar.y && this.m == guwVar.m && this.n == guwVar.n && this.o == guwVar.o && this.p == guwVar.p && this.q == guwVar.q && this.z == guwVar.z && this.r == guwVar.r && this.s == guwVar.s && this.t == guwVar.t && this.u == guwVar.u && this.v == guwVar.v && yks.e(this.w, guwVar.w) && yks.e(this.x, guwVar.x);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        int iK = a.k(this.h);
        int iK2 = (((((((((iHashCode * 31) + iK) * 31) + a.k(this.i)) * 31) + a.k(this.j)) * 31) + this.k.hashCode()) * 31) + this.l;
        int i = this.y;
        a.bw(i);
        int iK3 = a.k(this.m);
        int iK4 = a.k(this.n);
        int iK5 = a.k(this.o);
        int iK6 = a.k(this.p);
        int iQ = a.q(this.q);
        int i2 = this.z;
        a.bw(i2);
        int iK7 = (((((((((((((((((((((iK2 * 31) + i) * 31) + iK3) * 31) + iK4) * 31) + iK5) * 31) + iK6) * 31) + iQ) * 31) + i2) * 31) + this.r) * 31) + this.s) * 31) + a.k(this.t)) * 31) + this.u;
        String str = this.w;
        int iHashCode2 = ((((iK7 * 31) + this.v) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.x;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.b + '}';
    }

    public /* synthetic */ guw(String str, gpx gpxVar, String str2, String str3, gox goxVar, gox goxVar2, long j, long j2, long j3, gou gouVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool, int i7) {
        this(str, (i7 & 2) != 0 ? gpx.a : gpxVar, str2, (i7 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i7 & 16) != 0 ? gox.a : goxVar, (i7 & 32) != 0 ? gox.a : goxVar2, (i7 & 64) != 0 ? 0L : j, (i7 & 128) != 0 ? 0L : j2, (i7 & 256) != 0 ? 0L : j3, (i7 & 512) != 0 ? gou.a : gouVar, (i7 & 1024) != 0 ? 0 : i, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? 1 : i2, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 30000L : j4, (i7 & 8192) != 0 ? -1L : j5, (i7 & 16384) != 0 ? 0L : j6, (32768 & i7) != 0 ? -1L : j7, ((65536 & i7) == 0) & z, (131072 & i7) != 0 ? 1 : i3, (262144 & i7) != 0 ? 0 : i4, 0, (1048576 & i7) != 0 ? Long.MAX_VALUE : j8, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? false : bool);
    }
}
