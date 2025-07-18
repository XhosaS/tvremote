package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ake extends yiy implements yjz {
    Object a;
    int b;
    final /* synthetic */ yjk c;
    final /* synthetic */ tka d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ake(tka tkaVar, yjk yjkVar, yih yihVar) {
        super(yihVar);
        this.d = tkaVar;
        this.c = yjkVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ake) create((btq) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        ake akeVar = new ake(this.d, this.c, yihVar);
        akeVar.e = obj;
        return akeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r12 != r0) goto L9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:17:0x005e). Please report as a decompilation issue!!! */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            yio r0 = defpackage.yio.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L14
            java.lang.Object r1 = r11.a
            java.lang.Object r3 = r11.e
            btq r3 = (defpackage.btq) r3
            defpackage.ybn.f(r12)
            goto L5e
        L14:
            java.lang.Object r1 = r11.e
            btq r1 = (defpackage.btq) r1
            defpackage.ybn.f(r12)
            goto L2e
        L1c:
            defpackage.ybn.f(r12)
            java.lang.Object r12 = r11.e
            r1 = r12
            btq r1 = (defpackage.btq) r1
            r11.e = r1
            r11.b = r3
            java.lang.Object r12 = defpackage.wf.f(r1, r11, r2)
            if (r12 == r0) goto L8c
        L2e:
            tka r3 = r11.d
            bsz r12 = (defpackage.bsz) r12
            long r4 = r12.c
            java.lang.Object r4 = r3.b
            alg r4 = (defpackage.alg) r4
            r4.y()
            boolean r3 = r3.a
            if (r3 == 0) goto L42
            afo r5 = defpackage.afo.b
            goto L44
        L42:
            afo r5 = defpackage.afo.c
        L44:
            long r6 = r4.b(r3)
            long r6 = defpackage.anf.a(r6)
            r4.F(r5, r6)
            r3 = r1
            r1 = r12
        L51:
            r11.e = r3
            r11.a = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.bny.I(r3, r11)
            if (r12 != r0) goto L5e
            goto L8c
        L5e:
            bsr r12 = (defpackage.bsr) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L67:
            if (r5 >= r4) goto L84
            java.lang.Object r6 = r12.get(r5)
            bsz r6 = (defpackage.bsz) r6
            long r7 = r6.a
            r9 = r1
            bsz r9 = (defpackage.bsz) r9
            long r9 = r9.a
            boolean r7 = defpackage.a.s(r7, r9)
            if (r7 == 0) goto L81
            boolean r6 = r6.d
            if (r6 == 0) goto L81
            goto L51
        L81:
            int r5 = r5 + 1
            goto L67
        L84:
            yjk r12 = r11.c
            r12.a()
            ygi r12 = defpackage.ygi.a
            return r12
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
