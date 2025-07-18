package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dss {
    final /* synthetic */ dst a;
    private final Map b = new LinkedHashMap();

    public dss(dst dstVar) {
        this.a = dstVar;
    }

    public final dsn a(String str) {
        return (dsn) this.b.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r5, java.lang.String r6, defpackage.yih r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dsq
            if (r0 == 0) goto L13
            r0 = r7
            dsq r0 = (defpackage.dsq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsq r0 = new dsq
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.d
            defpackage.ybn.f(r7)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r7)
            dst r7 = r4.a
            r0.d = r6
            r0.c = r3
            czt r7 = r7.c
            java.lang.Object r7 = r7.e(r5, r6, r0)
            if (r7 == r1) goto L64
        L42:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            java.util.Map r7 = r4.b
            java.lang.Object r6 = r7.get(r6)
            dsn r6 = (defpackage.dsn) r6
            r7 = 0
            if (r6 == 0) goto L5e
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.f
            boolean r6 = r6.get()
            if (r6 == 0) goto L5e
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r7
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dss.b(android.content.Context, java.lang.String, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.content.Context r8, defpackage.dsn r9, defpackage.yih r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dsr
            if (r0 == 0) goto L13
            r0 = r10
            dsr r0 = (defpackage.dsr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dsr r0 = new dsr
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ybn.f(r10)
            goto La4
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.a
            defpackage.ybn.f(r10)
            goto L6d
        L39:
            defpackage.ybn.f(r10)
            java.util.Map r10 = r7.b
            java.lang.String r2 = r9.e
            java.lang.Object r10 = r10.put(r2, r9)
            dsn r10 = (defpackage.dsn) r10
            if (r10 == 0) goto L4b
            r10.p()
        L4b:
            dst r10 = r7.a
            gpo r5 = new gpo
            java.lang.Class r6 = r10.a
            r5.<init>(r6)
            yjz r6 = r10.b
            java.lang.Object r9 = r6.a(r10, r9)
            gox r9 = (defpackage.gox) r9
            r5.e(r9)
            cvi r9 = r5.f()
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = defpackage.czt.h(r8, r2, r4, r9, r0)
            if (r9 == r1) goto La7
        L6d:
            dst r9 = r7.a
            r10 = 0
            r0.a = r10
            r0.d = r3
            gpo r10 = new gpo
            java.lang.Class r9 = r9.a
            r10.<init>(r9)
            r4 = 3650(0xe42, double:1.8033E-320)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r10.d(r4, r9)
            gos r9 = new gos
            r9.<init>()
            r9.b()
            gou r9 = r9.a()
            r10.c(r9)
            cvi r9 = r10.f()
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r10 = "sessionWorkerKeepEnabled"
            java.lang.Object r8 = defpackage.czt.h(r8, r10, r3, r9, r0)
            if (r8 == r1) goto La1
            ygi r8 = defpackage.ygi.a
        La1:
            if (r8 != r1) goto La4
            goto La7
        La4:
            ygi r8 = defpackage.ygi.a
            return r8
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dss.c(android.content.Context, dsn, yih):java.lang.Object");
    }

    public final Object d(String str) {
        dsn dsnVar = (dsn) this.b.remove(str);
        if (dsnVar != null) {
            dsnVar.p();
        }
        return ygi.a;
    }
}
