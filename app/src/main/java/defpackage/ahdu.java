package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahdu extends agtt implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ahdv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(ahdv ahdvVar, agsw agswVar) {
        super(agswVar);
        this.d = ahdvVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahdu) c((agxu) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r6.a(r1, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r3.a(r6, r5) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:24:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006c -> B:24:0x006f). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L15
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.a
            java.lang.Object r3 = r5.e
            agxu r3 = (defpackage.agxu) r3
            defpackage.agpl.b(r6)
            goto L6f
        L15:
            defpackage.agpl.b(r6)
            goto L76
        L19:
            defpackage.agpl.b(r6)
            java.lang.Object r6 = r5.e
            agxu r6 = (defpackage.agxu) r6
            ahdv r1 = r5.d
            agzy r1 = r1.d
            java.lang.Object r1 = r1.a
            boolean r3 = r1 instanceof defpackage.ahax
            if (r3 == 0) goto L37
            ahax r1 = (defpackage.ahax) r1
            ahay r1 = r1.a
            r5.c = r2
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L76
            goto L6e
        L37:
            boolean r2 = r1 instanceof defpackage.ahdg
            if (r2 == 0) goto L76
            ahdg r1 = (defpackage.ahdg) r1
            ahea r1 = r1.a()
            if (r1 == 0) goto L76
            agzy r2 = r1.e
            java.lang.Object r2 = r2.a
            r2.getClass()
            ahlv r2 = (defpackage.ahlv) r2
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r6
        L50:
            boolean r6 = defpackage.agvy.c(r1, r2)
            if (r6 != 0) goto L76
            boolean r6 = r1 instanceof defpackage.ahax
            if (r6 == 0) goto L6f
            r6 = r1
            ahax r6 = (defpackage.ahax) r6
            ahay r6 = r6.a
            r5.e = r3
            r5.a = r2
            r5.b = r1
            r4 = 2
            r5.c = r4
            java.lang.Object r6 = r3.a(r6, r5)
            if (r6 != r0) goto L6f
        L6e:
            return r0
        L6f:
            ahlv r1 = (defpackage.ahlv) r1
            ahlv r1 = r1.h()
            goto L50
        L76:
            agpu r6 = defpackage.agpu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahdu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        ahdu ahduVar = new ahdu(this.d, agswVar);
        ahduVar.e = obj;
        return ahduVar;
    }
}
