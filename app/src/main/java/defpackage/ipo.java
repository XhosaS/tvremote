package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipo extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ ipq c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipo(ipq ipqVar, List list, agsw agswVar) {
        super(2, agswVar);
        this.c = ipqVar;
        this.d = list;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ipo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r10.a(r2, r9) != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [ipq] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L11
            defpackage.agpl.b(r10)
            goto L80
        L11:
            java.lang.Object r1 = r9.a
            defpackage.agpl.b(r10)
            goto L48
        L17:
            defpackage.agpl.b(r10)
            goto L2a
        L1b:
            defpackage.agpl.b(r10)
            ipq r10 = r9.c
            r9.b = r3
            fky r10 = r10.f
            java.lang.Object r10 = r10.a(r9)
            if (r10 == r0) goto L83
        L2a:
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            j$.time.Duration r10 = defpackage.ipq.a
            r7 = 0
            r8 = 62
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            defpackage.agqq.G(r3, r4, r5, r6, r7, r8)
            ipq r10 = r9.c
            r9.a = r3
            r9.b = r2
            fky r10 = r10.f
            java.lang.Object r10 = r10.b(r9)
            if (r10 == r0) goto L83
            r1 = r3
        L48:
            j$.time.Instant r10 = (j$.time.Instant) r10
            j$.time.Duration r2 = defpackage.ipq.a
            java.util.List r2 = r9.d
            boolean r3 = r2.containsAll(r1)
            if (r3 == 0) goto L71
            boolean r1 = r1.containsAll(r2)
            if (r1 == 0) goto L71
            ipq r1 = r9.c
            ztw r1 = r1.g
            j$.time.Instant r1 = r1.a()
            r1.getClass()
            j$.time.Duration r10 = defpackage.fep.a(r10, r1)
            j$.time.Duration r1 = defpackage.ipq.c
            int r10 = r10.compareTo(r1)
            if (r10 <= 0) goto L80
        L71:
            ipq r10 = r9.c
            r1 = 0
            r9.a = r1
            r1 = 3
            r9.b = r1
            java.lang.Object r10 = r10.a(r2, r9)
            if (r10 != r0) goto L80
            goto L83
        L80:
            agpu r10 = defpackage.agpu.a
            return r10
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ipo(this.c, this.d, agswVar);
    }
}
