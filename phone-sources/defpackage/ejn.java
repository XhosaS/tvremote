package defpackage;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejn {
    public int a;
    public boolean b;
    public eim c;
    public ejk d;
    public ejk e;
    public ejk f;
    public ejk g;
    public ejk h;
    public int i;
    public Object j;
    public final ele l;
    public final pku m;
    private final ecu p;
    private long q;
    private long r;
    private final eav n = new eav();
    private final eax o = new eax();
    public List k = new ArrayList();

    public ejn(ele eleVar, ecu ecuVar, pku pkuVar, eim eimVar) {
        this.l = eleVar;
        this.p = ecuVar;
        this.m = pkuVar;
        this.c = eimVar;
    }

    private final long o(Object obj) {
        for (int i = 0; i < this.k.size(); i++) {
            ejk ejkVar = (ejk) this.k.get(i);
            if (ejkVar.b.equals(obj)) {
                return ejkVar.g.a.d;
            }
        }
        return -1L;
    }

    private static evz p(eay eayVar, Object obj, long j, long j2, eax eaxVar, eav eavVar) {
        eayVar.o(obj, eavVar);
        eayVar.p(eavVar.h, eaxVar);
        eayVar.a(obj);
        eavVar.l();
        eayVar.o(obj, eavVar);
        int iC = eavVar.c(j);
        return iC == -1 ? new evz(obj, j2, eavVar.b(j)) : new evz(obj, iC, eavVar.d(iC), j2);
    }

    private final boolean q(eay eayVar, evz evzVar, boolean z) {
        int iA = eayVar.a(evzVar.a);
        eav eavVar = this.n;
        int i = eayVar.n(iA, eavVar).h;
        eax eaxVar = this.o;
        return !eayVar.p(i, eaxVar).w && eayVar.k(iA, eavVar, eaxVar, this.a, this.b) == -1 && z;
    }

    private final boolean r(eay eayVar, evz evzVar) {
        if (!s(evzVar)) {
            return false;
        }
        Object obj = evzVar.a;
        return eayVar.p(eayVar.o(obj, this.n).h, this.o).C == eayVar.a(obj);
    }

    private static final boolean s(evz evzVar) {
        return !evzVar.b() && evzVar.e == -1;
    }

    private final ejl t(eay eayVar, Object obj, int i, int i2, long j, long j2) {
        evz evzVar = new evz(obj, i, i2, j2);
        Object obj2 = evzVar.a;
        int i3 = evzVar.b;
        int i4 = evzVar.c;
        eav eavVar = this.n;
        long jE = eayVar.o(obj2, eavVar).e(i3, i4);
        if (i2 == eavVar.d(i)) {
            eavVar.h();
        }
        eavVar.j(i3);
        long jMax = 0;
        if (jE != -9223372036854775807L && jE <= 0) {
            jMax = Math.max(0L, (-1) + jE);
        }
        return new ejl(evzVar, jMax, j, -9223372036854775807L, jE, false, false, false);
    }

    private final ejl u(eay eayVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        eav eavVar = this.n;
        eayVar.o(obj, eavVar);
        int iB = eavVar.b(jMax);
        if (iB == -1) {
            eavVar.l();
        } else {
            eavVar.j(iB);
        }
        evz evzVar = new evz(obj, j3, iB);
        boolean zS = s(evzVar);
        boolean zR = r(eayVar, evzVar);
        boolean zQ = q(eayVar, evzVar, zS);
        if (iB != -1) {
            eavVar.j(iB);
        }
        if (iB != -1) {
            eavVar.n(iB);
        }
        if (iB != -1) {
            eavVar.g(iB);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = eavVar.i;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new ejl(evzVar, jMax, j2, j6, j5, zS, zR, zQ);
    }

    private final void v(eay eayVar, Object obj, int i) {
        eav eavVar = this.n;
        eayVar.o(obj, eavVar);
        eavVar.g(i);
        long j = eavVar.l.a(i).s;
    }

    public final int a(ejk ejkVar) {
        eci.e(ejkVar);
        int i = 0;
        if (ejkVar.equals(this.g)) {
            return 0;
        }
        this.g = ejkVar;
        while (true) {
            ejkVar = ejkVar.i;
            if (ejkVar == null) {
                ejk ejkVar2 = this.g;
                ejkVar2.getClass();
                ejkVar2.i(null);
                j();
                return i;
            }
            if (ejkVar == this.e) {
                ejk ejkVar3 = this.d;
                this.e = ejkVar3;
                this.f = ejkVar3;
                i = 3;
            }
            if (ejkVar == this.f) {
                this.f = this.e;
                i |= 2;
            }
            ejkVar.h();
            this.i--;
        }
    }

    public final int b(eay eayVar) {
        eay eayVar2;
        ejk ejkVar;
        ejk ejkVar2 = this.d;
        if (ejkVar2 == null) {
            return 0;
        }
        int iA = eayVar.a(ejkVar2.b);
        while (true) {
            eayVar2 = eayVar;
            iA = eayVar2.k(iA, this.n, this.o, this.a, this.b);
            while (true) {
                ejkVar2.getClass();
                ejkVar = ejkVar2.i;
                if (ejkVar == null || ejkVar2.g.h) {
                    break;
                }
                ejkVar2 = ejkVar;
            }
            if (iA == -1 || ejkVar == null || eayVar2.a(ejkVar.b) != iA) {
                break;
            }
            ejkVar2 = ejkVar;
            eayVar = eayVar2;
        }
        int iA2 = a(ejkVar2);
        ejkVar2.g = f(eayVar2, ejkVar2.g);
        return iA2;
    }

    public final ejk c() {
        ejk ejkVar = this.d;
        if (ejkVar == null) {
            return null;
        }
        if (ejkVar == this.e) {
            this.e = ejkVar.i;
        }
        if (ejkVar == this.f) {
            this.f = ejkVar.i;
        }
        ejkVar.h();
        int i = this.i - 1;
        this.i = i;
        if (i == 0) {
            this.g = null;
            ejk ejkVar2 = this.d;
            this.j = ejkVar2.b;
            this.r = ejkVar2.g.a.d;
        }
        this.d = this.d.i;
        j();
        return this.d;
    }

    public final ejl d(eay eayVar, ejk ejkVar, long j) {
        eay eayVar2;
        long j2;
        long j3;
        eay eayVar3;
        eav eavVar;
        eax eaxVar;
        Object obj;
        long j4;
        long j5;
        long j6;
        long j7;
        ejl ejlVar = ejkVar.g;
        long j8 = ejkVar.k;
        long j9 = ejlVar.e;
        long j10 = (j8 + j9) - j;
        if (!ejlVar.h) {
            evz evzVar = ejlVar.a;
            Object obj2 = evzVar.a;
            eav eavVar2 = this.n;
            eayVar.o(obj2, eavVar2);
            boolean z = ejlVar.g;
            if (!evzVar.b()) {
                int i = evzVar.e;
                if (i != -1) {
                    eavVar2.n(i);
                }
                int iD = eavVar2.d(i);
                eavVar2.j(i);
                if (iD != eavVar2.a(i)) {
                    return t(eayVar, obj2, i, iD, j9, evzVar.d);
                }
                v(eayVar, obj2, i);
                return u(eayVar, obj2, 0L, j9, evzVar.d);
            }
            int i2 = evzVar.b;
            if (eavVar2.a(i2) == -1) {
                return null;
            }
            int iB = eavVar2.l.a(i2).b(evzVar.c);
            if (iB < 0) {
                return t(eayVar, obj2, i2, iB, ejlVar.c, evzVar.d);
            }
            long jLongValue = ejlVar.c;
            if (jLongValue == -9223372036854775807L) {
                j2 = 0;
                Pair pairM = eayVar.m(this.o, eavVar2, eavVar2.h, -9223372036854775807L, Math.max(0L, j10));
                eayVar2 = eayVar;
                if (pairM == null) {
                    return null;
                }
                jLongValue = ((Long) pairM.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                eayVar2 = eayVar;
                j2 = 0;
                j3 = jLongValue;
            }
            v(eayVar2, obj2, i2);
            return u(eayVar2, obj2, Math.max(j2, jLongValue), j3, evzVar.d);
        }
        evz evzVar2 = ejlVar.a;
        Object obj3 = evzVar2.a;
        int iA = eayVar.a(obj3);
        int i3 = this.a;
        boolean z2 = this.b;
        eax eaxVar2 = this.o;
        eav eavVar3 = this.n;
        int iK = eayVar.k(iA, eavVar3, eaxVar2, i3, z2);
        if (iK == -1) {
            return null;
        }
        int i4 = eayVar.d(iK, eavVar3, true).h;
        Object obj4 = eavVar3.g;
        obj4.getClass();
        long j11 = evzVar2.d;
        if (eayVar.p(i4, eaxVar2).B == iK) {
            Pair pairM2 = eayVar.m(eaxVar2, eavVar3, i4, -9223372036854775807L, Math.max(0L, j10));
            if (pairM2 == null) {
                return null;
            }
            Object obj5 = pairM2.first;
            long jLongValue2 = ((Long) pairM2.second).longValue();
            ejk ejkVar2 = ejkVar.i;
            if (ejkVar2 == null || !ejkVar2.b.equals(obj5)) {
                long jO = o(obj5);
                if (jO == -1) {
                    jO = this.q;
                    this.q = 1 + jO;
                }
                j7 = jO;
            } else {
                j7 = ejkVar2.g.a.d;
            }
            eayVar3 = eayVar;
            eaxVar = eaxVar2;
            eavVar = eavVar3;
            obj = obj5;
            j4 = j7;
            j5 = jLongValue2;
            j6 = -9223372036854775807L;
        } else {
            eayVar3 = eayVar;
            eavVar = eavVar3;
            eaxVar = eaxVar2;
            obj = obj4;
            j4 = j11;
            j5 = 0;
            j6 = 0;
        }
        evz evzVarP = p(eayVar3, obj, j5, j4, eaxVar, eavVar);
        long j12 = j5;
        eav eavVar4 = eavVar;
        if (j6 != -9223372036854775807L && ejlVar.c != -9223372036854775807L) {
            eayVar3.o(obj3, eavVar4).l();
            eavVar4.i();
        }
        return e(eayVar3, evzVarP, j6, j12);
    }

    public final ejl e(eay eayVar, evz evzVar, long j, long j2) {
        Object obj = evzVar.a;
        eayVar.o(obj, this.n);
        return evzVar.b() ? t(eayVar, obj, evzVar.b, evzVar.c, j, evzVar.d) : u(eayVar, obj, j2, j, evzVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ejl f(defpackage.eay r14, defpackage.ejl r15) {
        /*
            r13 = this;
            evz r1 = r15.a
            boolean r10 = s(r1)
            boolean r11 = r13.r(r14, r1)
            boolean r12 = r13.q(r14, r1, r10)
            java.lang.Object r0 = r1.a
            eav r2 = r13.n
            r14.o(r0, r2)
            boolean r14 = r1.b()
            r0 = -1
            r3 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 != 0) goto L2d
            int r14 = r1.e
            if (r14 != r0) goto L28
            goto L2d
        L28:
            r2.g(r14)
            r7 = r3
            goto L2e
        L2d:
            r7 = r5
        L2e:
            boolean r14 = r1.b()
            if (r14 == 0) goto L3f
            int r14 = r1.b
            int r3 = r1.c
            long r3 = r2.e(r14, r3)
        L3c:
            r6 = r7
            r8 = r3
            goto L49
        L3f:
            int r14 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r14 == 0) goto L46
            r6 = r3
            r8 = r6
            goto L49
        L46:
            long r3 = r2.i
            goto L3c
        L49:
            boolean r14 = r1.b()
            if (r14 == 0) goto L55
            int r14 = r1.b
            r2.j(r14)
            goto L5c
        L55:
            int r14 = r1.e
            if (r14 == r0) goto L5c
            r2.j(r14)
        L5c:
            ejl r0 = new ejl
            long r2 = r15.b
            long r4 = r15.c
            boolean r14 = r15.f
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejn.f(eay, ejl):ejl");
    }

    public final evz g(eay eayVar, Object obj, long j) {
        long jO;
        int iA;
        eav eavVar = this.n;
        int i = eayVar.o(obj, eavVar).h;
        Object obj2 = this.j;
        if (obj2 == null || (iA = eayVar.a(obj2)) == -1 || eayVar.n(iA, eavVar).h != i) {
            ejk ejkVar = this.d;
            while (true) {
                if (ejkVar == null) {
                    ejk ejkVar2 = this.d;
                    while (true) {
                        if (ejkVar2 != null) {
                            int iA2 = eayVar.a(ejkVar2.b);
                            if (iA2 != -1 && eayVar.n(iA2, eavVar).h == i) {
                                jO = ejkVar2.g.a.d;
                                break;
                            }
                            ejkVar2 = ejkVar2.i;
                        } else {
                            jO = o(obj);
                            if (jO == -1) {
                                jO = this.q;
                                this.q = 1 + jO;
                                if (this.d == null) {
                                    this.j = obj;
                                    this.r = jO;
                                }
                            }
                        }
                    }
                } else {
                    if (ejkVar.b.equals(obj)) {
                        jO = ejkVar.g.a.d;
                        break;
                    }
                    ejkVar = ejkVar.i;
                }
            }
        } else {
            jO = this.r;
        }
        long j2 = jO;
        eayVar.o(obj, eavVar);
        int i2 = eavVar.h;
        eax eaxVar = this.o;
        eayVar.p(i2, eaxVar);
        Object obj3 = obj;
        for (int iA3 = eayVar.a(obj); iA3 >= eaxVar.B; iA3--) {
            eayVar.d(iA3, eavVar, true);
            eavVar.l();
            if (eavVar.c(eavVar.i) != -1) {
                Object obj4 = eavVar.g;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return p(eayVar, obj3, j, j2, eaxVar, eavVar);
    }

    public final void h() {
        if (this.i == 0) {
            return;
        }
        ejk ejkVar = this.d;
        eci.e(ejkVar);
        this.j = ejkVar.b;
        this.r = ejkVar.g.a.d;
        while (ejkVar != null) {
            ejkVar.h();
            ejkVar = ejkVar.i;
        }
        this.d = null;
        this.g = null;
        this.e = null;
        this.f = null;
        this.i = 0;
        j();
    }

    public final void i() {
        ejk ejkVar = this.h;
        if (ejkVar == null || ejkVar.l()) {
            this.h = null;
            for (int i = 0; i < this.k.size(); i++) {
                ejk ejkVar2 = (ejk) this.k.get(i);
                if (!ejkVar2.l()) {
                    this.h = ejkVar2;
                    return;
                }
            }
        }
    }

    public final void j() {
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (ejk ejkVar = this.d; ejkVar != null; ejkVar = ejkVar.i) {
            builder.add((ImmutableList.Builder) ejkVar.g.a);
        }
        ejk ejkVar2 = this.e;
        final evz evzVar = ejkVar2 == null ? null : ejkVar2.g.a;
        this.p.d(new Runnable() { // from class: ejm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                ele eleVar = this.a.l;
                ImmutableList immutableListBuild = builder.build();
                eao eaoVar = eleVar.d;
                eaoVar.getClass();
                ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) immutableListBuild);
                eld eldVar = eleVar.b;
                eldVar.b = immutableListCopyOf;
                if (!immutableListBuild.isEmpty()) {
                    evz evzVar2 = evzVar;
                    eldVar.d = (evz) immutableListBuild.get(0);
                    evzVar2.getClass();
                    eldVar.e = evzVar2;
                }
                if (eldVar.c == null) {
                    eldVar.c = eld.b(eaoVar, eldVar.b, eldVar.d, eldVar.a);
                }
                eldVar.c(eaoVar.N());
            }
        });
    }

    public final void k(long j) {
        ejk ejkVar = this.g;
        if (ejkVar != null) {
            a.ab(ejkVar.m());
            if (ejkVar.e) {
                ejkVar.a.m(ejkVar.d(j));
            }
        }
    }

    public final void l() {
        if (this.k.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.k.size(); i++) {
            ((ejk) this.k.get(i)).h();
        }
        this.k = arrayList;
        this.h = null;
        i();
    }

    public final boolean m(evx evxVar) {
        ejk ejkVar = this.g;
        return ejkVar != null && ejkVar.a == evxVar;
    }

    public final boolean n(evx evxVar) {
        ejk ejkVar = this.h;
        return ejkVar != null && ejkVar.a == evxVar;
    }
}
