package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahjm extends ahjj {
    protected final ahgr d;

    public ahjm(ahgr ahgrVar, agte agteVar, int i, int i2) {
        super(agteVar, i, i2);
        this.d = ahgrVar;
    }

    @Override // defpackage.ahjj
    protected final Object b(ahge ahgeVar, agsw agswVar) {
        Object objD = d(new ahki(ahgeVar), agswVar);
        return objD == agtg.a ? objD : agpu.a;
    }

    protected abstract Object d(ahgs ahgsVar, agsw agswVar);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    @Override // defpackage.ahjj, defpackage.ahgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fD(defpackage.ahgs r5, defpackage.agsw r6) {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L53
            agte r0 = r6.fr()
            agte r1 = r4.a
            agte r1 = defpackage.ahbj.a(r0, r1)
            boolean r2 = defpackage.agvy.c(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r4.d(r5, r6)
            agtg r6 = defpackage.agtg.a
            if (r5 != r6) goto L5c
            return r5
        L1e:
            agsx r2 = defpackage.agsy.b
            agtc r3 = r1.get(r2)
            agtc r0 = r0.get(r2)
            boolean r0 = defpackage.agvy.c(r3, r0)
            if (r0 == 0) goto L53
            agte r0 = r6.fr()
            boolean r2 = r5 instanceof defpackage.ahki
            if (r2 != 0) goto L40
            boolean r2 = r5 instanceof defpackage.ahkb
            if (r2 != 0) goto L40
            ahkl r2 = new ahkl
            r2.<init>(r5, r0)
            r5 = r2
        L40:
            ahjl r0 = new ahjl
            r2 = 0
            r0.<init>(r4, r2)
            java.lang.Object r2 = defpackage.ahmn.a(r1)
            java.lang.Object r5 = defpackage.ahjk.a(r1, r5, r2, r0, r6)
            agtg r6 = defpackage.agtg.a
            if (r5 != r6) goto L5c
            return r5
        L53:
            java.lang.Object r5 = defpackage.ahjj.e(r4, r5, r6)
            agtg r6 = defpackage.agtg.a
            if (r5 != r6) goto L5c
            return r5
        L5c:
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjm.fD(ahgs, agsw):java.lang.Object");
    }

    @Override // defpackage.ahjj
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
