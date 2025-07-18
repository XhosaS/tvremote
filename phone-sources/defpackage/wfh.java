package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wfh extends wcq {
    public wfh() {
        super(null);
    }

    public static double aO(wfv wfvVar) {
        return aP(wfvVar, 0.0d, 100.0d);
    }

    public static double aP(wfv wfvVar, double d, double d2) {
        return vyf.e(d, d2, aS(wfvVar.b, wfvVar.c, 100.0d, true));
    }

    public static double aQ(wfv wfvVar, double d, double d2) {
        return vyf.e(d, d2, aS(wfvVar.b, wfvVar.c, 0.0d, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r0 r3
  0x0008: PHI (r0v9 double) = (r0v0 double), (r0v3 double) binds: [B:3:0x0006, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0008: PHI (r3v7 double) = (r3v0 double), (r3v1 double) binds: [B:3:0x0006, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010 A[PHI: r1 r3
  0x0010: PHI (r1v2 double) = (r1v0 double), (r1v1 double) binds: [B:6:0x000e, B:15:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0010: PHI (r3v4 double) = (r3v0 double), (r3v1 double) binds: [B:6:0x000e, B:15:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.wfj aR(double r7) {
        /*
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r3 = 4613937818241073152(0x4008000000000000, double:3.0)
            if (r2 != 0) goto La
        L8:
            r7 = r0
            goto L3f
        La:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 4616752568008179712(0x4012000000000000, double:4.5)
            if (r0 != 0) goto L13
        L10:
            r7 = r3
            r3 = r1
            goto L3f
        L13:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r3 = 4619567317775286272(0x401c000000000000, double:7.0)
            if (r0 != 0) goto L1b
            r7 = r1
            goto L3f
        L1b:
            r0 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L22
            goto L8
        L22:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 4622382067542392832(0x4026000000000000, double:11.0)
            if (r0 != 0) goto L29
            goto L10
        L29:
            r5 = 4621256167635550208(0x4022000000000000, double:9.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L32
            r3 = r1
            r7 = r5
            goto L3f
        L32:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r5 = 4626604192193052672(0x4035000000000000, double:21.0)
            if (r0 != 0) goto L3b
            r7 = r1
            r3 = r5
            goto L3f
        L3b:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L45
        L3f:
            wfj r0 = new wfj
            r0.<init>(r7, r3)
            return r0
        L45:
            wfj r7 = new wfj
            r7.<init>(r5, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfh.aR(double):wfj");
    }

    private static double aS(double d, double d2, double d3, boolean z) {
        double d4;
        double d5;
        double d6;
        wfs wfsVarA = wfs.a(d, d2, d3);
        loop0: while (true) {
            d4 = d3;
            do {
                d5 = wfsVarA.b;
                if (d5 >= d2 || d3 < 0.0d || d3 > 100.0d) {
                    break loop0;
                }
                d3 += true != z ? 1.0d : -1.0d;
                wfs wfsVarA2 = wfs.a(d, d2, d3);
                d6 = wfsVarA2.b;
                if (d5 < d6) {
                    wfsVarA = wfsVarA2;
                }
            } while (d5 >= d6);
        }
        return d4;
    }

    @Override // defpackage.wcq
    public final wfv A(wfs wfsVar) {
        double dA = wfo.a(wfsVar, new double[]{0.0d, 20.0d, 71.0d, 161.0d, 333.0d, 360.0d}, new double[]{-40.0d, 48.0d, -32.0d, 40.0d, -32.0d});
        if (Math.min(5, 5) <= 0) {
            dA = 0.0d;
        }
        return wfv.b(vyf.g(wfsVar.a + dA), 28.0d);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.wcq
    public final double d(wfo wfoVar, wfn wfnVar) {
        ?? r9;
        double dE;
        ?? r6;
        ?? r2 = wfnVar.i;
        wfq wfqVar = r2 == 0 ? null : (wfq) r2.apply(wfoVar);
        if (wfqVar != null) {
            double d = (wfqVar.e == 4 && wfoVar.b) ? -wfqVar.c : wfqVar.c;
            int i = wfqVar.f;
            wfn wfnVar2 = wfqVar.b;
            wfn wfnVar3 = wfqVar.a;
            String str = (String) wfnVar.b;
            boolean zEquals = str.equals(wfnVar3.b);
            wfn wfnVar4 = true != zEquals ? wfnVar2 : wfnVar3;
            if (true != zEquals) {
                wfnVar2 = wfnVar3;
            }
            double dDoubleValue = ((Double) wfnVar4.d.apply(wfoVar)).doubleValue();
            double dB = wfnVar2.b(wfoVar);
            int i2 = i - 1;
            double d2 = d * (true != zEquals ? -1 : 1);
            double d3 = dB + d2;
            if (i2 == 0) {
                dE = vyf.e(0.0d, 100.0d, d3);
            } else if (i2 != 1) {
                dE = d2 > 0.0d ? vyf.e(d3, 100.0d, dDoubleValue) : vyf.e(0.0d, d3, dDoubleValue);
            } else {
                if (d2 <= 0.0d) {
                    d3 = dB;
                    dB = d3;
                }
                dE = vyf.e(0.0d, 100.0d, vyf.e(dB, d3, dDoubleValue));
            }
            ?? r4 = wfnVar.f;
            if (r4 != 0 && (r6 = wfnVar.h) != 0) {
                wfn wfnVar5 = (wfn) r4.apply(wfoVar);
                wfj wfjVar = (wfj) r6.apply(wfoVar);
                if (wfnVar5 != null && wfjVar != null) {
                    double dB2 = wfnVar5.b(wfoVar);
                    double d4 = wfoVar.c;
                    double dA = wfjVar.a();
                    if (wbb.m(dB2, dE) < dA) {
                        dE = wfn.a(dB2, dA);
                    }
                }
            }
            double d5 = dE;
            return (!wfnVar.a || str.endsWith("_fixed_dim")) ? d5 : d5 >= 57.0d ? vyf.e(65.0d, 100.0d, d5) : vyf.e(0.0d, 49.0d, d5);
        }
        double dDoubleValue2 = ((Double) wfnVar.d.apply(wfoVar)).doubleValue();
        ?? r42 = wfnVar.f;
        if (r42 != 0 && r42.apply(wfoVar) != null && (r9 = wfnVar.h) != 0 && r9.apply(wfoVar) != null) {
            double dB3 = ((wfn) r42.apply(wfoVar)).b(wfoVar);
            wfj wfjVar2 = (wfj) r9.apply(wfoVar);
            double d6 = wfoVar.c;
            double dA2 = wfjVar2.a();
            if (wbb.m(dB3, dDoubleValue2) < dA2) {
                dDoubleValue2 = wfn.a(dB3, dA2);
            }
            double dE2 = dDoubleValue2;
            if (wfnVar.a && !((String) wfnVar.b).endsWith("_fixed_dim")) {
                dE2 = dE2 >= 57.0d ? vyf.e(65.0d, 100.0d, dE2) : vyf.e(0.0d, 49.0d, dE2);
            }
            dDoubleValue2 = dE2;
            ?? r1 = wfnVar.g;
            if (r1 != 0 && r1.apply(wfoVar) != null) {
                double dB4 = ((wfn) r42.apply(wfoVar)).b(wfoVar);
                double dB5 = ((wfn) r1.apply(wfoVar)).b(wfoVar);
                double dMax = Math.max(dB4, dB5);
                double dMin = Math.min(dB4, dB5);
                if (wbb.m(dMax, dDoubleValue2) < dA2 || wbb.m(dMin, dDoubleValue2) < dA2) {
                    dDoubleValue2 = wbb.l(dMax, dA2);
                    double dK = wbb.k(dMin, dA2);
                    ArrayList arrayList = new ArrayList();
                    if (dDoubleValue2 != -1.0d) {
                        arrayList.add(Double.valueOf(dDoubleValue2));
                    }
                    if (dK != -1.0d) {
                        arrayList.add(Double.valueOf(dK));
                    }
                    if (!wfn.g(dB4) && !wfn.g(dB5)) {
                        if (arrayList.size() == 1) {
                            return ((Double) arrayList.get(0)).doubleValue();
                        }
                        if (dK < 0.0d) {
                            return 0.0d;
                        }
                        return dK;
                    }
                    if (dDoubleValue2 < 0.0d) {
                        return 100.0d;
                    }
                }
            }
        }
        return dDoubleValue2;
    }

    @Override // defpackage.wcq
    public final wfn e() {
        wfm wfmVarD = n().d();
        wfmVarD.a = "background";
        wfn wfnVarA = wfmVarD.a();
        wfm wfmVar = new wfm();
        wfmVar.a = "background";
        wfmVar.b = new wez(8);
        wfmVar.c = new wez(13);
        wfmVar.d = true;
        return wfmVar.a().d().b(wfnVarA).a();
    }

    @Override // defpackage.wcq
    public final wfn f() {
        wfm wfmVar = new wfm();
        wfmVar.a = "error";
        wfmVar.b = new wfd(6);
        wfmVar.c = new wfd(7);
        wfmVar.d = true;
        wfmVar.f = new wfb(this, 12);
        wfmVar.h = new wfd(8);
        wfmVar.i = new wfb(this, 13);
        return super.f().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn g() {
        wfm wfmVar = new wfm();
        wfmVar.a = "error_container";
        wfmVar.b = new wfg(18);
        wfmVar.c = new wfg(19);
        wfmVar.d = true;
        wfmVar.f = new wff(this, 7);
        wfmVar.i = new wfg(20);
        wfmVar.h = new wfk(1);
        return super.g().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn h() {
        wfm wfmVar = new wfm();
        wfmVar.a = "inverse_surface";
        wfmVar.b = new wfe(1);
        wfmVar.c = new wfe(0);
        wfmVar.d = true;
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "inverse_surface";
        wfmVar2.b = new wez(12);
        wfmVar2.c = new wez(14);
        wfmVar2.d = true;
        return wfmVar2.a().d().b(wfnVarA).a();
    }

    @Override // defpackage.wcq
    public final wfn i() {
        wfm wfmVar = new wfm();
        wfmVar.a = "on_surface";
        wfmVar.b = new wfc(1);
        int i = 0;
        wfmVar.c = new wfb(this, i);
        wfmVar.e = new wfc(i);
        int i2 = 2;
        wfmVar.f = new wfb(this, i2);
        wfmVar.h = new wfc(i2);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "on_surface";
        wfmVar2.b = new wex(12);
        wfmVar2.c = new wex(13);
        wfmVar2.f = new ssj(this, 3);
        wfmVar2.h = new wex(14);
        return wfmVar2.a().d().b(wfnVarA).a();
    }

    @Override // defpackage.wcq
    public final wfn j() {
        wfm wfmVar = new wfm();
        wfmVar.a = "primary";
        wfmVar.b = new wfe(9);
        wfmVar.c = new wfe(10);
        wfmVar.d = true;
        wfmVar.f = new wfb(this, 19);
        wfmVar.h = new wfe(11);
        wfmVar.i = new wfb(this, 20);
        return super.j().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn k() {
        wfm wfmVar = new wfm();
        wfmVar.a = "primary_container";
        wfmVar.b = new wfd(10);
        wfmVar.c = new wfd(11);
        wfmVar.d = true;
        wfmVar.f = new wfb(this, 14);
        wfmVar.i = new wfd(12);
        wfmVar.h = new wfd(13);
        return super.k().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn l() {
        wfm wfmVar = new wfm();
        wfmVar.a = "secondary";
        wfmVar.b = new wfc(19);
        wfmVar.c = new wfc(20);
        wfmVar.d = true;
        wfmVar.f = new wfb(this, 8);
        wfmVar.h = new wfd(1);
        wfmVar.i = new wfb(this, 9);
        return super.l().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn m() {
        wfm wfmVar = new wfm();
        wfmVar.a = "secondary_container";
        wfmVar.b = new wfg(8);
        wfmVar.c = new wfg(9);
        wfmVar.d = true;
        wfmVar.f = new wff(this, 4);
        wfmVar.i = new wfg(10);
        wfmVar.h = new wfg(11);
        return super.m().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn n() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface";
        wfmVar.b = new wfd(19);
        wfmVar.c = new wfd(20);
        wfmVar.d = true;
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "surface";
        wfmVar2.b = new wew(19);
        wfmVar2.c = new wew(20);
        wfmVar2.d = true;
        return wfmVar2.a().d().b(wfnVarA).a();
    }

    @Override // defpackage.wcq
    public final wfn o() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_bright";
        wfmVar.b = new wfg(12);
        wfmVar.c = new wfg(13);
        wfmVar.d = true;
        wfmVar.e = new wfg(14);
        return super.o().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn p() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_container_highest";
        wfmVar.b = new wfg(5);
        wfmVar.c = new wfg(6);
        wfmVar.d = true;
        wfmVar.e = new wfg(7);
        wfn wfnVarA = wfmVar.a();
        wfm wfmVar2 = new wfm();
        wfmVar2.a = "surface_container_highest";
        wfmVar2.b = new wey(10);
        wfmVar2.c = new wey(11);
        wfmVar2.d = true;
        return wfmVar2.a().d().b(wfnVarA).a();
    }

    @Override // defpackage.wcq
    public final wfn q() {
        wfm wfmVar = new wfm();
        wfmVar.a = "surface_dim";
        wfmVar.b = new wfc(11);
        wfmVar.c = new wfc(16);
        wfmVar.d = true;
        wfmVar.e = new wfd(2);
        return super.q().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn r() {
        wfm wfmVar = new wfm();
        wfmVar.a = "tertiary";
        wfmVar.b = new wfc(15);
        wfmVar.c = new wfc(17);
        wfmVar.d = true;
        wfmVar.f = new wfb(this, 6);
        wfmVar.h = new wfc(18);
        wfmVar.i = new wfb(this, 7);
        return super.r().d().b(wfmVar.a()).a();
    }

    @Override // defpackage.wcq
    public final wfn s() {
        wfm wfmVar = new wfm();
        wfmVar.a = "tertiary_container";
        wfmVar.b = new wfd(14);
        int i = 15;
        wfmVar.c = new wfd(i);
        wfmVar.d = true;
        wfmVar.f = new wfb(this, i);
        wfmVar.i = new wfd(17);
        wfmVar.h = new wfd(18);
        return super.s().d().b(wfmVar.a()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.wcq
    public final wfs t(wfo wfoVar, wfn wfnVar) {
        wfv wfvVar = (wfv) wfnVar.c.apply(wfoVar);
        double d = d(wfoVar, wfnVar);
        double d2 = wfvVar.b;
        ?? r9 = wfnVar.e;
        return wfs.a(d2, wfvVar.c * (r9 == 0 ? 1.0d : ((Double) r9.apply(wfoVar)).doubleValue()), d);
    }

    @Override // defpackage.wcq
    public final Optional v(wfs wfsVar) {
        return Optional.of(wfv.b(wfo.a(wfsVar, new double[]{0.0d, 3.0d, 13.0d, 23.0d, 33.0d, 43.0d, 153.0d, 273.0d, 360.0d}, new double[]{12.0d, 22.0d, 32.0d, 12.0d, 22.0d, 32.0d, 22.0d, 12.0d}), 60.0d));
    }

    @Override // defpackage.wcq
    public final wfv w(wfs wfsVar) {
        return wfv.b(wfsVar.a, 5.0d);
    }

    @Override // defpackage.wcq
    public final wfv x(wfs wfsVar) {
        return wfv.b(wfsVar.a, 8.5d);
    }

    @Override // defpackage.wcq
    public final wfv y(wfs wfsVar, boolean z) {
        return wfv.b(wfsVar.a, true != z ? 32.0d : 26.0d);
    }

    @Override // defpackage.wcq
    public final wfv z(wfs wfsVar) {
        return wfv.b(wfsVar.a, 16.0d);
    }
}
