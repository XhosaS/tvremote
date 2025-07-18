package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gah extends agtu implements agvb {
    int a;
    final /* synthetic */ gai b;
    final /* synthetic */ Duration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gah(gai gaiVar, Duration duration, agsw agswVar) {
        super(2, agswVar);
        this.b = gaiVar;
        this.c = duration;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gah) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        if (defpackage.ahkr.b(r8, r7) == r0) goto L13;
     */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.a
            r2 = 1
            defpackage.agpl.b(r8)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L63
        Ld:
            gai r8 = r7.b
            r7.a = r2
            fsv r8 = r8.a
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto L66
        L19:
            gai r8 = r7.b
            j$.time.Duration r1 = r7.c
            java.lang.Class<gae> r2 = defpackage.gae.class
            vto r2 = defpackage.vts.n(r2)
            vtf r3 = new vtf
            java.lang.String r4 = "home_graph_update"
            r5 = 4
            r3.<init>(r4, r5)
            yqt r3 = defpackage.yqt.i(r3)
            r4 = r2
            vtb r4 = (defpackage.vtb) r4
            r4.g = r3
            long r5 = r1.toMillis()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            vte r3 = new vte
            r3.<init>(r5, r1)
            r4.c = r3
            cao r1 = new cao
            r1.<init>()
            r3 = 2
            r1.b(r3)
            caq r1 = r1.a()
            r4.b = r1
            vts r1 = r2.b()
            vtm r8 = r8.b
            zyd r8 = r8.c(r1)
            r7.a = r3
            java.lang.Object r8 = defpackage.ahkr.b(r8, r7)
            if (r8 != r0) goto L63
            goto L66
        L63:
            agpu r8 = defpackage.agpu.a
            return r8
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gah.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gah(this.b, this.c, agswVar);
    }
}
