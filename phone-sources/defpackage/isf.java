package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isf {
    public final Context a;
    public String b;
    public wom c;
    public final hfx d;
    public final hfx e;
    public final hfx f;
    public final hfx g;
    public final hfx h;
    public final hfx i;
    public final kdj j;
    private final iov k;
    private final hfx l;
    private final kw m;

    public isf(kdj kdjVar, iov iovVar, kw kwVar, Context context) {
        kdjVar.getClass();
        iovVar.getClass();
        this.j = kdjVar;
        this.k = iovVar;
        this.m = kwVar;
        this.a = context;
        hfx hfxVarB = kwVar.B(new gew(this, 12, (float[][]) null), itc.a);
        hfxVarB.d();
        this.l = hfxVarB.i();
        hfx hfxVarB2 = kwVar.B(new gew(this, 11, (boolean[][]) null), itc.b);
        hfxVarB2.d();
        this.d = hfxVarB2.i();
        hfx hfxVarB3 = kwVar.B(new gew((Object) this, 16, (int[][][]) null), itc.c);
        hfxVarB3.d();
        this.e = hfxVarB3.i();
        hfx hfxVarB4 = kwVar.B(new gew(this, 19, (byte[]) null, (byte[]) null), itc.d);
        hfxVarB4.d();
        this.f = hfxVarB4.i();
        hfx hfxVarB5 = kwVar.B(new gew(this, 18, (float[][][]) null), itc.e);
        hfxVarB5.d();
        this.g = hfxVarB5.i();
        hfx hfxVarB6 = kwVar.B(new gew(this, 17, (boolean[][][]) null), itc.f);
        hfxVarB6.d();
        this.h = hfxVarB6.i();
        hfx hfxVarC = kw.C(new gew((Object) this, 13, (byte[][][]) null));
        hfxVarC.d();
        this.i = hfxVarC.i();
        hfx hfxVarB7 = kwVar.B(new gew((Object) this, 15, (short[][][]) null), itc.i);
        hfxVarB7.d();
        hfxVarB7.i();
        hfx hfxVarC2 = kw.C(new gew((Object) this, 14, (char[][][]) null));
        hfxVarC2.d();
        hfxVarC2.i();
        this.b = "";
        vuc vucVarR = wom.a.m().r();
        vucVarR.getClass();
        this.c = (wom) vucVarR;
    }

    private final Object k(List list, yih yihVar) {
        Object objD = this.k.d(list, yihVar);
        return objD == yio.a ? objD : ygi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (k(r9, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ink r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.irp
            if (r0 == 0) goto L13
            r0 = r9
            irp r0 = (defpackage.irp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            irp r0 = new irp
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wwr r8 = r0.d
            defpackage.ybn.f(r9)
            goto L76
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ybn.f(r9)
            goto L64
        L38:
            defpackage.ybn.f(r9)
            kdj r9 = r7.j
            int r2 = r8.c
            r5 = 3
            if (r2 != r5) goto L47
            java.lang.Object r8 = r8.d
            wwq r8 = (defpackage.wwq) r8
            goto L49
        L47:
            wwq r8 = defpackage.wwq.a
        L49:
            r8.getClass()
            r0.c = r4
            java.lang.Object r2 = r9.b
            java.lang.Object r2 = r2.b()
            ahk r4 = new ahk
            r5 = 0
            r6 = 10
            r4.<init>(r9, r8, r5, r6)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r9 = r2.c(r4, r0)
            if (r9 == r1) goto L89
        L64:
            r8 = r9
            wwr r8 = (defpackage.wwr) r8
            vun r9 = r8.d
            r9.getClass()
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r7.k(r9, r0)
            if (r9 == r1) goto L89
        L76:
            java.lang.String r9 = r8.f
            r9.getClass()
            r7.b = r9
            wom r9 = r8.c
            if (r9 != 0) goto L83
            wom r9 = defpackage.wom.a
        L83:
            r9.getClass()
            r7.c = r9
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.a(ink, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ink r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.irq
            if (r0 == 0) goto L13
            r0 = r9
            irq r0 = (defpackage.irq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            irq r0 = new irq
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wvv r8 = r0.d
            defpackage.ybn.f(r9)
            return r8
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ybn.f(r9)
            goto L63
        L38:
            defpackage.ybn.f(r9)
            kdj r9 = r7.j
            int r2 = r8.c
            if (r2 != r4) goto L46
            java.lang.Object r8 = r8.d
            wvu r8 = (defpackage.wvu) r8
            goto L48
        L46:
            wvu r8 = defpackage.wvu.a
        L48:
            r8.getClass()
            r0.c = r4
            java.lang.Object r2 = r9.b
            java.lang.Object r2 = r2.b()
            ahk r4 = new ahk
            r5 = 0
            r6 = 11
            r4.<init>(r9, r8, r5, r6)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r9 = r2.c(r4, r0)
            if (r9 == r1) goto L75
        L63:
            wvv r9 = (defpackage.wvv) r9
            vun r8 = r9.d
            r8.getClass()
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = r7.k(r8, r0)
            if (r8 == r1) goto L75
            return r9
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.b(ink, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ink r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.irr
            if (r0 == 0) goto L13
            r0 = r8
            irr r0 = (defpackage.irr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            irr r0 = new irr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L5b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ybn.f(r8)
            kdj r8 = r6.j
            int r2 = r7.c
            r4 = 7
            if (r2 != r4) goto L3e
            java.lang.Object r7 = r7.d
            wwe r7 = (defpackage.wwe) r7
            goto L40
        L3e:
            wwe r7 = defpackage.wwe.a
        L40:
            r7.getClass()
            r0.c = r3
            java.lang.Object r2 = r8.b
            java.lang.Object r2 = r2.b()
            ahk r3 = new ahk
            r4 = 0
            r5 = 16
            r3.<init>(r8, r7, r4, r5)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r8 = r2.c(r3, r0)
            if (r8 == r1) goto L67
        L5b:
            wwf r8 = (defpackage.wwf) r8
            wom r7 = r8.b
            if (r7 != 0) goto L63
            wom r7 = defpackage.wom.a
        L63:
            r7.getClass()
            return r7
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.c(ink, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.ink r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.irs
            if (r0 == 0) goto L13
            r0 = r8
            irs r0 = (defpackage.irs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            irs r0 = new irs
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L5c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ybn.f(r8)
            kdj r8 = r6.j
            int r2 = r7.c
            r4 = 15
            if (r2 != r4) goto L3f
            java.lang.Object r7 = r7.d
            wwm r7 = (defpackage.wwm) r7
            goto L41
        L3f:
            wwm r7 = defpackage.wwm.a
        L41:
            r7.getClass()
            r0.c = r3
            java.lang.Object r2 = r8.b
            java.lang.Object r2 = r2.b()
            ahk r3 = new ahk
            r4 = 0
            r5 = 18
            r3.<init>(r8, r7, r4, r5)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r8 = r2.c(r3, r0)
            if (r8 == r1) goto L68
        L5c:
            wwn r8 = (defpackage.wwn) r8
            wom r7 = r8.b
            if (r7 != 0) goto L64
            wom r7 = defpackage.wom.a
        L64:
            r7.getClass()
            return r7
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.d(ink, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.ink r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.irz
            if (r0 == 0) goto L13
            r0 = r9
            irz r0 = (defpackage.irz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            irz r0 = new irz
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wwv r8 = r0.d
            defpackage.ybn.f(r9)
            return r8
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ybn.f(r9)
            goto L62
        L38:
            defpackage.ybn.f(r9)
            kdj r9 = r7.j
            int r2 = r8.c
            r5 = 6
            if (r2 != r5) goto L47
            java.lang.Object r8 = r8.d
            wwu r8 = (defpackage.wwu) r8
            goto L49
        L47:
            wwu r8 = defpackage.wwu.a
        L49:
            r8.getClass()
            r0.c = r4
            java.lang.Object r2 = r9.b
            java.lang.Object r2 = r2.b()
            iml r5 = new iml
            r6 = 0
            r5.<init>(r9, r8, r6, r4)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r9 = r2.c(r5, r0)
            if (r9 == r1) goto L74
        L62:
            wwv r9 = (defpackage.wwv) r9
            vun r8 = r9.d
            r8.getClass()
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = r7.k(r8, r0)
            if (r8 == r1) goto L74
            return r9
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.e(ink, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.ink r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.isb
            if (r0 == 0) goto L13
            r0 = r9
            isb r0 = (defpackage.isb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            isb r0 = new isb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            wwx r8 = r0.d
            defpackage.ybn.f(r9)
            return r8
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ybn.f(r9)
            goto L63
        L38:
            defpackage.ybn.f(r9)
            kdj r9 = r7.j
            int r2 = r8.c
            r5 = 5
            if (r2 != r5) goto L47
            java.lang.Object r8 = r8.d
            www r8 = (defpackage.www) r8
            goto L49
        L47:
            www r8 = defpackage.www.a
        L49:
            r8.getClass()
            r0.c = r4
            java.lang.Object r2 = r9.b
            java.lang.Object r2 = r2.b()
            iml r4 = new iml
            r5 = 0
            r6 = 0
            r4.<init>(r9, r8, r5, r6)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r9 = r2.c(r4, r0)
            if (r9 == r1) goto L75
        L63:
            wwx r9 = (defpackage.wwx) r9
            vun r8 = r9.d
            r8.getClass()
            r0.d = r9
            r0.c = r3
            java.lang.Object r8 = r7.k(r8, r0)
            if (r8 == r1) goto L75
            return r9
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.f(ink, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.ink r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ise
            if (r0 == 0) goto L13
            r0 = r8
            ise r0 = (defpackage.ise) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ise r0 = new ise
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            wwz r7 = r0.d
            defpackage.ybn.f(r8)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.ybn.f(r8)
            goto L61
        L38:
            defpackage.ybn.f(r8)
            kdj r8 = r6.j
            int r2 = r7.c
            if (r2 != r4) goto L46
            java.lang.Object r7 = r7.d
            wwy r7 = (defpackage.wwy) r7
            goto L48
        L46:
            wwy r7 = defpackage.wwy.a
        L48:
            r7.getClass()
            r0.c = r3
            java.lang.Object r2 = r8.b
            java.lang.Object r2 = r2.b()
            iml r3 = new iml
            r5 = 0
            r3.<init>(r8, r7, r5, r4)
            hfx r2 = (defpackage.hfx) r2
            java.lang.Object r8 = r2.c(r3, r0)
            if (r8 == r1) goto L73
        L61:
            wwz r8 = (defpackage.wwz) r8
            vun r7 = r8.d
            r7.getClass()
            r0.d = r8
            r0.c = r4
            java.lang.Object r7 = r6.k(r7, r0)
            if (r7 == r1) goto L73
            return r8
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isf.g(ink, yih):java.lang.Object");
    }

    public final ysx h(String str) {
        vtw vtwVarM = wvu.a.m();
        vtw vtwVarM2 = wvs.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ((wvs) vtwVarM2.b).b = str;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wvu wvuVar = (wvu) vtwVarM.b;
        wvs wvsVar = (wvs) vtwVarM2.r();
        wvsVar.getClass();
        wvuVar.c = wvsVar;
        wvuVar.b = 1;
        vtw vtwVarM3 = ink.a.m();
        vtwVarM3.getClass();
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        ipc.q((wvu) vucVarR, vtwVarM3);
        return new gxd(this.l.h(ihz.Y(ipc.p(vtwVarM3))), 15);
    }

    public final ysx i(String str, wod wodVar, boolean z) {
        wodVar.getClass();
        vtw vtwVarM = wvu.a.m();
        vtw vtwVarM2 = wvt.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ((wvt) vtwVarM2.b).c = str;
        if (!yks.e(wodVar, wod.a)) {
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            wvt wvtVar = (wvt) vtwVarM2.b;
            wvtVar.d = wodVar;
            wvtVar.b |= 1;
        }
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wvu wvuVar = (wvu) vtwVarM.b;
        wvt wvtVar2 = (wvt) vtwVarM2.r();
        wvtVar2.getClass();
        wvuVar.c = wvtVar2;
        wvuVar.b = 2;
        vtw vtwVarM3 = ink.a.m();
        vtwVarM3.getClass();
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        ipc.q((wvu) vucVarR, vtwVarM3);
        hfx hfxVar = this.l;
        ink inkVarP = ipc.p(vtwVarM3);
        return new gxd(hfxVar.h(z ? ihz.Z(inkVarP) : ihz.Y(inkVarP)), 16);
    }

    public final ysx j(wll wllVar, wpd wpdVar, boolean z) {
        wpdVar.getClass();
        vtw vtwVarM = wwy.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wwy wwyVar = (wwy) vucVar;
        wwyVar.d = wllVar;
        wwyVar.c = 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wwy wwyVar2 = (wwy) vtwVarM.b;
        wwyVar2.e = wpdVar;
        wwyVar2.b = 1 | wwyVar2.b;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        vtw vtwVarM2 = ink.a.m();
        vtwVarM2.getClass();
        ipc.r((wwy) vucVarR, vtwVarM2);
        hfx hfxVar = this.f;
        ink inkVarP = ipc.p(vtwVarM2);
        return new gxd(hfxVar.h(z ? ihz.Z(inkVarP) : ihz.Y(inkVarP)), 19);
    }
}
