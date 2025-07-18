package defpackage;

import j$.time.Duration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwh implements gvy {
    public static final Duration a;
    public static final Duration b;
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/platform/account/auth/TokenUpdaterImpl");
    public final gvo c;
    private final ahbt e;
    private final gtu f;
    private final Map g;
    private final Set h;
    private final Map i;
    private final ahni j;
    private ahdl k;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(30L);
        durationOfMinutes.getClass();
        a = durationOfMinutes;
        Duration durationOfSeconds = Duration.ofSeconds(2L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
    }

    public gwh(ahbt ahbtVar, gtu gtuVar, gvo gvoVar) {
        ahbtVar.getClass();
        gtuVar.getClass();
        this.e = ahbtVar;
        this.f = gtuVar;
        this.c = gvoVar;
        this.g = new LinkedHashMap();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashMap();
        this.j = new ahnm(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (b(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gwc
            if (r0 == 0) goto L13
            r0 = r6
            gwc r0 = (defpackage.gwc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gwc r0 = new gwc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r6)
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.agpl.b(r6)
            goto L41
        L36:
            defpackage.agpl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.g(r0)
            if (r6 == r1) goto L4d
        L41:
            r0.c = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L4a
            goto L4d
        L4a:
            agpu r6 = defpackage.agpu.a
            return r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwh.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.gvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.agsw r8) {
        /*
            r7 = this;
            java.lang.String r0 = "start"
            java.lang.String r1 = "com/google/android/apps/tvsearch/platform/account/auth/TokenUpdaterImpl"
            boolean r2 = r8 instanceof defpackage.gwd
            java.lang.String r3 = "TokenUpdaterImpl.kt"
            if (r2 == 0) goto L19
            r2 = r8
            gwd r2 = (defpackage.gwd) r2
            int r4 = r2.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r2.d = r4
            goto L1e
        L19:
            gwd r2 = new gwd
            r2.<init>(r7, r8)
        L1e:
            java.lang.Object r8 = r2.b
            agtg r4 = defpackage.agtg.a
            int r5 = r2.d
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            java.lang.Object r2 = r2.a
            defpackage.agpl.b(r8)
            goto L47
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            defpackage.agpl.b(r8)
            ahni r8 = r7.j
            r2.a = r8
            r2.d = r6
            java.lang.Object r2 = r8.b(r2)
            if (r2 == r4) goto L8d
            r2 = r8
        L47:
            zdy r8 = defpackage.gwh.d     // Catch: java.lang.Throwable -> L88
            zeo r4 = r8.b()     // Catch: java.lang.Throwable -> L88
            r5 = 59
            zeo r4 = r4.q(r1, r0, r5, r3)     // Catch: java.lang.Throwable -> L88
            zdv r4 = (defpackage.zdv) r4     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = "Starting TokenUpdater."
            r4.u(r5)     // Catch: java.lang.Throwable -> L88
            ahdl r4 = r7.k     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L72
            zeo r8 = r8.b()     // Catch: java.lang.Throwable -> L88
            r4 = 61
            zeo r8 = r8.q(r1, r0, r4, r3)     // Catch: java.lang.Throwable -> L88
            zdv r8 = (defpackage.zdv) r8     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "TokenUpdater job already running. Ignoring start()."
            r8.u(r0)     // Catch: java.lang.Throwable -> L88
            agpu r8 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L88
            goto L84
        L72:
            ahbt r8 = r7.e     // Catch: java.lang.Throwable -> L88
            gwe r0 = new gwe     // Catch: java.lang.Throwable -> L88
            r1 = 0
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = 3
            ahdl r8 = defpackage.ahal.e(r8, r1, r3, r0, r4)     // Catch: java.lang.Throwable -> L88
            r7.k = r8     // Catch: java.lang.Throwable -> L88
            agpu r8 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L88
        L84:
            r2.d()
            return r8
        L88:
            r8 = move-exception
            r2.d()
            throw r8
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwh.b(agsw):java.lang.Object");
    }

    @Override // defpackage.gvy
    public final Map c() {
        return this.g;
    }

    @Override // defpackage.gvy
    public final void d(gvx gvxVar) {
        this.h.add(gvxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.gvz
            if (r0 == 0) goto L13
            r0 = r7
            gvz r0 = (defpackage.gvz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gvz r0 = new gvz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r7)
            goto L56
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.agpl.b(r7)
            goto L45
        L38:
            defpackage.agpl.b(r7)
            gtu r7 = r6.f
            r0.d = r4
            java.lang.Object r7 = r7.k(r0)
            if (r7 == r1) goto L87
        L45:
            gtu r2 = r6.f
            java.util.List r7 = (java.util.List) r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r0 = r2.j(r0)
            if (r0 == r1) goto L87
            r5 = r0
            r0 = r7
            r7 = r5
        L56:
            android.accounts.Account r7 = (android.accounts.Account) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L61:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            r3 = r2
            android.accounts.Account r3 = (android.accounts.Account) r3
            boolean r3 = defpackage.agvy.c(r3, r7)
            if (r3 != 0) goto L61
            r1.add(r2)
            goto L61
        L78:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            if (r7 == 0) goto L83
            r1 = 0
            r0.add(r1, r7)
        L83:
            r0.size()
            return r0
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwh.e(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:24:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.List r10, defpackage.agsw r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.gwa
            if (r0 == 0) goto L13
            r0 = r11
            gwa r0 = (defpackage.gwa) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            gwa r0 = new gwa
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            agtg r1 = defpackage.agtg.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.agpl.b(r11)
            goto L8e
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.agpl.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r4 = defpackage.agqq.i(r10, r2)
            r11.<init>(r4)
            java.util.Iterator r10 = r10.iterator()
        L47:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r10.next()
            android.accounts.Account r4 = (android.accounts.Account) r4
            ahbt r5 = r9.e
            gwb r6 = new gwb
            r7 = 0
            r6.<init>(r9, r4, r7)
            r4 = 3
            r8 = 0
            ahcb r4 = defpackage.ahal.d(r5, r7, r8, r6, r4)
            r11.add(r4)
            goto L47
        L65:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = defpackage.agqq.i(r11, r2)
            r10.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
            r2 = r11
        L73:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L96
            java.lang.Object r11 = r2.next()
            ahcb r11 = (defpackage.ahcb) r11
            r0.a = r10
            r0.b = r2
            r0.c = r10
            r0.f = r3
            java.lang.Object r11 = r11.a(r0)
            if (r11 == r1) goto L95
            r4 = r10
        L8e:
            gvv r11 = (defpackage.gvv) r11
            r10.add(r11)
            r10 = r4
            goto L73
        L95:
            return r1
        L96:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwh.f(java.util.List, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [ahni] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.agsw r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "stop"
            java.lang.String r1 = "com/google/android/apps/tvsearch/platform/account/auth/TokenUpdaterImpl"
            boolean r2 = r11 instanceof defpackage.gwf
            java.lang.String r3 = "TokenUpdaterImpl.kt"
            if (r2 == 0) goto L19
            r2 = r11
            gwf r2 = (defpackage.gwf) r2
            int r4 = r2.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r2.d = r4
            goto L1e
        L19:
            gwf r2 = new gwf
            r2.<init>(r10, r11)
        L1e:
            java.lang.Object r11 = r2.b
            agtg r4 = defpackage.agtg.a
            int r5 = r2.d
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L43
            if (r5 == r7) goto L3c
            if (r5 != r6) goto L34
            java.lang.Object r0 = r2.a
            defpackage.agpl.b(r11)     // Catch: java.lang.Throwable -> L32
            goto L8b
        L32:
            r11 = move-exception
            goto L98
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            java.lang.Object r5 = r2.a
            defpackage.agpl.b(r11)
            r11 = r5
            goto L52
        L43:
            defpackage.agpl.b(r11)
            ahni r11 = r10.j
            r2.a = r11
            r2.d = r7
            java.lang.Object r5 = r11.b(r2)
            if (r5 == r4) goto L9c
        L52:
            zdy r5 = defpackage.gwh.d     // Catch: java.lang.Throwable -> L94
            zeo r7 = r5.b()     // Catch: java.lang.Throwable -> L94
            r8 = 81
            zeo r7 = r7.q(r1, r0, r8, r3)     // Catch: java.lang.Throwable -> L94
            zdv r7 = (defpackage.zdv) r7     // Catch: java.lang.Throwable -> L94
            java.lang.String r8 = "Stopping TokenUpdater."
            r7.u(r8)     // Catch: java.lang.Throwable -> L94
            ahdl r7 = r10.k     // Catch: java.lang.Throwable -> L94
            if (r7 != 0) goto L80
            zeo r2 = r5.b()     // Catch: java.lang.Throwable -> L94
            r4 = 83
            zeo r0 = r2.q(r1, r0, r4, r3)     // Catch: java.lang.Throwable -> L94
            zdv r0 = (defpackage.zdv) r0     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "TokenUpdater job not running. Ignoring stop()."
            r0.u(r1)     // Catch: java.lang.Throwable -> L94
            agpu r0 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L94
            r11.d()
            return r0
        L80:
            r2.a = r11     // Catch: java.lang.Throwable -> L94
            r2.d = r6     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = defpackage.ahdp.a(r7, r2)     // Catch: java.lang.Throwable -> L94
            if (r0 == r4) goto L9c
            r0 = r11
        L8b:
            r11 = 0
            r10.k = r11     // Catch: java.lang.Throwable -> L32
            agpu r11 = defpackage.agpu.a     // Catch: java.lang.Throwable -> L32
            r0.d()
            return r11
        L94:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
        L98:
            r0.d()
            throw r11
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwh.g(agsw):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwh.h(agsw):java.lang.Object");
    }
}
