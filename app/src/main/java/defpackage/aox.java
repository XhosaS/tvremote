package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aox extends agtu implements agvb {
    Object a;
    int b;
    final /* synthetic */ File c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aox(File file, agsw agswVar) {
        super(2, agswVar);
        this.c = file;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aox) c((ahge) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (defpackage.ahgd.a(r2, r8, r7) == r0) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            agtg r0 = defpackage.agtg.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            defpackage.agpl.b(r8)
            goto L87
        Le:
            java.lang.Object r1 = r7.a
            java.lang.Object r2 = r7.d
            ahge r2 = (defpackage.ahge) r2
            defpackage.agpl.b(r8)
            goto L73
        L18:
            defpackage.agpl.b(r8)
            java.lang.Object r8 = r7.d
            ahge r8 = (defpackage.ahge) r8
            java.io.File r1 = r7.c
            aov r3 = new aov
            r3.<init>()
            java.lang.Object r4 = defpackage.aoy.a
            java.io.File r1 = r1.getParentFile()
            r1.getClass()
            java.io.File r1 = r1.getCanonicalFile()
            java.lang.String r1 = r1.getPath()
            java.lang.Object r4 = defpackage.aoy.a
            monitor-enter(r4)
            java.util.Map r5 = defpackage.aoy.b     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r6 = r5.get(r1)     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L4d
            aoy r6 = new aoy     // Catch: java.lang.Throwable -> L8b
            r1.getClass()     // Catch: java.lang.Throwable -> L8b
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            r5.put(r1, r6)     // Catch: java.lang.Throwable -> L8b
        L4d:
            aoy r6 = (defpackage.aoy) r6     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.CopyOnWriteArrayList r5 = r6.c     // Catch: java.lang.Throwable -> L8b
            r5.add(r3)     // Catch: java.lang.Throwable -> L8b
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L8b
            if (r5 != r2) goto L5d
            r6.startWatching()     // Catch: java.lang.Throwable -> L8b
        L5d:
            monitor-exit(r4)
            aou r4 = new aou
            r4.<init>()
            agpu r1 = defpackage.agpu.a
            r7.d = r8
            r7.a = r4
            r7.b = r2
            java.lang.Object r1 = r8.g(r1, r7)
            if (r1 == r0) goto L8a
            r2 = r8
            r1 = r4
        L73:
            aow r8 = new aow
            r8.<init>()
            r1 = 0
            r7.d = r1
            r7.a = r1
            r1 = 2
            r7.b = r1
            java.lang.Object r8 = defpackage.ahgd.a(r2, r8, r7)
            if (r8 != r0) goto L87
            goto L8a
        L87:
            agpu r8 = defpackage.agpu.a
            return r8
        L8a:
            return r0
        L8b:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aox.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        aox aoxVar = new aox(this.c, agswVar);
        aoxVar.d = obj;
        return aoxVar;
    }
}
