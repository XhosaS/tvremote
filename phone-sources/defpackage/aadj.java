package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aadj extends aacz {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap I = new ConcurrentHashMap();
    public static final aadj H = am(aabs.b);

    private aadj(aabk aabkVar, int i) {
        super(aabkVar, i);
    }

    public static aadj am(aabs aabsVar) {
        return an(aabsVar, 4);
    }

    public static aadj an(aabs aabsVar, int i) {
        aadj aadjVar;
        if (aabsVar == null) {
            aabsVar = aabs.n();
        }
        ConcurrentHashMap concurrentHashMap = I;
        aadj[] aadjVarArr = (aadj[]) concurrentHashMap.get(aabsVar);
        if (aadjVarArr == null) {
            aadjVarArr = new aadj[7];
            aadj[] aadjVarArr2 = (aadj[]) concurrentHashMap.putIfAbsent(aabsVar, aadjVarArr);
            if (aadjVarArr2 != null) {
                aadjVarArr = aadjVarArr2;
            }
        }
        int i2 = i - 1;
        try {
            aadj aadjVar2 = aadjVarArr[i2];
            if (aadjVar2 != null) {
                return aadjVar2;
            }
            synchronized (aadjVarArr) {
                aadjVar = aadjVarArr[i2];
                if (aadjVar == null) {
                    aabs aabsVar2 = aabs.b;
                    aadjVar = aabsVar == aabsVar2 ? new aadj(null, i) : new aadj(aadp.P(an(aabsVar2, i), aabsVar), i);
                    aadjVarArr[i2] = aadjVar;
                }
            }
            return aadjVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(a.cf(i, "Invalid min days in first week: "));
        }
    }

    private Object readResolve() {
        int i = ((aacw) this).G;
        if (i == 0) {
            i = 4;
        }
        aabk aabkVar = this.a;
        return aabkVar == null ? an(aabs.b, i) : an(aabkVar.z(), i);
    }

    @Override // defpackage.aacs, defpackage.aact, defpackage.aabk
    public final /* bridge */ /* synthetic */ long M(int i, int i2, int i3) {
        aabk aabkVar = this.a;
        if (aabkVar != null) {
            return aabkVar.M(i, i2, i3);
        }
        int i4 = 0;
        vxr.az(aabo.w, 0, 0, 86399999);
        long jAc = ac(i, i2, i3);
        if (jAc == Long.MIN_VALUE) {
            jAc = ac(i, i2, i3 + 1);
            i4 = -86400000;
        }
        long j = i4 + jAc;
        if (j < 0 && jAc > 0) {
            return Long.MAX_VALUE;
        }
        if (j <= 0 || jAc >= 0) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.aacw, defpackage.aacs
    protected final void O(aacr aacrVar) {
        if (this.a == null) {
            aacrVar.a = aacw.o;
            aacrVar.b = aacw.p;
            aacrVar.c = aacw.q;
            aacrVar.d = aacw.r;
            aacrVar.e = aacw.s;
            aacrVar.f = aacw.t;
            aacrVar.g = aacw.u;
            aacrVar.m = aacw.v;
            aacrVar.n = aacw.w;
            aacrVar.o = aacw.x;
            aacrVar.p = aacw.y;
            aacrVar.q = aacw.z;
            aacrVar.r = aacw.A;
            aacrVar.s = aacw.B;
            aacrVar.u = aacw.C;
            aacrVar.t = aacw.D;
            aacrVar.v = aacw.E;
            aacrVar.w = aacw.F;
            aacrVar.E = new aadd(this);
            aacrVar.F = new aadi(aacrVar.E, this);
            aabm aabmVar = aacrVar.F;
            aacrVar.H = new aadv(new aadz(aabmVar, aabmVar == null ? null : aabmVar.r(), 99), aabo.d);
            aacrVar.k = aacrVar.H.s();
            aadv aadvVar = (aadv) aacrVar.H;
            aacrVar.G = new aadz(new aaed(aadvVar, aadvVar.g), aabo.e);
            aacrVar.I = new aadf(this);
            aacrVar.x = new aade(this, aacrVar.f);
            aacrVar.y = new aacx(this, aacrVar.f);
            aacrVar.z = new aacy(this, aacrVar.f);
            aacrVar.D = new aadh(this);
            aacrVar.B = new aadc(this);
            aacrVar.A = new aadb(this, aacrVar.g);
            aabm aabmVar2 = aacrVar.B;
            aabu aabuVar = aacrVar.k;
            aabo aaboVar = aabo.j;
            aacrVar.C = new aadz(new aaed(aabmVar2, aabuVar, aaboVar), aaboVar);
            aacrVar.j = aacrVar.E.s();
            aacrVar.i = aacrVar.D.s();
            aacrVar.h = aacrVar.B.s();
        }
    }

    @Override // defpackage.aabk
    public final aabk a() {
        return H;
    }

    @Override // defpackage.aacw
    public final long ab(int i) {
        int i2;
        int i3 = i / 100;
        if (i >= 0) {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (al(i)) {
            }
            return ((i * 365) + (i2 - 719527)) * 86400000;
        }
        i2 = (((i + 3) >> 2) - i3) + ((i3 + 3) >> 2);
        i2--;
        return ((i * 365) + (i2 - 719527)) * 86400000;
    }

    @Override // defpackage.aacw
    public final boolean al(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    @Override // defpackage.aabk
    public final aabk b(aabs aabsVar) {
        return aabsVar == z() ? this : am(aabsVar);
    }
}
