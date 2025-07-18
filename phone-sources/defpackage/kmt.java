package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmt extends icu implements iej, kmo {
    private long g;
    private final ksf h;
    private final ihq i;
    private final kw j;
    private final obl k;

    public kmt(kw kwVar, obl oblVar, ihq ihqVar) {
        oblVar.getClass();
        ihqVar.getClass();
        this.j = kwVar;
        this.k = oblVar;
        this.i = ihqVar;
        this.g = -1L;
        ksf ksfVarA = ksf.a();
        this.h = ksfVarA;
        ksfVarA.ea(this);
    }

    private final void m(long j) {
        this.g = j;
        eb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (g(r1) == r2) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.kmo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r13, defpackage.yih r14) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r0 = "Sherlog ending session "
            boolean r1 = r14 instanceof defpackage.kmq
            if (r1 == 0) goto L15
            r1 = r14
            kmq r1 = (defpackage.kmq) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            kmq r1 = new kmq
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.b
            yio r2 = defpackage.yio.a
            int r3 = r1.d
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L40
            if (r3 == r5) goto L37
            if (r3 != r4) goto L2f
            java.lang.Object r13 = r1.a
            defpackage.ybn.f(r14)     // Catch: java.lang.Exception -> L3d
            goto La2
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            java.lang.Object r13 = r1.a
            defpackage.ybn.f(r14)     // Catch: java.lang.Exception -> L3d
            goto L86
        L3d:
            r0 = move-exception
            r14 = r0
            goto L91
        L40:
            defpackage.ybn.f(r14)
            boolean r14 = r12.d()     // Catch: java.lang.Exception -> L3d
            if (r14 != 0) goto L4c
            ygi r13 = defpackage.ygi.a     // Catch: java.lang.Exception -> L3d
            return r13
        L4c:
            long r6 = r12.g     // Catch: java.lang.Exception -> L3d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3d
            r14.<init>(r0)     // Catch: java.lang.Exception -> L3d
            r14.append(r6)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = "..."
            r14.append(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L3d
            defpackage.krd.b(r14)     // Catch: java.lang.Exception -> L3d
            kw r7 = r12.j     // Catch: java.lang.Exception -> L3d
            long r8 = r12.g     // Catch: java.lang.Exception -> L3d
            obl r14 = r12.k     // Catch: java.lang.Exception -> L3d
            java.lang.Object r14 = r14.b     // Catch: java.lang.Exception -> L3d
            r1.a = r13     // Catch: java.lang.Exception -> L3d
            r1.d = r5     // Catch: java.lang.Exception -> L3d
            yot r0 = defpackage.ypk.a     // Catch: java.lang.Exception -> L3d
            yya r0 = defpackage.yya.a     // Catch: java.lang.Exception -> L3d
            ine r6 = new ine     // Catch: java.lang.Exception -> L3d
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L3d
            r11 = 0
            r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r14 = defpackage.ykr.l(r0, r6, r1)     // Catch: java.lang.Exception -> L3d
            if (r14 == r2) goto L83
            ygi r14 = defpackage.ygi.a     // Catch: java.lang.Exception -> L3d
        L83:
            if (r14 != r2) goto L86
            goto L90
        L86:
            r1.a = r13     // Catch: java.lang.Exception -> L3d
            r1.d = r4     // Catch: java.lang.Exception -> L3d
            java.lang.Object r13 = r12.g(r1)     // Catch: java.lang.Exception -> L3d
            if (r13 != r2) goto La2
        L90:
            return r2
        L91:
            java.lang.String r0 = "Failed to end Sherlog logging"
            defpackage.krd.d(r0, r14)
            android.content.Context r13 = (android.content.Context) r13
            r14 = 2132018651(0x7f1405db, float:1.9675615E38)
            android.widget.Toast r13 = android.widget.Toast.makeText(r13, r14, r5)
            r13.show()
        La2:
            ygi r13 = defpackage.ygi.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmt.a(android.content.Context, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r0 == r5) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.kmo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r18, defpackage.yih r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmt.b(android.content.Context, yih):java.lang.Object");
    }

    @Override // defpackage.kmo
    public final void c(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.sherlog_menu, menu);
    }

    @Override // defpackage.kmo
    public final boolean d() {
        return this.g != -1;
    }

    @Override // defpackage.iej
    public final void dM() {
        m(-1L);
        eb();
    }

    @Override // defpackage.kmo
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.yih r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.kmp
            if (r0 == 0) goto L13
            r0 = r8
            kmp r0 = (defpackage.kmp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kmp r0 = new kmp
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kmt r0 = r0.d
            defpackage.ybn.f(r8)     // Catch: java.lang.Exception -> L38
            goto L6b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.ybn.f(r8)     // Catch: java.lang.Exception -> L38
            goto L4c
        L38:
            r8 = move-exception
            goto L75
        L3a:
            defpackage.ybn.f(r8)
            boolean r8 = r7.d()     // Catch: java.lang.Exception -> L38
            if (r8 == 0) goto L4c
            r0.c = r4     // Catch: java.lang.Exception -> L38
            java.lang.Object r8 = r7.g(r0)     // Catch: java.lang.Exception -> L38
            if (r8 != r1) goto L4c
            goto L69
        L4c:
            java.lang.String r8 = "Creating sherlog session"
            defpackage.krd.b(r8)     // Catch: java.lang.Exception -> L38
            kw r8 = r7.j     // Catch: java.lang.Exception -> L38
            r0.d = r7     // Catch: java.lang.Exception -> L38
            r0.c = r3     // Catch: java.lang.Exception -> L38
            yot r2 = defpackage.ypk.a     // Catch: java.lang.Exception -> L38
            yya r2 = defpackage.yya.a     // Catch: java.lang.Exception -> L38
            gow r3 = new gow     // Catch: java.lang.Exception -> L38
            r5 = 0
            r6 = 10
            r3.<init>(r8, r5, r6)     // Catch: java.lang.Exception -> L38
            java.lang.Object r8 = defpackage.ykr.l(r2, r3, r0)     // Catch: java.lang.Exception -> L38
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r7
        L6b:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Exception -> L38
            long r1 = r8.longValue()     // Catch: java.lang.Exception -> L38
            r0.m(r1)     // Catch: java.lang.Exception -> L38
            goto L7b
        L75:
            java.lang.String r0 = "Unable to create sherlog session"
            defpackage.krd.d(r0, r8)
            r4 = 0
        L7b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmt.f(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.yih r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.kmr
            if (r0 == 0) goto L13
            r0 = r7
            kmr r0 = (defpackage.kmr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kmr r0 = new kmr
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L27
            goto L4f
        L27:
            r7 = move-exception
            goto L7b
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.ybn.f(r7)
            boolean r7 = r6.d()     // Catch: java.lang.Exception -> L27
            if (r7 != 0) goto L3d
            ygi r7 = defpackage.ygi.a     // Catch: java.lang.Exception -> L27
            return r7
        L3d:
            java.lang.String r7 = "Sherlog releasing logs..."
            defpackage.krd.b(r7)     // Catch: java.lang.Exception -> L27
            kw r7 = r6.j     // Catch: java.lang.Exception -> L27
            long r4 = r6.g     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.A(r4, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "Links Received:"
            defpackage.krd.b(r0)     // Catch: java.lang.Exception -> L27
            java.util.Iterator r0 = r7.iterator()     // Catch: java.lang.Exception -> L27
        L5a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L27
            defpackage.krd.b(r1)     // Catch: java.lang.Exception -> L27
            goto L5a
        L6a:
            obl r0 = r6.k     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r0.a     // Catch: java.lang.Exception -> L27
            r1.addAll(r7)     // Catch: java.lang.Exception -> L27
            r1 = -1
            r6.m(r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r7 = ""
            r0.b = r7     // Catch: java.lang.Exception -> L27
            goto L80
        L7b:
            java.lang.String r0 = "Unable to end sherlog session and release logs"
            defpackage.krd.d(r0, r7)
        L80:
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmt.g(yih):java.lang.Object");
    }
}
