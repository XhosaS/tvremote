package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwb extends agtu implements agvb {
    int a;
    final /* synthetic */ iwd b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwb(iwd iwdVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iwdVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iwb) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:8:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            java.lang.Object r1 = r4.c
            ahbt r1 = (defpackage.ahbt) r1
            defpackage.agpl.b(r5)
            goto L21
        L11:
            java.lang.Object r1 = r4.c
            ahbt r1 = (defpackage.ahbt) r1
            defpackage.agpl.b(r5)
            goto L34
        L19:
            defpackage.agpl.b(r5)
            java.lang.Object r5 = r4.c
            r1 = r5
            ahbt r1 = (defpackage.ahbt) r1
        L21:
            boolean r5 = defpackage.ahbu.d(r1)
            if (r5 == 0) goto L44
            iwd r5 = r4.b
            r4.c = r1
            r4.a = r2
            r3 = 0
            java.lang.Object r5 = defpackage.iwd.b(r5, r3, r4, r2)
            if (r5 == r0) goto L43
        L34:
            r4.c = r1
            r5 = 2
            r4.a = r5
            iwd r5 = r4.b
            j$.time.Duration r5 = r5.c
            java.lang.Object r5 = defpackage.zty.a(r5, r4)
            if (r5 != r0) goto L21
        L43:
            return r0
        L44:
            agpu r5 = defpackage.agpu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        iwb iwbVar = new iwb(this.b, agswVar);
        iwbVar.c = obj;
        return iwbVar;
    }
}
