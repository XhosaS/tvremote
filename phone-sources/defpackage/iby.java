package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iby extends icl {
    final /* synthetic */ ity a;
    private boolean c;
    private final List d;
    private yol e;
    private iom f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yow] */
    public iby(ity ityVar) {
        super(ityVar.d);
        this.a = ityVar;
        this.d = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yow] */
    private final void i() {
        if (this.f == null) {
            ity ityVar = this.a;
            iom iomVar = new iom((yow) ityVar.d, (ysx) ityVar.e, new gew((Object) this, 3, (short[]) null));
            this.f = iomVar;
            this.c = false;
            ykr.q(iomVar.d, null, 0, new gwv(iomVar, (yih) null, 2), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ibz r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ibv
            if (r0 == 0) goto L13
            r0 = r6
            ibv r0 = (defpackage.ibv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ibv r0 = new ibv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L2e
            r5 = 1
            if (r0 == r5) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.ybn.f(r6)
            r5 = 0
            throw r5
        L2e:
            defpackage.ybn.f(r6)
            java.util.List r6 = r4.d
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L3e
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L3e
            goto L6b
        L3e:
            java.util.Iterator r0 = r6.iterator()
        L42:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()
            ibz r1 = (defpackage.ibz) r1
            r5.getClass()
            ysn r1 = r1.a
            ysn r2 = r5.a
            if (r1 == r2) goto L58
            goto L42
        L58:
            java.util.Objects.toString(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = " is already in the list."
            java.lang.String r5 = r5.concat(r0)
            r6.<init>(r5)
            throw r6
        L6b:
            r6.add(r5)
            yol r5 = r4.e
            if (r5 == 0) goto L77
            ygi r6 = defpackage.ygi.a
            r5.S(r6)
        L77:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.a(ibz, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ica r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ibw
            if (r0 == 0) goto L13
            r0 = r7
            ibw r0 = (defpackage.ibw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ibw r0 = new ibw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ica r6 = r0.d
            defpackage.ybn.f(r7)
            goto L58
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r7)
            boolean r7 = r6.b
            if (r7 == 0) goto L47
            ity r2 = r5.a
            boolean r2 = r2.a
            if (r2 == 0) goto L3f
            goto L47
        L3f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "cannot add a piggyback only downstream when piggybackDownstream is disabled"
            r6.<init>(r7)
            throw r6
        L47:
            ysn r2 = r6.a
            ibz r4 = new ibz
            r4.<init>(r2, r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r5.a(r4, r0)
            if (r7 == r1) goto L62
        L58:
            boolean r6 = r6.b
            if (r6 != 0) goto L5f
            r5.i()
        L5f:
            ygi r6 = defpackage.ygi.a
            return r6
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.b(ica, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r7.c.a(r2, r0) != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, yjz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.icd r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ibx
            if (r0 == 0) goto L13
            r0 = r7
            ibx r0 = (defpackage.ibx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ibx r0 = new ibx
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            icd r2 = r0.e
            defpackage.ybn.f(r7)
            goto L60
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            icd r6 = r0.e
            defpackage.ybn.f(r7)
            goto L4f
        L3c:
            defpackage.ybn.f(r7)
            ity r7 = r5.a
            java.lang.Object r2 = r6.a
            r0.e = r6
            r0.d = r4
            java.lang.Object r7 = r7.c
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 == r1) goto L85
        L4f:
            r6.getClass()
            r5.c = r4
            yol r7 = r6.b
            r5.e = r7
            java.util.List r7 = r5.d
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L60:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            ibz r7 = (defpackage.ibz) r7
            r0.e = r2
            r0.a = r6
            r0.d = r3
            r4 = 0
            r7.b = r4
            ysn r7 = r7.a
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 == r1) goto L7f
            ygi r7 = defpackage.ygi.a
        L7f:
            if (r7 != r1) goto L60
            goto L85
        L82:
            ygi r6 = defpackage.ygi.a
            return r6
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.c(icd, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, yqe] */
    @Override // defpackage.icl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object r6, defpackage.yih r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iby.d(java.lang.Object, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yqe] */
    @Override // defpackage.icl
    public final void e() {
        List list = this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ibz) it.next()).a();
        }
        list.clear();
        iom iomVar = this.f;
        if (iomVar != null) {
            iomVar.a.t(null);
        }
    }
}
