package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aadp extends aacs {
    private static final long serialVersionUID = -1079258847191166848L;

    private aadp(aabk aabkVar, aabs aabsVar) {
        super(aabkVar, aabsVar);
    }

    public static aadp P(aabk aabkVar, aabs aabsVar) {
        if (aabkVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        aabk aabkVarA = aabkVar.a();
        if (aabkVarA == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (aabsVar != null) {
            return new aadp(aabkVarA, aabsVar);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    static boolean Q(aabu aabuVar) {
        return aabuVar != null && aabuVar.e() < 43200000;
    }

    private final aabm R(aabm aabmVar, HashMap map) {
        if (aabmVar == null || !aabmVar.w()) {
            return aabmVar;
        }
        if (map.containsKey(aabmVar)) {
            return (aabm) map.get(aabmVar);
        }
        aadn aadnVar = new aadn(aabmVar, (aabs) this.b, S(aabmVar.s(), map), S(aabmVar.u(), map), S(aabmVar.t(), map));
        map.put(aabmVar, aadnVar);
        return aadnVar;
    }

    private final aabu S(aabu aabuVar, HashMap map) {
        if (aabuVar == null || !aabuVar.h()) {
            return aabuVar;
        }
        if (map.containsKey(aabuVar)) {
            return (aabu) map.get(aabuVar);
        }
        aado aadoVar = new aado(aabuVar, (aabs) this.b);
        map.put(aabuVar, aadoVar);
        return aadoVar;
    }

    @Override // defpackage.aacs, defpackage.aact, defpackage.aabk
    public final long M(int i, int i2, int i3) {
        long jM = this.a.M(i, i2, i3);
        if (jM == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (jM == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        aabs aabsVar = (aabs) this.b;
        int i4 = aabsVar.i(jM);
        long j = jM - i4;
        if (jM > 604800000 && j < 0) {
            return Long.MAX_VALUE;
        }
        if (jM < -604800000 && j > 0) {
            return Long.MIN_VALUE;
        }
        if (i4 == aabsVar.a(j)) {
            return j;
        }
        throw new aaby(jM, aabsVar.e);
    }

    @Override // defpackage.aacs
    protected final void O(aacr aacrVar) {
        HashMap map = new HashMap();
        aacrVar.l = S(aacrVar.l, map);
        aacrVar.k = S(aacrVar.k, map);
        aacrVar.j = S(aacrVar.j, map);
        aacrVar.i = S(aacrVar.i, map);
        aacrVar.h = S(aacrVar.h, map);
        aacrVar.g = S(aacrVar.g, map);
        aacrVar.f = S(aacrVar.f, map);
        aacrVar.e = S(aacrVar.e, map);
        aacrVar.d = S(aacrVar.d, map);
        aacrVar.c = S(aacrVar.c, map);
        aacrVar.b = S(aacrVar.b, map);
        aacrVar.a = S(aacrVar.a, map);
        aacrVar.E = R(aacrVar.E, map);
        aacrVar.F = R(aacrVar.F, map);
        aacrVar.G = R(aacrVar.G, map);
        aacrVar.H = R(aacrVar.H, map);
        aacrVar.I = R(aacrVar.I, map);
        aacrVar.x = R(aacrVar.x, map);
        aacrVar.y = R(aacrVar.y, map);
        aacrVar.z = R(aacrVar.z, map);
        aacrVar.D = R(aacrVar.D, map);
        aacrVar.A = R(aacrVar.A, map);
        aacrVar.B = R(aacrVar.B, map);
        aacrVar.C = R(aacrVar.C, map);
        aacrVar.m = R(aacrVar.m, map);
        aacrVar.n = R(aacrVar.n, map);
        aacrVar.o = R(aacrVar.o, map);
        aacrVar.p = R(aacrVar.p, map);
        aacrVar.q = R(aacrVar.q, map);
        aacrVar.r = R(aacrVar.r, map);
        aacrVar.s = R(aacrVar.s, map);
        aacrVar.u = R(aacrVar.u, map);
        aacrVar.t = R(aacrVar.t, map);
        aacrVar.v = R(aacrVar.v, map);
        aacrVar.w = R(aacrVar.w, map);
    }

    @Override // defpackage.aabk
    public final aabk a() {
        return this.a;
    }

    @Override // defpackage.aabk
    public final aabk b(aabs aabsVar) {
        return aabsVar == this.b ? this : aabsVar == aabs.b ? this.a : new aadp(this.a, aabsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadp)) {
            return false;
        }
        aadp aadpVar = (aadp) obj;
        if (this.a.equals(aadpVar.a)) {
            if (((aabs) this.b).equals(aadpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((aabs) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        Object obj = this.b;
        return "ZonedChronology[" + String.valueOf(this.a) + ", " + ((aabs) obj).e + "]";
    }

    @Override // defpackage.aacs, defpackage.aabk
    public final aabs z() {
        return (aabs) this.b;
    }
}
