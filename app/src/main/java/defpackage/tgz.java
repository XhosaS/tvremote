package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tgz extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ the c;
    final /* synthetic */ zmx d;
    final /* synthetic */ jyw e;
    final /* synthetic */ zpf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgz(the theVar, zmx zmxVar, jyw jywVar, zpf zpfVar, agsw agswVar) {
        super(2, agswVar);
        this.c = theVar;
        this.d = zmxVar;
        this.e = jywVar;
        this.f = zpfVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tgz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.agpl.b(r5)
            goto L3d
        Lf:
            defpackage.agpl.b(r5)
            goto L2a
        L13:
            defpackage.agpl.b(r5)
            the r5 = r4.c
            zmx r1 = r4.d
            thq r3 = r5.b
            tgt r5 = r5.f
            zyd r5 = r3.b(r1, r5)
            r4.b = r2
            java.lang.Object r5 = defpackage.ahkr.b(r5, r4)
            if (r5 == r0) goto L95
        L2a:
            the r1 = r4.c
            aeee r5 = (defpackage.aeee) r5
            r4.a = r5
            r2 = 2
            r4.b = r2
            thl r1 = r1.h
            java.lang.Object r1 = r1.a(r4)
            if (r1 == r0) goto L95
            r0 = r5
            r5 = r1
        L3d:
            zox r5 = (defpackage.zox) r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == 0) goto L6c
            aeed r2 = new aeed
            r2.<init>()
            abxd r0 = (defpackage.abxd) r0
            r2.B(r0)
            abxd r0 = r2.b
            int r0 = r0.memoizedSerializedSize
            r0 = r0 & r1
            if (r0 != 0) goto L57
            r2.y()
        L57:
            abxd r0 = r2.b
            aeee r0 = (defpackage.aeee) r0
            aeee r3 = defpackage.aeee.a
            r0.g = r5
            int r5 = r0.b
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r0.b = r5
            abxd r5 = r2.v()
            r0 = r5
            aeee r0 = (defpackage.aeee) r0
        L6c:
            jyw r5 = r4.e
            the r2 = r4.c
            zpf r3 = r4.f
            kab r2 = r2.g
            jyv r5 = r5.i(r0, r2)
            aecc r0 = r5.b
            abxd r2 = r0.b
            int r2 = r2.memoizedSerializedSize
            r1 = r1 & r2
            if (r1 != 0) goto L84
            r0.y()
        L84:
            int r1 = r3.nI
            abxd r0 = r0.b
            aecd r0 = (defpackage.aecd) r0
            aecd r2 = defpackage.aecd.a
            int r2 = r0.b
            r2 = r2 | 32
            r0.b = r2
            r0.e = r1
            return r5
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new tgz(this.c, this.d, this.e, this.f, agswVar);
    }
}
