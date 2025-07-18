package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzn {
    public static final dzn a = new dzn(new dzm());
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);
    public static final String e = edt.Z(3);
    public static final String f = edt.Z(4);
    static final String g = edt.Z(5);
    static final String h = edt.Z(6);
    public static final String i = edt.Z(7);
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public dzn(dzm dzmVar) {
        this.j = edt.F(dzmVar.a);
        long j = dzmVar.b;
        this.l = edt.F(j);
        this.k = dzmVar.a;
        this.m = j;
        this.n = dzmVar.c;
        this.o = dzmVar.d;
        this.p = dzmVar.e;
        this.q = dzmVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzn)) {
            return false;
        }
        dzn dznVar = (dzn) obj;
        return this.k == dznVar.k && this.m == dznVar.m && this.n == dznVar.n && this.o == dznVar.o && this.p == dznVar.p && this.q == dznVar.q;
    }

    public final int hashCode() {
        long j = this.m;
        long j2 = this.k;
        return (((((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0);
    }
}
