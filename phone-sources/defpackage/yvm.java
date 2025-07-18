package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yvm extends yvl {
    public final ysx d;

    public yvm(ysx ysxVar, yil yilVar, int i, int i2) {
        super(yilVar, i, i2);
        this.d = ysxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    @Override // defpackage.yvl, defpackage.ysx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.ysy r5, defpackage.yih r6) {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L55
            yil r0 = r6.getContext()
            yil r1 = r4.a
            yil r1 = defpackage.yos.a(r0, r1)
            boolean r2 = defpackage.yks.e(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r4.g(r5, r6)
            yio r6 = defpackage.yio.a
            if (r5 != r6) goto L5e
            return r5
        L1e:
            bbx r2 = defpackage.yii.k
            yij r3 = r1.get(r2)
            yij r0 = r0.get(r2)
            boolean r0 = defpackage.yks.e(r3, r0)
            if (r0 == 0) goto L55
            yil r0 = r6.getContext()
            boolean r2 = r5 instanceof defpackage.ywd
            if (r2 != 0) goto L40
            boolean r2 = r5 instanceof defpackage.yvy
            if (r2 != 0) goto L40
            ywg r2 = new ywg
            r2.<init>(r5, r0)
            r5 = r2
        L40:
            daz r0 = new daz
            r2 = 0
            r3 = 13
            r0.<init>(r4, r2, r3)
            java.lang.Object r2 = defpackage.yxr.a(r1)
            java.lang.Object r5 = defpackage.wae.aa(r1, r5, r2, r0, r6)
            yio r6 = defpackage.yio.a
            if (r5 != r6) goto L5e
            return r5
        L55:
            java.lang.Object r5 = defpackage.yvl.h(r4, r5, r6)
            yio r6 = defpackage.yio.a
            if (r5 != r6) goto L5e
            return r5
        L5e:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvm.a(ysy, yih):java.lang.Object");
    }

    @Override // defpackage.yvl
    public final Object b(ysk yskVar, yih yihVar) {
        Object objG = g(new ywd(yskVar), yihVar);
        return objG == yio.a ? objG : ygi.a;
    }

    public abstract Object g(ysy ysyVar, yih yihVar);

    @Override // defpackage.yvl
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
