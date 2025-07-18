package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qno implements qmt {
    public static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final qjq c;
    private final qms d;

    public qno(Context context, qei qeiVar, qjq qjqVar, qms qmsVar) {
        qeiVar.getClass();
        qjqVar.getClass();
        this.b = context;
        this.c = qjqVar;
        this.d = qmsVar;
    }

    @Override // defpackage.qmt
    public final vic a(qen qenVar) {
        String str;
        vtw vtwVarM = vic.a.m();
        vtwVarM.getClass();
        Context context = this.b;
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vic vicVar = (vic) vtwVarM.b;
        vicVar.b |= 1;
        vicVar.e = packageName;
        vtw vtwVarM2 = vib.a.m();
        vtwVarM2.getClass();
        ves.p(vtwVarM2);
        if (qenVar != null && (str = qenVar.i) != null) {
            ves.o(str, vtwVarM2);
        }
        vtw vtwVarM3 = vhf.a.m();
        vtwVarM3.getClass();
        vtw vtwVarM4 = vhj.a.m();
        vtwVarM4.getClass();
        String packageName2 = context.getApplicationContext().getPackageName();
        packageName2.getClass();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vhj vhjVar = (vhj) vtwVarM4.b;
        vhjVar.b |= 8;
        vhjVar.f = packageName2;
        Long lQ = qtl.Q(context);
        if (lQ != null) {
            long jLongValue = lQ.longValue();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            vhj vhjVar2 = (vhj) vtwVarM4.b;
            vhjVar2.b |= 16;
            vhjVar2.g = jLongValue;
        }
        if (xgm.a.get().b() || qenVar == null) {
            String strB = this.c.b();
            if (strB != null && strB.length() != 0) {
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vhj vhjVar3 = (vhj) vtwVarM4.b;
                vhjVar3.b |= 1;
                vhjVar3.c = strB;
            }
            Long lP = qtl.P(context);
            if (lP != null) {
                long jLongValue2 = lP.longValue();
                if (!vtwVarM4.b.A()) {
                    vtwVarM4.u();
                }
                vhj vhjVar4 = (vhj) vtwVarM4.b;
                vhjVar4.b |= 4;
                vhjVar4.e = jLongValue2;
            }
        }
        vuc vucVarR = vtwVarM4.r();
        vucVarR.getClass();
        ves.e((vhj) vucVarR, vtwVarM3);
        ves.n(ves.d(vtwVarM3), vtwVarM2);
        vib vibVarM = ves.m(vtwVarM2);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vic vicVar2 = (vic) vtwVarM.b;
        vicVar2.d = vibVarM;
        vicVar2.c = 1;
        vuc vucVarR2 = vtwVarM.r();
        vucVarR2.getClass();
        return (vic) vucVarR2;
    }

    @Override // defpackage.qmt
    public final vkk b(qen qenVar) {
        return d(qenVar, false);
    }

    @Override // defpackage.qmt
    public final Object c(qen qenVar, yih yihVar) {
        return e(qenVar, yihVar);
    }

    public final vkk d(qen qenVar, boolean z) {
        String str;
        ulp ulpVarO = vef.O(vkk.a.m());
        ulpVarO.Y(true != z ? 4 : 12);
        if (qenVar != null && (str = qenVar.i) != null) {
            ulpVarO.X(str);
        }
        vtw vtwVarM = viq.a.m();
        vtwVarM.getClass();
        vtw vtwVarM2 = vix.a.m();
        vtwVarM2.getClass();
        Context context = this.b;
        String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        vfi.A(packageName, vtwVarM2);
        vfi.C(this.c.c(), vtwVarM2);
        Long lP = qtl.P(context);
        if (lP != null) {
            vfi.z(lP.longValue(), vtwVarM2);
        }
        Long lQ = qtl.Q(context);
        if (lQ != null) {
            vfi.B(lQ.longValue(), vtwVarM2);
        }
        ves.g(vfi.y(vtwVarM2), vtwVarM);
        ulpVarO.W(ves.f(vtwVarM));
        return ulpVarO.V();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.qen r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qnn
            if (r0 == 0) goto L13
            r0 = r6
            qnn r0 = (defpackage.qnn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qnn r0 = new qnn
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ulp r5 = r0.e
            ulp r0 = r0.d
            defpackage.ybn.f(r6)
            goto L71
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r6)
            vkl r6 = defpackage.vkl.a
            vtw r6 = r6.m()
            ulp r6 = defpackage.ves.B(r6)
            android.content.Context r2 = r4.b
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r2 = r2.getPackageName()
            r2.getClass()
            r6.T(r2)
            r2 = 0
            vkk r2 = r4.d(r5, r2)
            r6.U(r2)
            qms r2 = r4.d
            if (r5 == 0) goto L61
            qpv r5 = r5.b()
            goto L62
        L61:
            r5 = 0
        L62:
            r0.d = r6
            r0.e = r6
            r0.c = r3
            java.lang.Object r5 = r2.a(r5, r0)
            if (r5 == r1) goto Lb4
            r0 = r6
            r6 = r5
            r5 = r0
        L71:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Laf
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L7c
            goto Laf
        L7c:
            java.lang.Object r5 = r5.a
            vtw r5 = (defpackage.vtw) r5
            vuc r1 = r5.b
            vkl r1 = (defpackage.vkl) r1
            vun r1 = r1.f
            java.util.List r1 = j$.util.DesugarCollections.unmodifiableList(r1)
            r1.getClass()
            vuc r1 = r5.b
            boolean r1 = r1.A()
            if (r1 != 0) goto L98
            r5.u()
        L98:
            vuc r5 = r5.b
            vkl r5 = (defpackage.vkl) r5
            vun r1 = r5.f
            boolean r2 = r1.c()
            if (r2 != 0) goto Laa
            vun r1 = defpackage.vuc.s(r1)
            r5.f = r1
        Laa:
            vun r5 = r5.f
            defpackage.vsf.h(r6, r5)
        Laf:
            vkl r5 = r0.S()
            return r5
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qno.e(qen, yih):java.lang.Object");
    }
}
