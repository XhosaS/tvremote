package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vw extends yiz implements yjz {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ vx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(vx vxVar, yih yihVar) {
        super(2, yihVar);
        this.d = vxVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vw) create(new cmm(((cmm) obj).a), (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        vw vwVar = new vw(this.d, yihVar);
        vwVar.c = ((cmm) obj).a;
        return vwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            yio r0 = defpackage.yio.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            long r0 = r11.a
            long r2 = r11.c
            defpackage.ybn.f(r12)
            goto L67
        L14:
            long r1 = r11.a
            long r3 = r11.c
            defpackage.ybn.f(r12)
            goto L4b
        L1c:
            long r3 = r11.c
            defpackage.ybn.f(r12)
            goto L34
        L22:
            defpackage.ybn.f(r12)
            long r4 = r11.c
            vx r12 = r11.d
            bse r12 = r12.d
            r11.b = r3
            java.lang.Object r12 = r12.e(r4, r11)
            if (r12 == r0) goto L79
            r3 = r4
        L34:
            cmm r12 = (defpackage.cmm) r12
            long r5 = r12.a
            long r5 = defpackage.a.at(r3, r5)
            vx r12 = r11.d
            r11.c = r3
            r11.a = r5
            r11.b = r2
            java.lang.Object r12 = r12.g(r5, r11)
            if (r12 == r0) goto L79
            r1 = r5
        L4b:
            cmm r12 = (defpackage.cmm) r12
            long r8 = r12.a
            vx r12 = r11.d
            bse r5 = r12.d
            long r6 = defpackage.a.at(r1, r8)
            r11.c = r3
            r11.a = r8
            r12 = 3
            r11.b = r12
            r10 = r11
            java.lang.Object r12 = r5.d(r6, r8, r10)
            if (r12 == r0) goto L79
            r2 = r3
            r0 = r8
        L67:
            cmm r12 = (defpackage.cmm) r12
            long r4 = r12.a
            long r0 = defpackage.a.at(r0, r4)
            long r0 = defpackage.a.at(r2, r0)
            cmm r12 = new cmm
            r12.<init>(r0)
            return r12
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
