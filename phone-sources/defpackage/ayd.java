package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayd {
    public final yjk a;
    public final yjv b;
    public final bdy d;
    public final bcb e;
    public final bdl f;
    public final pku h;
    private final yjv i;
    private final yjk j;
    private final bcb k;
    private final bdy l;
    private final bcb m;
    private final bdl n;
    public final bhi g = new bhi((byte[]) null, (byte[]) null);
    public final uf c = new ayc(this);

    public ayd(Object obj, yjv yjvVar, yjk yjkVar, yjk yjkVar2, yjv yjvVar2) {
        this.i = yjvVar;
        this.j = yjkVar;
        this.a = yjkVar2;
        this.b = yjvVar2;
        bcz bczVar = bcz.c;
        this.k = new bci(obj, bczVar);
        awa awaVar = new awa(this, 3);
        ivx ivxVar = bdt.a;
        this.l = new bbh(awaVar, null);
        this.d = new bbh(new awa(this, 4), null);
        this.n = new bce(Float.NaN);
        new bbh(new awa(this, 5), bczVar);
        this.f = new bce(0.0f);
        this.m = new bci(null, bczVar);
        this.e = new bci(new ayv(yhc.a), bczVar);
        this.h = new pku(this);
    }

    public final float a(float f) {
        float fC = c(f);
        float fB = Float.isNaN(b()) ? 0.0f : b();
        m(fC);
        return fC - fB;
    }

    public final float b() {
        return this.n.e();
    }

    public final float c(float f) {
        Float fValueOf;
        float fB = (Float.isNaN(b()) ? 0.0f : b()) + f;
        float fA = n().a();
        Collection collectionValues = n().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return ykn.i(fB, fA, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float d() {
        if (Float.isNaN(b())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.rv r8, defpackage.yka r9, defpackage.yih r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.axz
            if (r0 == 0) goto L13
            r0 = r10
            axz r0 = (defpackage.axz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            axz r0 = new axz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            defpackage.ybn.f(r10)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r8 = move-exception
            goto L7f
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ybn.f(r10)
            bhi r10 = r7.g     // Catch: java.lang.Throwable -> L29
            ahk r2 = new ahk     // Catch: java.lang.Throwable -> L29
            r5 = 0
            r6 = 2
            r2.<init>(r7, r9, r5, r6)     // Catch: java.lang.Throwable -> L29
            r0.c = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r10.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r8 == r1) goto L7e
        L47:
            ayv r8 = r7.n()
            float r9 = r7.b()
            java.lang.Object r8 = r8.c(r9)
            if (r8 == 0) goto L7b
            float r9 = r7.b()
            ayv r10 = r7.n()
            float r10 = r10.b(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L7b
            yjv r9 = r7.b
            java.lang.Object r9 = r9.a(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L7b
            r7.k(r8)
        L7b:
            ygi r8 = defpackage.ygi.a
            return r8
        L7e:
            return r1
        L7f:
            ayv r9 = r7.n()
            float r10 = r7.b()
            java.lang.Object r9 = r9.c(r10)
            if (r9 == 0) goto Lb4
            float r10 = r7.b()
            ayv r0 = r7.n()
            float r0 = r0.b(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lb4
            yjv r10 = r7.b
            java.lang.Object r10 = r10.a(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lb1
            goto Lb4
        Lb1:
            r7.k(r9)
        Lb4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayd.e(rv, yka, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.lang.Object r13, defpackage.rv r14, defpackage.ykb r15, defpackage.yih r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r2 = r0 instanceof defpackage.aya
            if (r2 == 0) goto L15
            r2 = r0
            aya r2 = (defpackage.aya) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.c = r3
            goto L1a
        L15:
            aya r2 = new aya
            r2.<init>(r12, r0)
        L1a:
            r6 = r2
            java.lang.Object r0 = r6.a
            yio r7 = defpackage.yio.a
            int r2 = r6.c
            r8 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L37
            if (r2 != r10) goto L2f
            defpackage.ybn.f(r0)     // Catch: java.lang.Throwable -> L2d
            goto L58
        L2d:
            r0 = move-exception
            goto L91
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L37:
            defpackage.ybn.f(r0)
            ayv r0 = r12.n()
            boolean r0 = r0.e(r13)
            if (r0 == 0) goto Lca
            bhi r11 = r12.g     // Catch: java.lang.Throwable -> L2d
            om r0 = new om     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r5 = 2
            r1 = r12
            r2 = r13
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2d
            r6.c = r10     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r11.d(r14, r0, r6)     // Catch: java.lang.Throwable -> L2d
            if (r0 == r7) goto L90
        L58:
            r12.l(r9)
            ayv r0 = r12.n()
            float r2 = r12.b()
            java.lang.Object r0 = r0.c(r2)
            if (r0 == 0) goto Lcd
            float r2 = r12.b()
            ayv r3 = r12.n()
            float r3 = r3.b(r0)
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 > 0) goto Lcd
            yjv r2 = r12.b
            java.lang.Object r2 = r2.a(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lcd
            r12.k(r0)
            goto Lcd
        L90:
            return r7
        L91:
            r12.l(r9)
            ayv r2 = r12.n()
            float r3 = r12.b()
            java.lang.Object r2 = r2.c(r3)
            if (r2 == 0) goto Lc9
            float r3 = r12.b()
            ayv r4 = r12.n()
            float r4 = r4.b(r2)
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 > 0) goto Lc9
            yjv r3 = r12.b
            java.lang.Object r3 = r3.a(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Lc6
            goto Lc9
        Lc6:
            r12.k(r2)
        Lc9:
            throw r0
        Lca:
            r12.k(r13)
        Lcd:
            ygi r0 = defpackage.ygi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayd.f(java.lang.Object, rv, ykb, yih):java.lang.Object");
    }

    public final Object g(float f, Object obj, float f2) {
        ayv ayvVarN = n();
        float fB = ayvVarN.b(obj);
        float fFloatValue = ((Number) this.j.a()).floatValue();
        if (fB != f && !Float.isNaN(fB)) {
            if (fB < f) {
                if (f2 >= fFloatValue) {
                    Object objD = ayvVarN.d(f, true);
                    objD.getClass();
                    return objD;
                }
                Object objD2 = ayvVarN.d(f, true);
                objD2.getClass();
                if (f >= Math.abs(fB + Math.abs(((Number) this.i.a(Float.valueOf(Math.abs(ayvVarN.b(objD2) - fB)))).floatValue()))) {
                    return objD2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objD3 = ayvVarN.d(f, false);
                    objD3.getClass();
                    return objD3;
                }
                Object objD4 = ayvVarN.d(f, false);
                objD4.getClass();
                float fAbs = Math.abs(fB - Math.abs(((Number) this.i.a(Float.valueOf(Math.abs(fB - ayvVarN.b(objD4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objD4;
                }
            }
        }
        return obj;
    }

    public final Object h() {
        return this.k.a();
    }

    public final Object i() {
        return this.m.a();
    }

    public final Object j() {
        return this.l.a();
    }

    public final void k(Object obj) {
        this.k.b(obj);
    }

    public final void l(Object obj) {
        this.m.b(obj);
    }

    public final void m(float f) {
        this.n.h(f);
    }

    public final ayv n() {
        return (ayv) this.e.a();
    }
}
