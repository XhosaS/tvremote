package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eax {
    private static final dzy E;
    public static final Object a = new Object();
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public long A;
    public int B;
    public int C;
    public long D;

    @Deprecated
    public Object p;
    public Object r;
    public long s;
    public long t;
    public long u;
    public boolean v;
    public boolean w;
    public dzs x;
    public boolean y;
    public long z;
    public Object o = a;
    public dzy q = E;

    static {
        dzl dzlVar = new dzl();
        dzlVar.b("androidx.media3.common.Timeline");
        dzlVar.a = Uri.EMPTY;
        E = dzlVar.a();
        b = edt.Z(1);
        c = edt.Z(2);
        d = edt.Z(3);
        e = edt.Z(4);
        f = edt.Z(5);
        g = edt.Z(6);
        h = edt.Z(7);
        i = edt.Z(8);
        j = edt.Z(9);
        k = edt.Z(10);
        l = edt.Z(11);
        m = edt.Z(12);
        n = edt.Z(13);
    }

    public final long a() {
        return edt.w(this.u);
    }

    public final long b() {
        return edt.F(this.z);
    }

    public final long c() {
        return edt.F(this.A);
    }

    public final boolean d() {
        return this.x != null;
    }

    public final void e(Object obj, dzy dzyVar, Object obj2, long j2, long j3, long j4, boolean z, boolean z2, dzs dzsVar, long j5, long j6, int i2, int i3, long j7) {
        this.o = obj;
        if (dzyVar == null) {
            dzyVar = E;
        }
        this.q = dzyVar;
        this.p = null;
        this.r = obj2;
        this.s = j2;
        this.t = j3;
        this.u = j4;
        this.v = z;
        this.w = z2;
        this.x = dzsVar;
        this.z = j5;
        this.A = j6;
        this.B = i2;
        this.C = i3;
        this.D = j7;
        this.y = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            eax eaxVar = (eax) obj;
            if (Objects.equals(this.o, eaxVar.o) && Objects.equals(this.q, eaxVar.q) && Objects.equals(this.r, eaxVar.r) && Objects.equals(this.x, eaxVar.x) && this.s == eaxVar.s && this.t == eaxVar.t && this.u == eaxVar.u && this.v == eaxVar.v && this.w == eaxVar.w && this.y == eaxVar.y && this.z == eaxVar.z && this.A == eaxVar.A && this.B == eaxVar.B && this.C == eaxVar.C && this.D == eaxVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.o.hashCode() + 217) * 31) + this.q.hashCode();
        Object obj = this.r;
        int iHashCode2 = ((iHashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31;
        dzs dzsVar = this.x;
        int iHashCode3 = dzsVar != null ? dzsVar.hashCode() : 0;
        long j2 = this.s;
        int i2 = (((iHashCode2 + iHashCode3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.t;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.u;
        int i4 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31;
        long j5 = this.z;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.A;
        int i6 = (((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.B) * 31) + this.C) * 31;
        long j7 = this.D;
        return i6 + ((int) (j7 ^ (j7 >>> 32)));
    }
}
