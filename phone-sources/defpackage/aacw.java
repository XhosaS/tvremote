package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class aacw extends aacs {
    public static final aabm A;
    public static final aabm B;
    public static final aabm C;
    public static final aabm D;
    public static final aabm E;
    public static final aabm F;
    public static final aabu o;
    public static final aabu p;
    public static final aabu q;
    public static final aabu r;
    public static final aabu s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final aabu t;
    public static final aabu u;
    public static final aabm v;
    public static final aabm w;
    public static final aabm x;
    public static final aabm y;
    public static final aabm z;
    public final int G;
    private final transient aacv[] H;

    static {
        aabu aabuVar = aady.a;
        o = aabuVar;
        aaec aaecVar = new aaec(aabw.k, 1000L);
        p = aaecVar;
        aaec aaecVar2 = new aaec(aabw.j, 60000L);
        q = aaecVar2;
        aaec aaecVar3 = new aaec(aabw.i, 3600000L);
        r = aaecVar3;
        aaec aaecVar4 = new aaec(aabw.h, 43200000L);
        s = aaecVar4;
        aaec aaecVar5 = new aaec(aabw.g, 86400000L);
        t = aaecVar5;
        u = new aaec(aabw.f, 604800000L);
        v = new aaea(aabo.x, aabuVar, aaecVar);
        w = new aaea(aabo.w, aabuVar, aaecVar5);
        x = new aaea(aabo.v, aaecVar, aaecVar2);
        y = new aaea(aabo.u, aaecVar, aaecVar5);
        z = new aaea(aabo.t, aaecVar2, aaecVar3);
        A = new aaea(aabo.s, aaecVar2, aaecVar5);
        aaea aaeaVar = new aaea(aabo.r, aaecVar3, aaecVar5);
        B = aaeaVar;
        aaea aaeaVar2 = new aaea(aabo.o, aaecVar3, aaecVar4);
        C = aaeaVar2;
        D = new aaeh(aaeaVar, aabo.q);
        E = new aaeh(aaeaVar2, aabo.p);
        F = new aacu();
    }

    public aacw(aabk aabkVar, int i) {
        super(aabkVar, null);
        this.H = new aacv[1024];
        this.G = i;
    }

    @Override // defpackage.aacs
    protected void O(aacr aacrVar) {
        throw null;
    }

    final int P(long j, int i, int i2) {
        return ((int) ((j - (ag(i) + ae(i, i2))) / 86400000)) + 1;
    }

    final int Q(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    final int R(long j, int i) {
        return ((int) ((j - ag(i)) / 86400000)) + 1;
    }

    final int S(long j) {
        int iAa = aa(j);
        return T(iAa, V(j, iAa));
    }

    public abstract int T(int i, int i2);

    final int U(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int V(long j, int i);

    final int W(long j) {
        return X(j, aa(j));
    }

    final int X(long j, int i) {
        long jAd = ad(i);
        if (j < jAd) {
            return Y(i - 1);
        }
        if (j >= ad(i + 1)) {
            return 1;
        }
        return ((int) ((j - jAd) / 604800000)) + 1;
    }

    final int Y(int i) {
        return (int) ((ad(i + 1) - ad(i)) / 604800000);
    }

    final int Z(long j) {
        int iAa = aa(j);
        int iX = X(j, iAa);
        return iX == 1 ? aa(j + 604800000) : iX > 51 ? aa(j - 1209600000) : iAa;
    }

    final int aa(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long jAg = ag(i);
        long j4 = j - jAg;
        if (j4 < 0) {
            return i - 1;
        }
        if (j4 >= 31536000000L) {
            return jAg + (true == al(i) ? 31622400000L : 31536000000L) > j ? i : i + 1;
        }
        return i;
    }

    public abstract long ab(int i);

    final long ac(int i, int i2, int i3) {
        vxr.az(aabo.f, i, -292275055, 292278994);
        vxr.az(aabo.h, i2, 1, 12);
        int iT = T(i, i2);
        if (i3 <= 0 || i3 > iT) {
            throw new aabx(aabo.i, Integer.valueOf(i3), 1, Integer.valueOf(iT), a.ce(i2, i, "year: ", " month: "));
        }
        long jAh = ah(i, i2, i3);
        if (jAh < 0 && i == 292278994) {
            return Long.MAX_VALUE;
        }
        if (jAh <= 0 || i != -292275055) {
            return jAh;
        }
        return Long.MIN_VALUE;
    }

    final long ad(int i) {
        long jAg = ag(i);
        return Q(jAg) > 8 - this.G ? jAg + ((8 - r8) * 86400000) : jAg - ((r8 - 1) * 86400000);
    }

    public abstract long ae(int i, int i2);

    public abstract long af(long j, long j2);

    final long ag(int i) {
        aacv[] aacvVarArr = this.H;
        int i2 = i & 1023;
        aacv aacvVar = aacvVarArr[i2];
        if (aacvVar == null || aacvVar.a != i) {
            aacv aacvVar2 = new aacv(i, ab(i));
            aacvVarArr[i2] = aacvVar2;
            aacvVar = aacvVar2;
        }
        return aacvVar.b;
    }

    final long ah(int i, int i2, int i3) {
        return ag(i) + ae(i, i2) + ((i3 - 1) * 86400000);
    }

    final long ai(int i, int i2) {
        return ag(i) + ae(i, i2);
    }

    public abstract long aj(long j, int i);

    public boolean ak(long j) {
        throw null;
    }

    public abstract boolean al(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aacw aacwVar = (aacw) obj;
            if (this.G == aacwVar.G && z().equals(aacwVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        aabs aabsVarZ = z();
        if (aabsVarZ != null) {
            sb.append(aabsVarZ.e);
        }
        int i = this.G;
        if (i != 4) {
            sb.append(",mdfw=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.aacs, defpackage.aabk
    public final aabs z() {
        aabk aabkVar = this.a;
        return aabkVar != null ? aabkVar.z() : aabs.b;
    }
}
