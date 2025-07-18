package defpackage;

import android.util.Log;
import androidx.work.OverwritingInputMerger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cld {
    public static final cla a = new cla();
    public static final String b = cbx.d("WorkSpec");
    public int A;
    public final String c;
    public ccq d;
    public String e;
    public String f;
    public caz g;
    public caz h;
    public long i;
    public long j;
    public long k;
    public caq l;
    public int m;
    public cah n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public int t;
    public final int u;
    public long v;
    public int w;
    public final int x;
    public String y;
    public Boolean z;

    public cld(String str, ccq ccqVar, String str2, String str3, caz cazVar, caz cazVar2, long j, long j2, long j3, caq caqVar, int i, cah cahVar, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool) {
        ccqVar.getClass();
        str2.getClass();
        str3.getClass();
        cazVar.getClass();
        cazVar2.getClass();
        caqVar.getClass();
        cahVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        this.c = str;
        this.d = ccqVar;
        this.e = str2;
        this.f = str3;
        this.g = cazVar;
        this.h = cazVar2;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = caqVar;
        this.m = i;
        this.n = cahVar;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = z;
        this.A = i2;
        this.t = i3;
        this.u = i4;
        this.v = j8;
        this.w = i5;
        this.x = i6;
        this.y = str4;
        this.z = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ cld f(cld cldVar, String str, ccq ccqVar, String str2, caz cazVar, int i, long j, int i2, int i3, long j2, int i4, int i5) throws Throwable {
        String str3;
        Throwable th;
        long j3;
        String str4 = (i5 & 1) != 0 ? cldVar.c : str;
        ccq ccqVar2 = (i5 & 2) != 0 ? cldVar.d : ccqVar;
        String str5 = (i5 & 4) != 0 ? cldVar.e : str2;
        String str6 = (i5 & 8) != 0 ? cldVar.f : null;
        caz cazVar2 = (i5 & 16) != 0 ? cldVar.g : cazVar;
        caz cazVar3 = (i5 & 32) != 0 ? cldVar.h : null;
        long j4 = (i5 & 64) != 0 ? cldVar.i : 0L;
        long j5 = (i5 & 128) != 0 ? cldVar.j : 0L;
        if ((i5 & 256) != 0) {
            str3 = str4;
            th = null;
            j3 = cldVar.k;
        } else {
            str3 = str4;
            th = null;
            j3 = 0;
        }
        caq caqVar = (i5 & 512) != 0 ? cldVar.l : th;
        int i6 = (i5 & 1024) != 0 ? cldVar.m : i;
        cah cahVar = (i5 & 2048) != 0 ? cldVar.n : th;
        long j6 = (i5 & 4096) != 0 ? cldVar.o : 0L;
        long j7 = (i5 & 8192) != 0 ? cldVar.p : j;
        long j8 = (i5 & 16384) != 0 ? cldVar.q : 0L;
        long j9 = (32768 & i5) != 0 ? cldVar.r : 0L;
        boolean z = (65536 & i5) != 0 ? cldVar.s : false;
        int i7 = (131072 & i5) != 0 ? cldVar.A : 0;
        int i8 = (262144 & i5) != 0 ? cldVar.t : i2;
        int i9 = (524288 & i5) != 0 ? cldVar.u : i3;
        long j10 = (1048576 & i5) != 0 ? cldVar.v : j2;
        int i10 = (i5 & 2097152) != 0 ? cldVar.w : i4;
        int i11 = cldVar.x;
        String str7 = cldVar.y;
        Boolean bool = cldVar.z;
        str3.getClass();
        ccqVar2.getClass();
        str5.getClass();
        str6.getClass();
        cazVar2.getClass();
        cazVar3.getClass();
        caqVar.getClass();
        cahVar.getClass();
        if (i7 != 0) {
            return new cld(str3, ccqVar2, str5, str6, cazVar2, cazVar3, j4, j5, j3, caqVar, i6, cahVar, j6, j7, j8, j9, z, i7, i8, i9, j10, i10, i11, str7, bool);
        }
        throw th;
    }

    public final long a() {
        return a.a(d(), this.m, this.n, this.o, this.p, this.t, e(), this.i, this.k, this.j, this.v);
    }

    public final void b(long j, long j2) {
        if (j < 900000) {
            cbx.c();
            Log.w(b, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.j = j >= 900000 ? j : 900000L;
        if (j2 < 300000) {
            cbx.c();
            Log.w(b, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.j) {
            cbx.c();
            Log.w(b, a.l(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.k = agwz.a(j2, 300000L, this.j);
    }

    public final boolean c() {
        return !agvy.c(caq.a, this.l);
    }

    public final boolean d() {
        return this.d == ccq.a && this.m > 0;
    }

    public final boolean e() {
        return this.j != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cld)) {
            return false;
        }
        cld cldVar = (cld) obj;
        return agvy.c(this.c, cldVar.c) && this.d == cldVar.d && agvy.c(this.e, cldVar.e) && agvy.c(this.f, cldVar.f) && agvy.c(this.g, cldVar.g) && agvy.c(this.h, cldVar.h) && this.i == cldVar.i && this.j == cldVar.j && this.k == cldVar.k && agvy.c(this.l, cldVar.l) && this.m == cldVar.m && this.n == cldVar.n && this.o == cldVar.o && this.p == cldVar.p && this.q == cldVar.q && this.r == cldVar.r && this.s == cldVar.s && this.A == cldVar.A && this.t == cldVar.t && this.u == cldVar.u && this.v == cldVar.v && this.w == cldVar.w && this.x == cldVar.x && agvy.c(this.y, cldVar.y) && agvy.c(this.z, cldVar.z);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        long j = this.i;
        long j2 = this.j;
        long j3 = this.k;
        int iHashCode2 = (((((((((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode();
        long j4 = this.o;
        long j5 = j4 ^ (j4 >>> 32);
        long j6 = this.p;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.q;
        long j9 = j8 ^ (j8 >>> 32);
        long j10 = this.r;
        long j11 = j10 ^ (j10 >>> 32);
        int i = true != this.s ? 1237 : 1231;
        int i2 = this.A;
        if (i2 == 0) {
            throw null;
        }
        int i3 = ((((((((((((((((iHashCode2 * 31) + ((int) j5)) * 31) + ((int) j7)) * 31) + ((int) j9)) * 31) + ((int) j11)) * 31) + i) * 31) + i2) * 31) + this.t) * 31) + this.u) * 31;
        long j12 = this.v;
        int i4 = (((((i3 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.w) * 31) + this.x) * 31;
        String str = this.y;
        int iHashCode3 = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.z;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + '}';
    }

    public /* synthetic */ cld(String str, ccq ccqVar, String str2, String str3, caz cazVar, caz cazVar2, long j, long j2, long j3, caq caqVar, int i, cah cahVar, long j4, long j5, long j6, long j7, boolean z, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool, int i6) {
        this(str, (i6 & 2) != 0 ? ccq.a : ccqVar, str2, (i6 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i6 & 16) != 0 ? caz.b : cazVar, (i6 & 32) != 0 ? caz.b : cazVar2, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? caq.a : caqVar, (i6 & 1024) != 0 ? 0 : i, (i6 & 2048) != 0 ? cah.a : cahVar, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? -1L : j5, (i6 & 16384) == 0 ? j6 : 0L, (32768 & i6) != 0 ? -1L : j7, ((65536 & i6) == 0) & z, (131072 & i6) != 0 ? 1 : i2, (262144 & i6) != 0 ? 0 : i3, 0, (1048576 & i6) != 0 ? Long.MAX_VALUE : j8, (2097152 & i6) != 0 ? 0 : i4, (4194304 & i6) != 0 ? -256 : i5, (8388608 & i6) != 0 ? null : str4, (i6 & 16777216) != 0 ? false : bool);
    }
}
