package defpackage;

import android.content.Context;
import android.os.FileObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihq implements yow {
    public final ijj a;
    public final ikt b;
    public final Runnable c;
    public final Context d;
    public FileObserver e;
    public final mdw f;
    private final /* synthetic */ yow g;
    private final ieh h;
    private final lfn i;

    public ihq(ieh iehVar, ijj ijjVar, lfn lfnVar, mdw mdwVar, ikt iktVar, Runnable runnable, Context context, yow yowVar) {
        this.g = yowVar;
        this.h = iehVar;
        this.a = ijjVar;
        this.i = lfnVar;
        this.f = mdwVar;
        this.b = iktVar;
        this.c = runnable;
        this.d = context;
        ykr.q(this, null, 0, new qf(this, (yih) null, 16), 3);
    }

    public final uhp a() {
        return wae.W(this, new gow(this, (yih) null, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.util.List r5, java.lang.String r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ihk
            if (r0 == 0) goto L13
            r0 = r7
            ihk r0 = (defpackage.ihk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ihk r0 = new ihk
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L27
            goto L55
        L27:
            r5 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r7)
            java.lang.String r7 = "Clearing domains: "
            java.lang.String r2 = " from cache"
            java.lang.String r7 = defpackage.a.cj(r5, r7, r2)     // Catch: java.lang.Exception -> L27
            defpackage.krd.b(r7)     // Catch: java.lang.Exception -> L27
            ijj r7 = r4.a     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r7.e(r5, r6, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L55
            return r1
        L4a:
            java.lang.String r6 = "Encountered error "
            java.lang.String r7 = " while clearing cache by domain"
            java.lang.String r5 = defpackage.a.cj(r5, r6, r7)
            defpackage.krd.c(r5)
        L55:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihq.b(java.util.List, java.lang.String, yih):java.lang.Object");
    }

    @Override // defpackage.yow
    public final yil c() {
        return this.g.c();
    }

    public final Object d(long j, yih yihVar) {
        Object objF = this.a.f(j, yihVar);
        return objF == yio.a ? objF : ygi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        if (d(r7, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bb -> B:31:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.inl r11, defpackage.yih r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ihl
            if (r0 == 0) goto L13
            r0 = r12
            ihl r0 = (defpackage.ihl) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ihl r0 = new ihl
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.e
            yio r1 = defpackage.yio.a
            int r2 = r0.g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            int r11 = r0.d
            int r2 = r0.c
            int r4 = r0.b
            ijg r5 = r0.h
            java.lang.Object r6 = r0.a
            java.util.Iterator r6 = (java.util.Iterator) r6
            defpackage.ybn.f(r12)
            goto Lbe
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L42:
            int r11 = r0.d
            int r2 = r0.c
            int r4 = r0.b
            defpackage.ybn.f(r12)
            goto L95
        L4c:
            java.lang.Object r11 = r0.a
            inl r11 = (defpackage.inl) r11
            defpackage.ybn.f(r12)
            goto L61
        L54:
            defpackage.ybn.f(r12)
            r0.a = r11
            r0.g = r5
            java.lang.Object r12 = r10.f(r0)
            if (r12 == r1) goto Lc9
        L61:
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            lfn r2 = r10.i
            int r2 = r2.H()
            byte[] r11 = r11.h()
            int r11 = r11.length
            int r5 = r12 + r11
            if (r5 <= r2) goto Lc6
            java.lang.String r5 = "Cache size is "
            java.lang.String r6 = ". Initiating cache cleanup"
            java.lang.String r5 = defpackage.a.cd(r12, r5, r6)
            defpackage.krd.b(r5)
            r5 = 0
            r0.a = r5
            r0.b = r12
            r0.c = r2
            r0.d = r11
            r0.g = r4
            java.lang.Object r4 = r10.g(r0)
            if (r4 == r1) goto Lc9
            r9 = r4
            r4 = r12
            r12 = r9
        L95:
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r12 = r12.iterator()
            r6 = r12
        L9c:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto Lc6
            java.lang.Object r12 = r6.next()
            r5 = r12
            ijg r5 = (defpackage.ijg) r5
            long r7 = r5.a
            r0.a = r6
            r0.h = r5
            r0.b = r4
            r0.c = r2
            r0.d = r11
            r0.g = r3
            java.lang.Object r12 = r10.d(r7, r0)
            if (r12 != r1) goto Lbe
            goto Lc9
        Lbe:
            int r12 = r5.b
            int r4 = r4 - r12
            int r12 = r4 + r11
            if (r12 < r2) goto Lc6
            goto L9c
        Lc6:
            ygi r11 = defpackage.ygi.a
            return r11
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihq.e(inl, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ihm
            if (r0 == 0) goto L13
            r0 = r5
            ihm r0 = (defpackage.ihm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ihm r0 = new ihm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            ijj r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 == r1) goto L4c
        L3c:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L45
            int r5 = r5.intValue()
            goto L46
        L45:
            r5 = 0
        L46:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihq.f(yih):java.lang.Object");
    }

    public final Object g(yih yihVar) {
        return this.a.j(yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.inl r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihq.h(inl, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.ink r12, defpackage.inl r13, defpackage.wlp r14, defpackage.yih r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihq.i(ink, inl, wlp, yih):java.lang.Object");
    }

    public final String j() {
        return ((ksn) ((ldy) this.h).a().g()).a;
    }
}
