package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoz {
    public static final void A(yqe yqeVar) {
        if (!yqeVar.u()) {
            throw yqeVar.q();
        }
    }

    public static final boolean B(yil yilVar) {
        yqe yqeVar = (yqe) yilVar.get(yqe.c);
        if (yqeVar != null) {
            return yqeVar.u();
        }
        return true;
    }

    public static /* synthetic */ ypm E(yqe yqeVar, yqh yqhVar) {
        return v(yqeVar, true, yqhVar);
    }

    private static final Object F(yrd yrdVar, yjz yjzVar) {
        E(yrdVar, new ypn(h(yrdVar.e.getContext()).h(yrdVar.b, yrdVar, ((ynw) yrdVar).a)));
        return wae.I(yrdVar, false, yrdVar, yjzVar);
    }

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(yih yihVar) {
        Object objE;
        if (yihVar instanceof ywu) {
            return ((ywu) yihVar).toString();
        }
        try {
            objE = yihVar + "@" + b(yihVar);
        } catch (Throwable th) {
            objE = ybn.e(th);
        }
        if (yfy.a(objE) != null) {
            objE = yihVar.getClass().getName() + "@" + b(yihVar);
        }
        return (String) objE;
    }

    public static final long d(long j) {
        if (ynm.x(j)) {
            return ynm.k(ynm.o(j, ylh.p(999999L, yno.a)));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.yih r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ype
            if (r0 == 0) goto L13
            r0 = r4
            ype r0 = (defpackage.ype) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ype r0 = new ype
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            defpackage.ybn.f(r4)
            goto L47
        L2f:
            defpackage.ybn.f(r4)
            r0.b = r3
            yof r4 = new yof
            yih r0 = defpackage.wcq.S(r0)
            r4.<init>(r0, r3)
            r4.v()
            java.lang.Object r4 = r4.i()
            if (r4 != r1) goto L47
            return r1
        L47:
            yfs r4 = new yfs
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoz.e(yih):java.lang.Object");
    }

    public static final Object f(long j, yih yihVar) {
        if (j > 0) {
            yof yofVar = new yof(wcq.S(yihVar), 1);
            yofVar.v();
            if (j < Long.MAX_VALUE) {
                h(yofVar.b).c(j, yofVar);
            }
            Object objI = yofVar.i();
            if (objI == yio.a) {
                return objI;
            }
        }
        return ygi.a;
    }

    public static final Object g(long j, yih yihVar) {
        Object objF = f(d(j), yihVar);
        return objF == yio.a ? objF : ygi.a;
    }

    public static final ypd h(yil yilVar) {
        yij yijVar = yilVar.get(yii.k);
        ypd ypdVar = yijVar instanceof ypd ? (ypd) yijVar : null;
        return ypdVar == null ? ypb.a : ypdVar;
    }

    public static void i(int i, yjz yjzVar, Object obj, yih yihVar) {
        Object objA;
        int i2 = i - 1;
        if (i2 == 0) {
            wae.K(yjzVar, obj, yihVar);
            return;
        }
        if (i2 == 2) {
            yjzVar.getClass();
            wcq.S(wcq.R(yjzVar, obj, yihVar)).resumeWith(ygi.a);
            return;
        }
        if (i2 != 3) {
            return;
        }
        try {
            yil context = yihVar.getContext();
            Object objB = yxr.b(context, null);
            try {
                if (yjzVar instanceof yit) {
                    ylh.d(yjzVar, 2);
                    objA = yjzVar.a(obj, yihVar);
                } else {
                    objA = wcq.Q(yjzVar, obj, yihVar);
                }
                if (objA != yio.a) {
                    yihVar.resumeWith(objA);
                }
            } finally {
                yxr.c(context, objB);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof ypg) {
                th = ((ypg) th).a;
            }
            yihVar.resumeWith(ybn.e(th));
        }
    }

    public static boolean j(int i) {
        return i == 2;
    }

    public static final Object k(yjz yjzVar, yih yihVar) {
        yxl yxlVar = new yxl(yihVar.getContext(), yihVar);
        Object objH = wae.H(yxlVar, yxlVar, yjzVar);
        if (objH == yio.a) {
            yihVar.getClass();
        }
        return objH;
    }

    public static final yow l(yil yilVar) {
        if (yilVar.get(yqe.c) == null) {
            yilVar = yilVar.plus(new yqg(null));
        }
        return new ywq(yilVar);
    }

    public static final yow m() {
        yqy yqyVar = new yqy(null);
        yot yotVar = ypk.a;
        return new ywq(wcq.W(yqyVar, yxi.a));
    }

    public static final void n(yow yowVar, CancellationException cancellationException) {
        yqe yqeVar = (yqe) yowVar.c().get(yqe.c);
        if (yqeVar != null) {
            yqeVar.t(cancellationException);
        } else {
            Objects.toString(yowVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(yowVar)));
        }
    }

    public static final void o(yow yowVar, String str, Throwable th) {
        n(yowVar, ylh.aj(str, th));
    }

    public static final boolean p(yow yowVar) {
        yqe yqeVar = (yqe) yowVar.c().get(yqe.c);
        if (yqeVar != null) {
            return yqeVar.u();
        }
        return true;
    }

    public static final Object r(yih yihVar) {
        Object obj;
        yil context = yihVar.getContext();
        z(context);
        yih yihVarS = wcq.S(yihVar);
        ywu ywuVar = yihVarS instanceof ywu ? (ywu) yihVarS : null;
        if (ywuVar == null) {
            obj = ygi.a;
        } else {
            if (ywv.c(ywuVar.a, context)) {
                ywuVar.a(context, ygi.a);
            } else {
                yrj yrjVar = new yrj();
                yil yilVarPlus = context.plus(yrjVar);
                ygi ygiVar = ygi.a;
                ywuVar.a(yilVarPlus, ygiVar);
                if (yrjVar.a) {
                    boolean z = yoy.a;
                    ThreadLocal threadLocal = yra.a;
                    ypp yppVarA = yra.a();
                    if (yppVarA.q()) {
                        obj = ygi.a;
                    } else {
                        if (yppVarA.p()) {
                            ywuVar.c = ygiVar;
                            ywuVar.e = 1;
                            yppVarA.n(ywuVar);
                            obj = yio.a;
                        } else {
                            yppVarA.o(true);
                            try {
                                ywuVar.run();
                                do {
                                } while (yppVarA.r());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = ygi.a;
                        }
                    }
                }
            }
            obj = yio.a;
        }
        yio yioVar = yio.a;
        if (obj == yioVar) {
            yihVar.getClass();
        }
        return obj == yioVar ? obj : ygi.a;
    }

    public static final Object s(long j, yjz yjzVar, yih yihVar) {
        long jD = d(j);
        if (jD > 0) {
            return F(new yrd(jD, yihVar), yjzVar);
        }
        throw new yrc("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object t(long r7, defpackage.yjz r9, defpackage.yih r10) {
        /*
            boolean r0 = r10 instanceof defpackage.yre
            if (r0 == 0) goto L13
            r0 = r10
            yre r0 = (defpackage.yre) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yre r0 = new yre
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            long r7 = r0.a
            ylf r7 = r0.e
            java.lang.Object r8 = r0.b
            defpackage.ybn.f(r10)     // Catch: defpackage.yrc -> L2e
            return r10
        L2e:
            r8 = move-exception
            goto L66
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            defpackage.ybn.f(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L42
            return r3
        L42:
            ylf r10 = new ylf
            r10.<init>()
            r0.b = r9     // Catch: defpackage.yrc -> L63
            r0.e = r10     // Catch: defpackage.yrc -> L63
            r0.a = r7     // Catch: defpackage.yrc -> L63
            r0.d = r4     // Catch: defpackage.yrc -> L63
            yrd r2 = new yrd     // Catch: defpackage.yrc -> L63
            r2.<init>(r7, r0)     // Catch: defpackage.yrc -> L63
            r10.a = r2     // Catch: defpackage.yrc -> L63
            java.lang.Object r7 = F(r2, r9)     // Catch: defpackage.yrc -> L63
            if (r7 != r1) goto L5f
            r0.getClass()     // Catch: defpackage.yrc -> L63
        L5f:
            if (r7 != r1) goto L62
            return r1
        L62:
            return r7
        L63:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L66:
            yqe r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L6d
            return r3
        L6d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yoz.t(long, yjz, yih):java.lang.Object");
    }

    public static final Object u(yqe yqeVar, yih yihVar) {
        yqeVar.t(null);
        Object objP = yqeVar.p(yihVar);
        return objP == yio.a ? objP : ygi.a;
    }

    public static final ypm v(yqe yqeVar, boolean z, yqh yqhVar) {
        return yqeVar instanceof yql ? ((yql) yqeVar).G(z, yqhVar) : yqeVar.s(yqhVar.b(), z, new ahf(yqhVar, 9, (short[][]) null));
    }

    public static final yqe w(yil yilVar) {
        yqe yqeVar = (yqe) yilVar.get(yqe.c);
        if (yqeVar != null) {
            return yqeVar;
        }
        Objects.toString(yilVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(yilVar)));
    }

    public static final void x(yil yilVar, CancellationException cancellationException) {
        yqe yqeVar = (yqe) yilVar.get(yqe.c);
        if (yqeVar != null) {
            yqeVar.t(cancellationException);
        }
    }

    public static final void y(yqe yqeVar, String str, Throwable th) {
        yqeVar.t(ylh.aj(str, th));
    }

    public static final void z(yil yilVar) {
        yqe yqeVar = (yqe) yilVar.get(yqe.c);
        if (yqeVar != null) {
            A(yqeVar);
        }
    }
}
