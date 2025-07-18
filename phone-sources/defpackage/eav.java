package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eav {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public Object f;
    public Object g;
    public int h;
    public long i;
    public long j;
    public boolean k;
    public dyn l = dyn.a;

    public final int a(int i) {
        return this.l.a(i).m;
    }

    public final int b(long j) {
        dyn dynVar = this.l;
        long j2 = this.i;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = dynVar.c;
        return -1;
    }

    public final int c(long j) {
        dyn dynVar = this.l;
        int i = dynVar.c;
        dynVar.b();
        return -1;
    }

    public final int d(int i) {
        return this.l.a(i).a();
    }

    public final long e(int i, int i2) {
        dym dymVarA = this.l.a(i);
        if (dymVarA.m != -1) {
            return dymVarA.q[i2];
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            eav eavVar = (eav) obj;
            if (Objects.equals(this.f, eavVar.f) && Objects.equals(this.g, eavVar.g) && this.h == eavVar.h && this.i == eavVar.i && this.j == eavVar.j && this.k == eavVar.k && Objects.equals(this.l, eavVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return edt.F(this.j);
    }

    public final void g(int i) {
        long j = this.l.a(i).l;
    }

    public final void h() {
        long j = this.l.d;
    }

    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.g;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.h;
        long j = this.i;
        long j2 = this.j;
        return (((((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.k ? 1 : 0)) * 31) + this.l.hashCode();
    }

    public final void i() {
        int i = this.l.e;
    }

    public final void j(int i) {
        boolean z = this.l.a(i).t;
    }

    public final void k(Object obj, Object obj2, int i, long j, long j2, dyn dynVar, boolean z) {
        this.f = obj;
        this.g = obj2;
        this.h = i;
        this.i = j;
        this.j = j2;
        this.l = dynVar;
        this.k = z;
    }

    public final void l() {
        int i = this.l.c;
    }

    public final void m(Object obj, Object obj2, long j, long j2) {
        k(obj, obj2, 0, j, j2, dyn.a, false);
    }

    public final void n(int i) {
        l();
        if (i == -1) {
            this.l.b();
        }
    }
}
