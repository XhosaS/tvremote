package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhk extends agtu implements agvb {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ jhr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhk(jhr jhrVar, agsw agswVar) {
        super(2, agswVar);
        this.e = jhrVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jhk) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Type inference failed for: r1v2, types: [jiq] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0048 -> B:16:0x004b). Please report as a decompilation issue!!! */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r8.d
            if (r1 == 0) goto L12
            java.lang.Object r1 = r8.c
            java.lang.Object r2 = r8.b
            java.lang.Object r3 = r8.a
            defpackage.agpl.b(r9)     // Catch: defpackage.ahem -> L10
            goto L4b
        L10:
            r9 = move-exception
            goto L4e
        L12:
            defpackage.agpl.b(r9)
            jhr r9 = r8.e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r9 = r9.b
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
            r3 = r1
        L24:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L77
            java.lang.Object r9 = r2.next()
            r1 = r9
            jiq r1 = (defpackage.jiq) r1
            j$.time.Duration r9 = defpackage.jhx.a     // Catch: defpackage.ahem -> L10
            j$.time.Duration r9 = defpackage.jhx.a     // Catch: defpackage.ahem -> L10
            jhj r4 = new jhj     // Catch: defpackage.ahem -> L10
            r5 = 0
            r4.<init>(r1, r5)     // Catch: defpackage.ahem -> L10
            r8.a = r3     // Catch: defpackage.ahem -> L10
            r8.b = r2     // Catch: defpackage.ahem -> L10
            r8.c = r1     // Catch: defpackage.ahem -> L10
            r5 = 1
            r8.d = r5     // Catch: defpackage.ahem -> L10
            java.lang.Object r9 = defpackage.zty.b(r9, r4, r8)     // Catch: defpackage.ahem -> L10
            if (r9 != r0) goto L4b
            return r0
        L4b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: defpackage.ahem -> L10
            goto L73
        L4e:
            zdy r4 = defpackage.jhr.a
            zeo r4 = r4.d()
            zdv r4 = (defpackage.zdv) r4
            zeo r9 = r4.p(r9)
            r4 = 134(0x86, float:1.88E-43)
            java.lang.String r5 = "DelegatingActionExecutor.kt"
            java.lang.String r6 = "com/google/android/apps/tvsearch/voice/libassistant/DelegatingActionExecutor$GetConversationParams$1$1"
            java.lang.String r7 = "invokeSuspend"
            zeo r9 = r9.q(r6, r7, r4, r5)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r4 = "Timed out while collecting ConversationParams of %s."
            java.lang.String r1 = r1.c()
            r9.x(r4, r1)
            agrd r9 = defpackage.agrd.a
        L73:
            defpackage.agqq.k(r3, r9)
            goto L24
        L77:
            r9 = 0
            com.google.assistant.sdk.libassistant.ActionExecutor$ConversationParams[] r9 = new com.google.assistant.sdk.libassistant.ActionExecutor.ConversationParams[r9]
            java.lang.Object[] r9 = r3.toArray(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jhk(this.e, agswVar);
    }
}
