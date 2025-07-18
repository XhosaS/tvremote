package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnb extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ gnd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnb(gnd gndVar, agsw agswVar) {
        super(2, agswVar);
        this.c = gndVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[LOOP:0: B:14:0x0084->B:16:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[LOOP:1: B:18:0x00a2->B:20:0x00a8, LOOP_END] */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r10.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L16
            java.lang.Object r0 = r10.a
            java.util.Queue r0 = (java.util.Queue) r0
            java.lang.Object r1 = r10.d
            gne r1 = (defpackage.gne) r1
            defpackage.agpl.b(r11)
            goto L62
        L16:
            java.lang.Object r1 = r10.a
            gne r1 = (defpackage.gne) r1
            java.lang.Object r4 = r10.d
            ahcb r4 = (defpackage.ahcb) r4
            defpackage.agpl.b(r11)
            goto L52
        L22:
            defpackage.agpl.b(r11)
            java.lang.Object r11 = r10.d
            ahbt r11 = (defpackage.ahbt) r11
            gnd r1 = r10.c
            gna r4 = new gna
            r5 = 0
            r4.<init>(r1, r5)
            agte r6 = r1.c
            r7 = 0
            ahcb r4 = defpackage.ahal.d(r11, r6, r7, r4, r2)
            gmz r8 = new gmz
            r8.<init>(r1, r5)
            ahcb r11 = defpackage.ahal.d(r11, r6, r7, r8, r2)
            r10.d = r11
            gne r1 = r1.a
            r10.a = r1
            r10.b = r3
            java.lang.Object r4 = r4.a(r10)
            if (r4 == r0) goto Lbd
            r9 = r4
            r4 = r11
            r11 = r9
        L52:
            java.util.Queue r11 = (java.util.Queue) r11
            r10.d = r1
            r10.a = r11
            r10.b = r2
            java.lang.Object r2 = r4.a(r10)
            if (r2 == r0) goto Lbd
            r0 = r11
            r11 = r2
        L62:
            java.util.Queue r11 = (java.util.Queue) r11
            java.util.Queue r2 = r1.b
            java.util.Queue r0 = defpackage.gne.b(r2, r0)
            r1.b = r0
            java.util.Queue r0 = r1.c
            java.util.Queue r11 = defpackage.gne.b(r0, r11)
            r1.c = r11
            zbp r11 = r1.e
            r11.clear()
            zbp r0 = r1.f
            r0.clear()
            java.util.Queue r2 = r1.b
            java.util.Iterator r2 = r2.iterator()
        L84:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r2.next()
            gnh r4 = (defpackage.gnh) r4
            r1.d(r4)
            java.lang.String r4 = r4.a
            r5 = r11
            yvo r5 = (defpackage.yvo) r5
            r5.h(r4, r3)
            goto L84
        L9c:
            java.util.Queue r11 = r1.c
            java.util.Iterator r11 = r11.iterator()
        La2:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r11.next()
            gnh r2 = (defpackage.gnh) r2
            r1.d(r2)
            java.lang.String r2 = r2.a
            r4 = r0
            yvo r4 = (defpackage.yvo) r4
            r4.h(r2, r3)
            goto La2
        Lba:
            agpu r11 = defpackage.agpu.a
            return r11
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        gnb gnbVar = new gnb(this.c, agswVar);
        gnbVar.d = obj;
        return gnbVar;
    }
}
