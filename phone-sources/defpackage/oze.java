package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oze {
    public static final tvn a = tvn.n("GnpSdk");
    public final xbw b;
    public final xbw c;
    public final yil d;
    public final Context e;
    public final qjl f;
    public final qjl g;
    public final qjl h;
    public final qjl i;

    public oze(xbw xbwVar, xbw xbwVar2, yil yilVar, Context context, Map map, osk oskVar) {
        xbwVar.getClass();
        xbwVar2.getClass();
        map.getClass();
        oskVar.getClass();
        this.b = xbwVar;
        this.c = xbwVar2;
        this.d = yilVar;
        this.e = context;
        yfo yfoVar = (yfo) map.get("GK_ONEOFF_SYNC");
        qjl qjlVar = yfoVar != null ? (qjl) yfoVar.b() : null;
        if (qjlVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f = qjlVar;
        yfo yfoVar2 = (yfo) map.get("GK_PERIODIC_SYNC");
        qjl qjlVar2 = yfoVar2 != null ? (qjl) yfoVar2.b() : null;
        if (qjlVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.g = qjlVar2;
        yfo yfoVar3 = (yfo) map.get("GK_STORAGE_CLEANUP");
        qjl qjlVar3 = yfoVar3 != null ? (qjl) yfoVar3.b() : null;
        if (qjlVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.h = qjlVar3;
        yfo yfoVar4 = (yfo) map.get("GK_PERMISSIONS_STATE_LOGGING");
        this.i = yfoVar4 != null ? (qjl) yfoVar4.b() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ozc
            if (r0 == 0) goto L13
            r0 = r8
            ozc r0 = (defpackage.ozc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ozc r0 = new ozc
            r0.<init>(r7, r8)
        L18:
            r5 = r0
            java.lang.Object r8 = r5.a
            yio r0 = defpackage.yio.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ybn.f(r8)
            goto L57
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            defpackage.ybn.f(r8)
            xgp r8 = defpackage.xgp.a
            xgq r8 = r8.get()
            boolean r8 = r8.g()
            if (r8 == 0) goto L5b
            xbw r8 = r7.b
            java.lang.Object r8 = r8.b()
            r1 = r8
            qjm r1 = (defpackage.qjm) r1
            r8 = r2
            qjl r2 = r7.f
            r5.c = r8
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r8 = defpackage.osk.S(r1, r2, r3, r4, r5, r6)
            if (r8 == r0) goto L5a
        L57:
            qdl r8 = (defpackage.qdl) r8
            goto L5b
        L5a:
            return r0
        L5b:
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oze.a(yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ozd
            if (r0 == 0) goto L13
            r0 = r10
            ozd r0 = (defpackage.ozd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ozd r0 = new ozd
            r0.<init>(r9, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.b
            yio r0 = defpackage.yio.a
            int r1 = r5.d
            r7 = 3
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L3c
            if (r1 == r8) goto L36
            if (r1 != r7) goto L2e
            defpackage.ybn.f(r10)
            goto L8d
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.Object r1 = r5.a
            defpackage.ybn.f(r10)
            goto L74
        L3c:
            java.lang.Object r1 = r5.a
            defpackage.ybn.f(r10)
            goto L62
        L42:
            defpackage.ybn.f(r10)
            xbw r10 = r9.b
            java.lang.Object r10 = r10.b()
            r10.getClass()
            r1 = r2
            qjl r2 = r9.g
            qjm r10 = (defpackage.qjm) r10
            r5.a = r10
            r5.d = r1
            r4 = 0
            r6 = 14
            r3 = 0
            r1 = r10
            java.lang.Object r10 = defpackage.osk.S(r1, r2, r3, r4, r5, r6)
            if (r10 == r0) goto L92
        L62:
            qdl r10 = (defpackage.qdl) r10
            qjl r2 = r9.h
            r5.a = r1
            r5.d = r8
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.osk.S(r1, r2, r3, r4, r5, r6)
            if (r10 == r0) goto L92
        L74:
            qdl r10 = (defpackage.qdl) r10
            qjl r2 = r9.i
            if (r2 == 0) goto L8f
            boolean r10 = defpackage.pdu.a
            if (r10 == 0) goto L8f
            r10 = 0
            r5.a = r10
            r5.d = r7
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.osk.S(r1, r2, r3, r4, r5, r6)
            if (r10 == r0) goto L92
        L8d:
            qdl r10 = (defpackage.qdl) r10
        L8f:
            ygi r10 = defpackage.ygi.a
            return r10
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oze.b(yih):java.lang.Object");
    }
}
