package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cps {
    public static final cpm a = new cpm();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, cpd cpdVar, cqf cqfVar, boolean z) {
        cpc cpcVar;
        cpc cpcVar2;
        float f;
        boolean z2;
        boolean z3;
        cpc cpcVar3;
        cpc cpcVar4;
        if (cpdVar.o) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(cpdVar instanceof cpe) && cpdVar.L() && c(cpdVar)) {
            cpe.aa(cpdVar, cqfVar, new cpm());
        }
        cpc cpcVarM = cpdVar.M(2);
        cpc cpcVarM2 = cpdVar.M(4);
        int iA = cpcVarM.a();
        int iA2 = cpcVarM2.a();
        HashSet hashSet = cpcVarM.a;
        if (hashSet != null && cpcVarM.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                cpc cpcVar5 = (cpc) it.next();
                cpd cpdVar2 = cpcVar5.d;
                boolean zC = c(cpdVar2);
                if (cpdVar2.L() && zC) {
                    f = 0.0f;
                    cpe.aa(cpdVar2, cqfVar, new cpm());
                } else {
                    f = 0.0f;
                }
                cpc cpcVar6 = cpdVar2.K;
                if ((cpcVar5 == cpcVar6 && (cpcVar4 = cpdVar2.M.e) != null && cpcVar4.c) || (cpcVar5 == cpdVar2.M && (cpcVar3 = cpcVar6.e) != null && cpcVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (cpdVar2.O() != 3 || zC) {
                    if (!cpdVar2.L()) {
                        if (cpcVar5 == cpcVar6 && cpdVar2.M.e == null) {
                            int iB = cpcVar6.b() + iA;
                            cpdVar2.x(iB, cpdVar2.j() + iB);
                            a(i2, cpdVar2, cqfVar, z);
                        } else {
                            cpc cpcVar7 = cpdVar2.M;
                            if (cpcVar5 == cpcVar7 && cpcVar6.e == null) {
                                int iB2 = iA - cpcVar7.b();
                                cpdVar2.x(iB2 - cpdVar2.j(), iB2);
                                a(i2, cpdVar2, cqfVar, z);
                            } else if (z3 && !cpdVar2.J()) {
                                e(i2, cqfVar, cpdVar2, z);
                            }
                        }
                    }
                } else if (cpdVar2.O() == 3 && cpdVar2.x >= 0 && cpdVar2.w >= 0 && ((cpdVar2.ai == 8 || (cpdVar2.t == 0 && cpdVar2.Y == f)) && !cpdVar2.J() && !cpdVar2.H && z3 && !cpdVar2.J())) {
                    f(i2, cpdVar, cqfVar, cpdVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (cpdVar instanceof cph) {
            return;
        }
        HashSet hashSet2 = cpcVarM2.a;
        if (hashSet2 != null && cpcVarM2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                cpc cpcVar8 = (cpc) it2.next();
                cpd cpdVar3 = cpcVar8.d;
                boolean zC2 = c(cpdVar3);
                if (cpdVar3.L() && zC2) {
                    cpe.aa(cpdVar3, cqfVar, new cpm());
                }
                cpc cpcVar9 = cpdVar3.K;
                boolean z6 = ((cpcVar8 == cpcVar9 && (cpcVar2 = cpdVar3.M.e) != null && cpcVar2.c) || (cpcVar8 == cpdVar3.M && (cpcVar = cpcVar9.e) != null && cpcVar.c)) ? z5 : false;
                if (cpdVar3.O() != 3 || zC2) {
                    if (!cpdVar3.L()) {
                        if (cpcVar8 == cpcVar9 && cpdVar3.M.e == null) {
                            int iB3 = cpcVar9.b() + iA2;
                            cpdVar3.x(iB3, cpdVar3.j() + iB3);
                            a(i3, cpdVar3, cqfVar, z);
                        } else {
                            cpc cpcVar10 = cpdVar3.M;
                            if (cpcVar8 == cpcVar10 && cpcVar9.e == null) {
                                int iB4 = iA2 - cpcVar10.b();
                                cpdVar3.x(iB4 - cpdVar3.j(), iB4);
                                a(i3, cpdVar3, cqfVar, z);
                            } else if (z6 && !cpdVar3.J()) {
                                e(i3, cqfVar, cpdVar3, z);
                            }
                        }
                    }
                } else if (cpdVar3.O() == 3 && cpdVar3.x >= 0 && cpdVar3.w >= 0 && (cpdVar3.ai == 8 || (cpdVar3.t == 0 && cpdVar3.Y == 0.0f))) {
                    if (!cpdVar3.J() && !cpdVar3.H && z6 && !cpdVar3.J()) {
                        f(i3, cpdVar, cqfVar, cpdVar3, z);
                    }
                }
            }
        }
        cpdVar.o = z5;
    }

    public static void b(int i, cpd cpdVar, cqf cqfVar) {
        cpc cpcVar;
        cpc cpcVar2;
        cpc cpcVar3;
        cpc cpcVar4;
        cpc cpcVar5;
        if (cpdVar.p) {
            return;
        }
        c++;
        if (!(cpdVar instanceof cpe) && cpdVar.L() && c(cpdVar)) {
            cpe.aa(cpdVar, cqfVar, new cpm());
        }
        cpc cpcVarM = cpdVar.M(3);
        cpc cpcVarM2 = cpdVar.M(5);
        int iA = cpcVarM.a();
        int iA2 = cpcVarM2.a();
        HashSet hashSet = cpcVarM.a;
        if (hashSet != null && cpcVarM.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                cpc cpcVar6 = (cpc) it.next();
                cpd cpdVar2 = cpcVar6.d;
                boolean zC = c(cpdVar2);
                if (cpdVar2.L() && zC) {
                    cpe.aa(cpdVar2, cqfVar, new cpm());
                }
                cpc cpcVar7 = cpdVar2.L;
                boolean z = (cpcVar6 == cpcVar7 && (cpcVar5 = cpdVar2.N.e) != null && cpcVar5.c) || (cpcVar6 == cpdVar2.N && (cpcVar4 = cpcVar7.e) != null && cpcVar4.c);
                if (cpdVar2.P() != 3 || zC) {
                    if (!cpdVar2.L()) {
                        if (cpcVar6 == cpcVar7 && cpdVar2.N.e == null) {
                            int iB = cpcVar7.b() + iA;
                            cpdVar2.y(iB, cpdVar2.h() + iB);
                            b(i2, cpdVar2, cqfVar);
                        } else {
                            cpc cpcVar8 = cpdVar2.N;
                            if (cpcVar6 == cpcVar8 && cpcVar7.e == null) {
                                int iB2 = iA - cpcVar8.b();
                                cpdVar2.y(iB2 - cpdVar2.h(), iB2);
                                b(i2, cpdVar2, cqfVar);
                            } else if (z && !cpdVar2.K()) {
                                g(i2, cqfVar, cpdVar2);
                            }
                        }
                    }
                } else if (cpdVar2.P() == 3 && cpdVar2.A >= 0 && cpdVar2.z >= 0 && (cpdVar2.ai == 8 || (cpdVar2.u == 0 && cpdVar2.Y == 0.0f))) {
                    if (!cpdVar2.K() && !cpdVar2.H && z && !cpdVar2.K()) {
                        h(i2, cpdVar, cqfVar, cpdVar2);
                    }
                }
            }
        }
        if (cpdVar instanceof cph) {
            return;
        }
        HashSet hashSet2 = cpcVarM2.a;
        if (hashSet2 != null && cpcVarM2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                cpc cpcVar9 = (cpc) it2.next();
                cpd cpdVar3 = cpcVar9.d;
                boolean zC2 = c(cpdVar3);
                if (cpdVar3.L() && zC2) {
                    cpe.aa(cpdVar3, cqfVar, new cpm());
                }
                cpc cpcVar10 = cpdVar3.L;
                boolean z2 = (cpcVar9 == cpcVar10 && (cpcVar3 = cpdVar3.N.e) != null && cpcVar3.c) || (cpcVar9 == cpdVar3.N && (cpcVar2 = cpcVar10.e) != null && cpcVar2.c);
                if (cpdVar3.P() != 3 || zC2) {
                    if (cpdVar3.L()) {
                        continue;
                    } else if (cpcVar9 == cpcVar10 && cpdVar3.N.e == null) {
                        int iB3 = cpcVar10.b() + iA2;
                        cpdVar3.y(iB3, cpdVar3.h() + iB3);
                        b(i3, cpdVar3, cqfVar);
                    } else {
                        cpc cpcVar11 = cpdVar3.N;
                        if (cpcVar9 == cpcVar11 && cpcVar10.e == null) {
                            int iB4 = iA2 - cpcVar11.b();
                            cpdVar3.y(iB4 - cpdVar3.h(), iB4);
                            b(i3, cpdVar3, cqfVar);
                        } else if (z2 && !cpdVar3.K()) {
                            g(i3, cqfVar, cpdVar3);
                        }
                    }
                } else if (cpdVar3.P() == 3 && cpdVar3.A >= 0 && cpdVar3.z >= 0 && (cpdVar3.ai == 8 || (cpdVar3.u == 0 && cpdVar3.Y == 0.0f))) {
                    if (!cpdVar3.K() && !cpdVar3.H && z2 && !cpdVar3.K()) {
                        h(i3, cpdVar, cqfVar, cpdVar3);
                    }
                }
            }
        }
        cpc cpcVarM3 = cpdVar.M(6);
        if (cpcVarM3.a != null && cpcVarM3.c) {
            int iA3 = cpcVarM3.a();
            Iterator it3 = cpcVarM3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                cpc cpcVar12 = (cpc) it3.next();
                cpd cpdVar4 = cpcVar12.d;
                boolean zC3 = c(cpdVar4);
                if (cpdVar4.L() && zC3) {
                    cpe.aa(cpdVar4, cqfVar, new cpm());
                }
                if (cpdVar4.P() != 3 || zC3) {
                    if (!cpdVar4.L() && cpcVar12 == (cpcVar = cpdVar4.O)) {
                        int iB5 = cpcVar12.b() + iA3;
                        if (cpdVar4.G) {
                            int i5 = iB5 - cpdVar4.ac;
                            int i6 = cpdVar4.X + i5;
                            cpdVar4.ab = i5;
                            cpdVar4.L.f(i5);
                            cpdVar4.N.f(i6);
                            cpcVar.f(iB5);
                            cpdVar4.n = true;
                        }
                        b(i4, cpdVar4, cqfVar);
                    }
                }
            }
        }
        cpdVar.p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.cpd r8) {
        /*
            int r0 = r8.O()
            int r1 = r8.P()
            cpd r2 = r8.V
            if (r2 != 0) goto Ld
            r2 = 0
        Ld:
            if (r2 == 0) goto L12
            r2.O()
        L12:
            if (r2 == 0) goto L17
            r2.P()
        L17:
            r2 = 2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 == r6) goto L4b
            boolean r7 = r8.e()
            if (r7 != 0) goto L4b
            if (r0 == r2) goto L4b
            if (r0 != r4) goto L39
            int r0 = r8.t
            if (r0 != 0) goto L3d
            float r0 = r8.Y
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3d
            boolean r0 = r8.H(r5)
            if (r0 != 0) goto L4b
            goto L3d
        L39:
            if (r0 == r4) goto L3d
        L3b:
            r0 = r5
            goto L4c
        L3d:
            int r0 = r8.t
            if (r0 != r6) goto L3b
            int r0 = r8.j()
            boolean r0 = r8.I(r5, r0)
            if (r0 == 0) goto L3b
        L4b:
            r0 = r6
        L4c:
            if (r1 == r6) goto L7b
            boolean r7 = r8.f()
            if (r7 != 0) goto L7b
            if (r1 == r2) goto L7b
            if (r1 != r4) goto L69
            int r1 = r8.u
            if (r1 != 0) goto L6d
            float r1 = r8.Y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L6d
            boolean r1 = r8.H(r6)
            if (r1 != 0) goto L7b
            goto L6d
        L69:
            if (r1 == r4) goto L6d
        L6b:
            r1 = r5
            goto L7c
        L6d:
            int r1 = r8.u
            if (r1 != r6) goto L6b
            int r1 = r8.h()
            boolean r1 = r8.I(r6, r1)
            if (r1 == 0) goto L6b
        L7b:
            r1 = r6
        L7c:
            float r8 = r8.Y
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L8a
            if (r0 != 0) goto L89
            if (r1 != 0) goto L89
            r0 = r5
            r1 = r0
            goto L8a
        L89:
            return r6
        L8a:
            if (r0 == 0) goto L8f
            if (r1 == 0) goto L8f
            return r6
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cps.c(cpd):boolean");
    }

    public static void d(cpa cpaVar, cqf cqfVar, int i, boolean z) {
        if (cpaVar.c()) {
            if (i == 0) {
                a(1, cpaVar, cqfVar, z);
            } else {
                b(1, cpaVar, cqfVar);
            }
        }
    }

    private static void e(int i, cqf cqfVar, cpd cpdVar, boolean z) {
        float f = cpdVar.af;
        cpc cpcVar = cpdVar.K;
        int iA = cpcVar.e.a();
        cpc cpcVar2 = cpdVar.M;
        int iA2 = cpcVar2.e.a();
        int iB = cpcVar.b() + iA;
        int iB2 = iA2 - cpcVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iJ = cpdVar.j();
        int i2 = (iB2 - iB) - iJ;
        if (iB > iB2) {
            i2 = (iB - iB2) - iJ;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iJ;
        if (iB > iB2) {
            i4 = i3 - iJ;
        }
        cpdVar.x(i3, i4);
        a(i + 1, cpdVar, cqfVar, z);
    }

    private static void f(int i, cpd cpdVar, cqf cqfVar, cpd cpdVar2, boolean z) {
        float f = cpdVar2.af;
        cpc cpcVar = cpdVar2.K;
        int iA = cpcVar.e.a() + cpcVar.b();
        cpc cpcVar2 = cpdVar2.M;
        int iA2 = cpcVar2.e.a() - cpcVar2.b();
        if (iA2 >= iA) {
            int iJ = cpdVar2.j();
            int i2 = iA2 - iA;
            if (cpdVar2.ai != 8) {
                int i3 = cpdVar2.t;
                if (i3 == 2) {
                    iJ = (int) (cpdVar2.af * 0.5f * (cpdVar instanceof cpe ? cpdVar.j() : cpdVar.V.j()));
                } else if (i3 == 0) {
                    iJ = i2;
                }
                iJ = Math.max(cpdVar2.w, iJ);
                int i4 = cpdVar2.x;
                if (i4 > 0) {
                    iJ = Math.min(i4, iJ);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iJ)) + 0.5f));
            cpdVar2.x(i5, iJ + i5);
            a(i + 1, cpdVar2, cqfVar, z);
        }
    }

    private static void g(int i, cqf cqfVar, cpd cpdVar) {
        float f = cpdVar.ag;
        cpc cpcVar = cpdVar.L;
        int iA = cpcVar.e.a();
        cpc cpcVar2 = cpdVar.N;
        int iA2 = cpcVar2.e.a();
        int iB = cpcVar.b() + iA;
        int iB2 = iA2 - cpcVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = cpdVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iH;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iH;
        }
        cpdVar.y(i4, i5);
        b(i + 1, cpdVar, cqfVar);
    }

    private static void h(int i, cpd cpdVar, cqf cqfVar, cpd cpdVar2) {
        float f = cpdVar2.ag;
        cpc cpcVar = cpdVar2.L;
        int iA = cpcVar.e.a() + cpcVar.b();
        cpc cpcVar2 = cpdVar2.N;
        int iA2 = cpcVar2.e.a() - cpcVar2.b();
        if (iA2 >= iA) {
            int iH = cpdVar2.h();
            int i2 = iA2 - iA;
            if (cpdVar2.ai != 8) {
                int i3 = cpdVar2.u;
                if (i3 == 2) {
                    iH = (int) (f * 0.5f * (cpdVar instanceof cpe ? cpdVar.h() : cpdVar.V.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(cpdVar2.z, iH);
                int i4 = cpdVar2.A;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            cpdVar2.y(i5, iH + i5);
            b(i + 1, cpdVar2, cqfVar);
        }
    }
}
