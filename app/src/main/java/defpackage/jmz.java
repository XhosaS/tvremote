package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmz implements jmu {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdUpdaterImpl");
    public final jmr b;
    public final agte c;
    public String d;
    public final Set e;
    private final ahbt f;
    private final ahni g;
    private ahdl h;

    public jmz(jmr jmrVar, agte agteVar, ahbt ahbtVar) {
        agteVar.getClass();
        ahbtVar.getClass();
        this.b = jmrVar;
        this.c = agteVar;
        this.f = ahbtVar;
        this.e = new LinkedHashSet();
        this.g = new ahnm(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.jmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, defpackage.agsw r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.jmw
            java.lang.String r1 = "CastIdUpdaterImpl.kt"
            if (r0 == 0) goto L15
            r0 = r8
            jmw r0 = (defpackage.jmw) r0
            int r2 = r0.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.e = r2
            goto L1a
        L15:
            jmw r0 = new jmw
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.c
            agtg r2 = defpackage.agtg.a
            int r3 = r0.e
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            long r6 = r0.a
            java.lang.Object r0 = r0.b
            defpackage.agpl.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.agpl.b(r8)
            ahni r8 = r5.g
            r0.b = r8
            r0.a = r6
            r0.e = r4
            java.lang.Object r0 = r8.b(r0)
            if (r0 == r2) goto L80
            r0 = r8
        L47:
            ahdl r8 = r5.h     // Catch: java.lang.Throwable -> L7b
            if (r8 == 0) goto L65
            zdy r6 = defpackage.jmz.a     // Catch: java.lang.Throwable -> L7b
            zeo r6 = r6.d()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdUpdaterImpl"
            java.lang.String r8 = "start"
            r2 = 39
            zeo r6 = r6.q(r7, r8, r2, r1)     // Catch: java.lang.Throwable -> L7b
            zdv r6 = (defpackage.zdv) r6     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "CastIdUpdater job already running. Ignoring start()."
            r6.u(r7)     // Catch: java.lang.Throwable -> L7b
            agpu r6 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L7b
            goto L77
        L65:
            ahbt r8 = r5.f     // Catch: java.lang.Throwable -> L7b
            jmx r1 = new jmx     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            r1.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L7b
            r6 = 0
            r7 = 3
            ahdl r6 = defpackage.ahal.e(r8, r2, r6, r1, r7)     // Catch: java.lang.Throwable -> L7b
            r5.h = r6     // Catch: java.lang.Throwable -> L7b
            agpu r6 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L7b
        L77:
            r0.d()
            return r6
        L7b:
            r6 = move-exception
            r0.d()
            throw r6
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmz.a(long, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v12, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // defpackage.jmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jmy
            java.lang.String r1 = "CastIdUpdaterImpl.kt"
            if (r0 == 0) goto L15
            r0 = r8
            jmy r0 = (defpackage.jmy) r0
            int r2 = r0.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.d = r2
            goto L1a
        L15:
            jmy r0 = new jmy
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.b
            agtg r2 = defpackage.agtg.a
            int r3 = r0.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L7a
        L2e:
            r8 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r3 = r0.a
            defpackage.agpl.b(r8)
            r8 = r3
            goto L4e
        L3f:
            defpackage.agpl.b(r8)
            ahni r8 = r7.g
            r0.a = r8
            r0.d = r5
            java.lang.Object r3 = r8.b(r0)
            if (r3 == r2) goto L8b
        L4e:
            ahdl r3 = r7.h     // Catch: java.lang.Throwable -> L83
            if (r3 != 0) goto L6f
            zdy r0 = defpackage.jmz.a     // Catch: java.lang.Throwable -> L83
            zeo r0 = r0.d()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "com/google/android/apps/tvsearch/voice/libassistant/updaters/CastIdUpdaterImpl"
            java.lang.String r3 = "stop"
            r4 = 62
            zeo r0 = r0.q(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L83
            zdv r0 = (defpackage.zdv) r0     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "CastIdUpdater job not running. Ignoring stop()."
            r0.u(r1)     // Catch: java.lang.Throwable -> L83
            agpu r0 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L83
            r8.d()
            return r0
        L6f:
            r0.a = r8     // Catch: java.lang.Throwable -> L83
            r0.d = r4     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = defpackage.ahdp.a(r3, r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == r2) goto L8b
            r0 = r8
        L7a:
            r8 = 0
            r7.h = r8     // Catch: java.lang.Throwable -> L2e
            agpu r8 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L2e
            r0.d()
            return r8
        L83:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L87:
            r0.d()
            throw r8
        L8b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmz.b(agsw):java.lang.Object");
    }

    @Override // defpackage.jmu
    public final String c() {
        return this.d;
    }

    @Override // defpackage.jmu
    public final void d(jmt jmtVar) {
        this.e.add(jmtVar);
    }

    @Override // defpackage.jmu
    public final void e(String str) {
        this.d = str;
    }

    @Override // defpackage.jmu
    public final boolean f() {
        String str = this.d;
        return str != null && str.length() > 0;
    }
}
