package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ze {
    public static final yx a = new yx();
    public static int b = 0;
    public static int c = 0;

    public static void a(int i, yn ynVar, zs zsVar, boolean z) {
        ym ymVar;
        ym ymVar2;
        float f;
        boolean z2;
        boolean z3;
        ym ymVar3;
        ym ymVar4;
        if (ynVar.o) {
            return;
        }
        boolean z4 = true;
        b++;
        if (!(ynVar instanceof yo) && ynVar.J() && c(ynVar)) {
            yo.O(ynVar, zsVar, new yx());
        }
        ym ymVarK = ynVar.K(2);
        ym ymVarK2 = ynVar.K(4);
        int iA = ymVarK.a();
        int iA2 = ymVarK2.a();
        HashSet hashSet = ymVarK.a;
        if (hashSet != null && ymVarK.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                ym ymVar5 = (ym) it.next();
                yn ynVar2 = ymVar5.d;
                boolean zC = c(ynVar2);
                if (ynVar2.J() && zC) {
                    f = 0.0f;
                    yo.O(ynVar2, zsVar, new yx());
                } else {
                    f = 0.0f;
                }
                ym ymVar6 = ynVar2.K;
                if ((ymVar5 == ymVar6 && (ymVar4 = ynVar2.M.e) != null && ymVar4.c) || (ymVar5 == ynVar2.M && (ymVar3 = ymVar6.e) != null && ymVar3.c)) {
                    z3 = z4;
                    z2 = z3;
                } else {
                    z2 = z4;
                    z3 = false;
                }
                if (ynVar2.ar[0] != 3 || zC) {
                    if (!ynVar2.J()) {
                        if (ymVar5 == ymVar6 && ynVar2.M.e == null) {
                            int iB = ymVar6.b() + iA;
                            ynVar2.v(iB, ynVar2.h() + iB);
                            a(i2, ynVar2, zsVar, z);
                        } else {
                            ym ymVar7 = ynVar2.M;
                            if (ymVar5 == ymVar7 && ymVar6.e == null) {
                                int iB2 = iA - ymVar7.b();
                                ynVar2.v(iB2 - ynVar2.h(), iB2);
                                a(i2, ynVar2, zsVar, z);
                            } else if (z3 && !ynVar2.H()) {
                                e(i2, zsVar, ynVar2, z);
                            }
                        }
                    }
                } else if (ynVar2.x >= 0 && ynVar2.w >= 0 && ((ynVar2.ai == 8 || (ynVar2.t == 0 && ynVar2.Y == f)) && !ynVar2.H() && z3 && !ynVar2.H())) {
                    f(i2, ynVar, zsVar, ynVar2, z);
                }
                z4 = z2;
            }
        }
        boolean z5 = z4;
        if (ynVar instanceof yr) {
            return;
        }
        HashSet hashSet2 = ymVarK2.a;
        if (hashSet2 != null && ymVarK2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                ym ymVar8 = (ym) it2.next();
                yn ynVar3 = ymVar8.d;
                boolean zC2 = c(ynVar3);
                if (ynVar3.J() && zC2) {
                    yo.O(ynVar3, zsVar, new yx());
                }
                ym ymVar9 = ynVar3.K;
                boolean z6 = ((ymVar8 == ymVar9 && (ymVar2 = ynVar3.M.e) != null && ymVar2.c) || (ymVar8 == ynVar3.M && (ymVar = ymVar9.e) != null && ymVar.c)) ? z5 : false;
                if (ynVar3.ar[0] != 3 || zC2) {
                    if (!ynVar3.J()) {
                        if (ymVar8 == ymVar9 && ynVar3.M.e == null) {
                            int iB3 = ymVar9.b() + iA2;
                            ynVar3.v(iB3, ynVar3.h() + iB3);
                            a(i3, ynVar3, zsVar, z);
                        } else {
                            ym ymVar10 = ynVar3.M;
                            if (ymVar8 == ymVar10 && ymVar9.e == null) {
                                int iB4 = iA2 - ymVar10.b();
                                ynVar3.v(iB4 - ynVar3.h(), iB4);
                                a(i3, ynVar3, zsVar, z);
                            } else if (z6 && !ynVar3.H()) {
                                e(i3, zsVar, ynVar3, z);
                            }
                        }
                    }
                } else if (ynVar3.x >= 0 && ynVar3.w >= 0 && (ynVar3.ai == 8 || (ynVar3.t == 0 && ynVar3.Y == 0.0f))) {
                    if (!ynVar3.H() && z6 && !ynVar3.H()) {
                        f(i3, ynVar, zsVar, ynVar3, z);
                    }
                }
            }
        }
        ynVar.o = z5;
    }

    public static void b(int i, yn ynVar, zs zsVar) {
        ym ymVar;
        ym ymVar2;
        ym ymVar3;
        ym ymVar4;
        ym ymVar5;
        if (ynVar.p) {
            return;
        }
        c++;
        if (!(ynVar instanceof yo) && ynVar.J() && c(ynVar)) {
            yo.O(ynVar, zsVar, new yx());
        }
        ym ymVarK = ynVar.K(3);
        ym ymVarK2 = ynVar.K(5);
        int iA = ymVarK.a();
        int iA2 = ymVarK2.a();
        HashSet hashSet = ymVarK.a;
        if (hashSet != null && ymVarK.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int i2 = i + 1;
                ym ymVar6 = (ym) it.next();
                yn ynVar2 = ymVar6.d;
                boolean zC = c(ynVar2);
                if (ynVar2.J() && zC) {
                    yo.O(ynVar2, zsVar, new yx());
                }
                ym ymVar7 = ynVar2.L;
                boolean z = (ymVar6 == ymVar7 && (ymVar5 = ynVar2.N.e) != null && ymVar5.c) || (ymVar6 == ynVar2.N && (ymVar4 = ymVar7.e) != null && ymVar4.c);
                if (ynVar2.ar[1] != 3 || zC) {
                    if (!ynVar2.J()) {
                        if (ymVar6 == ymVar7 && ynVar2.N.e == null) {
                            int iB = ymVar7.b() + iA;
                            ynVar2.w(iB, ynVar2.g() + iB);
                            b(i2, ynVar2, zsVar);
                        } else {
                            ym ymVar8 = ynVar2.N;
                            if (ymVar6 == ymVar8 && ymVar7.e == null) {
                                int iB2 = iA - ymVar8.b();
                                ynVar2.w(iB2 - ynVar2.g(), iB2);
                                b(i2, ynVar2, zsVar);
                            } else if (z && !ynVar2.I()) {
                                g(i2, zsVar, ynVar2);
                            }
                        }
                    }
                } else if (ynVar2.A >= 0 && ynVar2.z >= 0 && (ynVar2.ai == 8 || (ynVar2.u == 0 && ynVar2.Y == 0.0f))) {
                    if (!ynVar2.I() && z && !ynVar2.I()) {
                        h(i2, ynVar, zsVar, ynVar2);
                    }
                }
            }
        }
        if (ynVar instanceof yr) {
            return;
        }
        HashSet hashSet2 = ymVarK2.a;
        if (hashSet2 != null && ymVarK2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                int i3 = i + 1;
                ym ymVar9 = (ym) it2.next();
                yn ynVar3 = ymVar9.d;
                boolean zC2 = c(ynVar3);
                if (ynVar3.J() && zC2) {
                    yo.O(ynVar3, zsVar, new yx());
                }
                ym ymVar10 = ynVar3.L;
                boolean z2 = (ymVar9 == ymVar10 && (ymVar3 = ynVar3.N.e) != null && ymVar3.c) || (ymVar9 == ynVar3.N && (ymVar2 = ymVar10.e) != null && ymVar2.c);
                if (ynVar3.ar[1] != 3 || zC2) {
                    if (ynVar3.J()) {
                        continue;
                    } else if (ymVar9 == ymVar10 && ynVar3.N.e == null) {
                        int iB3 = ymVar10.b() + iA2;
                        ynVar3.w(iB3, ynVar3.g() + iB3);
                        b(i3, ynVar3, zsVar);
                    } else {
                        ym ymVar11 = ynVar3.N;
                        if (ymVar9 == ymVar11 && ymVar10.e == null) {
                            int iB4 = iA2 - ymVar11.b();
                            ynVar3.w(iB4 - ynVar3.g(), iB4);
                            b(i3, ynVar3, zsVar);
                        } else if (z2 && !ynVar3.I()) {
                            g(i3, zsVar, ynVar3);
                        }
                    }
                } else if (ynVar3.A >= 0 && ynVar3.z >= 0 && (ynVar3.ai == 8 || (ynVar3.u == 0 && ynVar3.Y == 0.0f))) {
                    if (!ynVar3.I() && z2 && !ynVar3.I()) {
                        h(i3, ynVar, zsVar, ynVar3);
                    }
                }
            }
        }
        ym ymVarK3 = ynVar.K(6);
        if (ymVarK3.a != null && ymVarK3.c) {
            int iA3 = ymVarK3.a();
            Iterator it3 = ymVarK3.a.iterator();
            while (it3.hasNext()) {
                int i4 = i + 1;
                ym ymVar12 = (ym) it3.next();
                yn ynVar4 = ymVar12.d;
                boolean zC3 = c(ynVar4);
                if (ynVar4.J() && zC3) {
                    yo.O(ynVar4, zsVar, new yx());
                }
                if (ynVar4.ar[1] != 3 || zC3) {
                    if (!ynVar4.J() && ymVar12 == (ymVar = ynVar4.O)) {
                        int iB5 = ymVar12.b() + iA3;
                        if (ynVar4.G) {
                            int i5 = iB5 - ynVar4.ac;
                            int i6 = ynVar4.X + i5;
                            ynVar4.ab = i5;
                            ynVar4.L.e(i5);
                            ynVar4.N.e(i6);
                            ymVar.e(iB5);
                            ynVar4.n = true;
                        }
                        b(i4, ynVar4, zsVar);
                    }
                }
            }
        }
        ynVar.p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(defpackage.yn r8) {
        /*
            int[] r0 = r8.ar
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r0 = r0[r3]
            yn r4 = r8.V
            if (r4 != 0) goto Ld
            r4 = 0
        Ld:
            if (r4 == 0) goto L13
            int[] r5 = r4.ar
            r5 = r5[r1]
        L13:
            if (r4 == 0) goto L19
            int[] r4 = r4.ar
            r4 = r4[r3]
        L19:
            r4 = 2
            r5 = 0
            r6 = 3
            if (r2 == r3) goto L4b
            boolean r7 = r8.e()
            if (r7 != 0) goto L4b
            if (r2 == r4) goto L4b
            if (r2 != r6) goto L39
            int r2 = r8.t
            if (r2 != 0) goto L3d
            float r2 = r8.Y
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L3d
            boolean r2 = r8.F(r1)
            if (r2 != 0) goto L4b
            goto L3d
        L39:
            if (r2 == r6) goto L3d
        L3b:
            r2 = r1
            goto L4c
        L3d:
            int r2 = r8.t
            if (r2 != r3) goto L3b
            int r2 = r8.h()
            boolean r2 = r8.G(r1, r2)
            if (r2 == 0) goto L3b
        L4b:
            r2 = r3
        L4c:
            if (r0 == r3) goto L7b
            boolean r7 = r8.f()
            if (r7 != 0) goto L7b
            if (r0 == r4) goto L7b
            if (r0 != r6) goto L69
            int r0 = r8.u
            if (r0 != 0) goto L6d
            float r0 = r8.Y
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L6d
            boolean r0 = r8.F(r3)
            if (r0 != 0) goto L7b
            goto L6d
        L69:
            if (r0 == r6) goto L6d
        L6b:
            r0 = r1
            goto L7c
        L6d:
            int r0 = r8.u
            if (r0 != r3) goto L6b
            int r0 = r8.g()
            boolean r0 = r8.G(r3, r0)
            if (r0 == 0) goto L6b
        L7b:
            r0 = r3
        L7c:
            float r8 = r8.Y
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 <= 0) goto L8a
            if (r2 != 0) goto L89
            if (r0 != 0) goto L89
            r0 = r1
            r2 = r0
            goto L8a
        L89:
            return r3
        L8a:
            if (r2 == 0) goto L8f
            if (r0 == 0) goto L8f
            return r3
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze.c(yn):boolean");
    }

    public static void d(yj yjVar, zs zsVar, int i, boolean z) {
        if (yjVar.c()) {
            if (i == 0) {
                a(1, yjVar, zsVar, z);
            } else {
                b(1, yjVar, zsVar);
            }
        }
    }

    private static void e(int i, zs zsVar, yn ynVar, boolean z) {
        float f = ynVar.af;
        ym ymVar = ynVar.K;
        int iA = ymVar.e.a();
        ym ymVar2 = ynVar.M;
        int iA2 = ymVar2.e.a();
        int iB = ymVar.b() + iA;
        int iB2 = iA2 - ymVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iH = ynVar.h();
        int i2 = (iB2 - iB) - iH;
        if (iB > iB2) {
            i2 = (iB - iB2) - iH;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iB;
        int i4 = i3 + iH;
        if (iB > iB2) {
            i4 = i3 - iH;
        }
        ynVar.v(i3, i4);
        a(i + 1, ynVar, zsVar, z);
    }

    private static void f(int i, yn ynVar, zs zsVar, yn ynVar2, boolean z) {
        float f = ynVar2.af;
        ym ymVar = ynVar2.K;
        int iA = ymVar.e.a() + ymVar.b();
        ym ymVar2 = ynVar2.M;
        int iA2 = ymVar2.e.a() - ymVar2.b();
        if (iA2 >= iA) {
            int iH = ynVar2.h();
            int i2 = iA2 - iA;
            if (ynVar2.ai != 8) {
                int i3 = ynVar2.t;
                if (i3 == 2) {
                    iH = (int) (ynVar2.af * 0.5f * (ynVar instanceof yo ? ynVar.h() : ynVar.V.h()));
                } else if (i3 == 0) {
                    iH = i2;
                }
                iH = Math.max(ynVar2.w, iH);
                int i4 = ynVar2.x;
                if (i4 > 0) {
                    iH = Math.min(i4, iH);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iH)) + 0.5f));
            ynVar2.v(i5, iH + i5);
            a(i + 1, ynVar2, zsVar, z);
        }
    }

    private static void g(int i, zs zsVar, yn ynVar) {
        float f = ynVar.ag;
        ym ymVar = ynVar.L;
        int iA = ymVar.e.a();
        ym ymVar2 = ynVar.N;
        int iA2 = ymVar2.e.a();
        int iB = ymVar.b() + iA;
        int iB2 = iA2 - ymVar2.b();
        if (iA == iA2) {
            iB2 = iA2;
        }
        if (iA == iA2) {
            iB = iA;
        }
        if (iA == iA2) {
            f = 0.5f;
        }
        int iG = ynVar.g();
        int i2 = (iB2 - iB) - iG;
        if (iB > iB2) {
            i2 = (iB - iB2) - iG;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iB + i3;
        int i5 = i4 + iG;
        if (iB > iB2) {
            i4 = iB - i3;
            i5 = i4 - iG;
        }
        ynVar.w(i4, i5);
        b(i + 1, ynVar, zsVar);
    }

    private static void h(int i, yn ynVar, zs zsVar, yn ynVar2) {
        float f = ynVar2.ag;
        ym ymVar = ynVar2.L;
        int iA = ymVar.e.a() + ymVar.b();
        ym ymVar2 = ynVar2.N;
        int iA2 = ymVar2.e.a() - ymVar2.b();
        if (iA2 >= iA) {
            int iG = ynVar2.g();
            int i2 = iA2 - iA;
            if (ynVar2.ai != 8) {
                int i3 = ynVar2.u;
                if (i3 == 2) {
                    iG = (int) (f * 0.5f * (ynVar instanceof yo ? ynVar.g() : ynVar.V.g()));
                } else if (i3 == 0) {
                    iG = i2;
                }
                iG = Math.max(ynVar2.z, iG);
                int i4 = ynVar2.A;
                if (i4 > 0) {
                    iG = Math.min(i4, iG);
                }
            }
            int i5 = iA + ((int) ((f * (i2 - iG)) + 0.5f));
            ynVar2.w(i5, iG + i5);
            b(i + 1, ynVar2, zsVar);
        }
    }
}
