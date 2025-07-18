package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gla extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ glb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gla(glb glbVar, agsw agswVar) {
        super(2, agswVar);
        this.c = glbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gla) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r9.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r9.a
            defpackage.agpl.b(r10)
            goto L4c
        Lf:
            defpackage.agpl.b(r10)
            goto L22
        L13:
            defpackage.agpl.b(r10)
            glb r10 = r9.c
            r9.b = r2
            fke r10 = r10.e
            java.lang.Object r10 = r10.c(r9)
            if (r10 == r0) goto Ld0
        L22:
            glb r1 = r9.c
            j$.time.Instant r10 = (j$.time.Instant) r10
            ztw r2 = r1.f
            j$.time.Instant r2 = r2.a()
            r2.getClass()
            r9.a = r10
            r3 = 2
            r9.b = r3
            abzy r2 = defpackage.acbk.b(r2)
            fjy r3 = new fjy
            r3.<init>()
            fke r1 = r1.e
            fhi r1 = r1.a
            java.lang.Object r1 = r1.b(r3, r9)
            if (r1 == r0) goto L49
            agpu r1 = defpackage.agpu.a
        L49:
            if (r1 == r0) goto Ld0
            r0 = r10
        L4c:
            glb r10 = r9.c
            java.lang.String r3 = r10.i
            java.lang.String r1 = ""
            r10.i = r1
            j$.time.Instant r1 = j$.time.Instant.EPOCH
            boolean r1 = defpackage.agvy.c(r0, r1)
            r4 = -1
            if (r1 == 0) goto L60
            r7 = r4
            goto L74
        L60:
            ztw r1 = r10.f
            j$.time.Instant r1 = r1.a()
            r1.getClass()
            j$.time.Instant r0 = (j$.time.Instant) r0
            j$.time.Duration r0 = defpackage.fep.a(r0, r1)
            long r0 = r0.getSeconds()
            r7 = r0
        L74:
            gzu r0 = r10.c
            fby r1 = r10.a
            java.lang.String r2 = r0.a
            java.lang.String r0 = r1.e()
            boolean r0 = defpackage.agvy.c(r2, r0)
            if (r0 != 0) goto L85
            goto L9a
        L85:
            j$.time.Instant r0 = r1.c()
            ztw r1 = r10.f
            j$.time.Instant r1 = r1.a()
            r1.getClass()
            j$.time.Duration r0 = defpackage.fep.a(r0, r1)
            long r4 = r0.getSeconds()
        L9a:
            r5 = r4
            ghp r0 = r10.g
            r0.h(r3)
            ghr r1 = r10.h
            r4 = 2
            r1.D(r2, r3, r4, r5, r7)
            agow r0 = r10.b
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcd
            agow r10 = r10.d
            java.lang.Object r10 = r10.a()
            gfn r10 = (defpackage.gfn) r10
            rqs r0 = defpackage.rpm.u()
            gfi r10 = r10.a(r0)
            gfl r10 = defpackage.gfh.b(r10)
            abqb r0 = defpackage.abqb.OK
            r10.d(r0)
        Lcd:
            agpu r10 = defpackage.agpu.a
            return r10
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gla.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gla(this.c, agswVar);
    }
}
